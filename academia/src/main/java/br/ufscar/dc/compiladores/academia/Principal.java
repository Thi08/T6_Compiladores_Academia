package br.ufscar.dc.compiladores.academia;

import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import br.ufscar.dc.compiladores.academia.TreinoParser.Lista_treinoContext;
import br.ufscar.dc.compiladores.academia.TreinoGeradorPDF;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class Principal {
    
    static CharStream cs;
    static TreinoLexer lexer;
    static CommonTokenStream tokens;
    static TreinoParser parser;
    static TreinoVisitor semantico;

    public static void main(String[] args) throws DocumentException {     
        try (PrintWriter pw = new PrintWriter(new File(args[1]))){
            if(lexer_parser(args[0], pw) && semantico(args[0], pw)){
                geradorPDF(args[0],args[1]);
            }
        } catch(IOException e){
            System.out.println("Falha na criação do arquivo de saída.");
        }
    }
    
    static boolean lexer_parser(String file, PrintWriter pw) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new TreinoLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new TreinoParser(tokens);
            
            // Remove a mensagem de erro padrão
            parser.removeErrorListeners();
            // Registra o error personalizado da analise lexica e sintatica
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.addErrorListener(mcel);
            // Roda a analise sintatica
            parser.lista_treino();
            return true;
        } catch (IOException e){
            System.out.println(e.toString());
            return false;
        }
    }
    
    static boolean semantico(String file, PrintWriter pw) throws IOException {
        try {
            cs = CharStreams.fromFileName(file);
            lexer = new TreinoLexer(cs);
            tokens = new CommonTokenStream(lexer);
            parser = new TreinoParser(tokens);
            // Percorre o código
            Lista_treinoContext arvore = parser.lista_treino();
            
            // Inicializa o analisador semântico
            TreinoSemantico semantico = new TreinoSemantico();
            
            // Percorre o código realizando a análise semântica
            semantico.visitLista_treino(arvore);
            
            // Escreve no arquivo os erros gerados na análise semântica
            TreinoSemanticoUtils.errosSemanticos.forEach((erro) -> pw.println(erro));
            
            pw.println("Fim da compilacao");
            
            if(TreinoSemanticoUtils.errosSemanticos.isEmpty()){
                return true;
            }
            return false;
        } catch (IOException e){
            System.out.println(e.toString());
            return false;
        }
    }


    static void geradorPDF(String file, String filePDF) throws IOException, DocumentException {
        if(TreinoSemanticoUtils.errosSemanticos.isEmpty()){
            try {
                cs = CharStreams.fromFileName(file);
                lexer = new TreinoLexer(cs);
                tokens = new CommonTokenStream(lexer);
                parser = new TreinoParser(tokens);
                Lista_treinoContext arvore = parser.lista_treino();
                TreinoGeradorPDF pdf = new TreinoGeradorPDF();
                
                // criação do objeto documento
                Document document = new Document();
                
                PdfWriter.getInstance(document, new FileOutputStream(filePDF+".pdf"));
                document.open();

                pdf.visitLista_treino(arvore);
                
                // adicionando um parágrafo ao documento
                document.add(new Paragraph(pdf.pdf.toString()));
                
                document.close();
            } catch (IOException e){
                System.out.println(e.toString());
            }
        }
    }
}
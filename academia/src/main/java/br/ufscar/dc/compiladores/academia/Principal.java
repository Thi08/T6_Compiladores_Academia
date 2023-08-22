package br.ufscar.dc.compiladores.academia;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import br.ufscar.dc.compiladores.academia.TreinoParser.Lista_treinoContext;

public class Principal {
    public static void main(String args[]) throws IOException {

        final PrintWriter pw = null;

        // Altera a saída do programa de acordo com a quantidade de argumentos
        if (args.length == 1) {
            //Um argumento
            pw = new PrintWriter(System.out);
            pw.println();
        } else if (args.length == 2) {
            //Dois argumentos
            try {
                pw = new PrintWriter(new File(args[1]));
            } catch (Exception e) {
                System.out.println("Falha ao abrir o arquivo");
                e.printStackTrace();
            }
        } else {
            return; //Finaliza o programa
        }


        //Depurar léxico
        
        CharStream cs = CharStreams.fromFileName(args[0]);
        TreinoLexer lex = new TreinoLexer(cs);
        boolean lexError = false;

        Token t = null;
        while ((t = lex.nextToken()).getType() != Token.EOF) {
            String nomeToken = TreinoLexer.VOCABULARY.getDisplayName(t.getType());
            
            // Mensagem de erro para qualquer simbolo não identificado. 
            // ERRO comentário não fechado
            if(nomeToken.equals("COMENTARIO_NAO_FECHADO")) {
                pw.println("Linha "+t.getLine()+": comentario nao fechado");
                lexError = true;
                break;
            }
            // ERRO - simbolo não identificado 
            else if(nomeToken.equals("ERRO")) {
                pw.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                lexError = true;
                break;
            }
            
        }

        //Depurar sintático

        if (lexError == false) {
            lex.reset();
    
            CommonTokenStream tokens = new CommonTokenStream(lex);
            TreinoParser parser = new TreinoParser(tokens);
    
            // Adicionando nosso ErrorListener customizado
            parser.removeErrorListeners();
            MyCustomErrorListener mcel = new MyCustomErrorListener(pw);
            parser.addErrorListener(mcel);
    
            parser.lista_treino();
        }
        
        // Depurar semântico
        
        // Realizar a análise semântica
        cs = CharStreams.fromFileName(args[0]);
        lex = new TreinoLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        TreinoParser parser = new TreinoParser(tokens);

        parser.removeErrorListeners();

        // Obtendo a árvore sintática
        Lista_treinoContext arvore = parser.lista_treino();
        TreinoSemantico as = new TreinoSemantico();

        // Realiza a visita semântica
        as.visitLista_treino(arvore);

        // Verificar se há erros semânticos
        for(String s: TreinoSemanticoUtils.errosSemanticos){
                pw.write(s);
            }

        //TreinoSemanticoUtils.errosSemanticos.forEach((s) -> pw.write(s));

        /*
        if(!TreinoSemanticoUtils.errosSemanticos.isEmpty()){

            // Imprimir os erros semânticos no arquivo
            for(String s: TreinoSemanticoUtils.errosSemanticos){
                pw.write(s);
            }
            pw.write("Fim da compilacao\n");
        }*/
        
        pw.write("Fim da compilacao\n");
        pw.close();
    }
}
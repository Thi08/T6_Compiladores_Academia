package br.ufscar.dc.compiladores.academia;

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Principal {

    public static void main(String[] args) {
        String arquivoSaida = args[1];
        try(PrintWriter pw = new PrintWriter(arquivoSaida)) {
            try {
                CharStream cs = CharStreams.fromFileName(args[0]);
                Treino lex = new Treino(cs);
    
                Token t = null;
                while ((t = lex.nextToken()).getType() != Token.EOF) {
                    String nomeToken = Treino.VOCABULARY.getDisplayName(t.getType());
                    System.out.print("<" + Treino.VOCABULARY.getDisplayName(t.getType())+","+ t.getText()+">");

                    // ERRO - simbolo não identificado 
                    if(nomeToken.equals("ERRO")) {
                        pw.println("Linha "+t.getLine()+": "+t.getText()+" - simbolo nao identificado");
                        break;
                    }
                    else {
                        pw.println("<'" + t.getText() + "'," + nomeToken  + ">");
                    }
                }
            } catch (IOException ex) {
            }
        } catch(FileNotFoundException fnfe) {
            System.err.println("O arquivo/diretório não existe:"+args[1]);
        }
    }
}
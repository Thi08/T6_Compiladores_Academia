package br.ufscar.dc.compiladores.academia;

import org.antlr.v4.runtime.ANTLRErrorListener; 
import org.antlr.v4.runtime.Token; 
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Parser;
import java.io.PrintWriter;
import java.util.BitSet;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

// Classe para customizar os erros gerados na analise lexica e sintatica
public class MyCustomErrorListener implements ANTLRErrorListener {
    PrintWriter pw;
    // pw é o arquivo de saída passado para a função
    public MyCustomErrorListener(PrintWriter pw) {
      this.pw = pw;
    }

    @Override
    public void	reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
    }
    
    @Override
    public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
    }

    @Override
    public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
    }
    
    // Verifica os erros, se é sintático ou semântico e grava no arquivo de saída a mensagem correspondente
    @Override
    public void	syntaxError(Recognizer<?,?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        // Verifica o token que ocorreu o erro
        Token t = (Token) offendingSymbol;
        
        switch(TreinoLexer.VOCABULARY.getDisplayName(t.getType())) {
            // Verifica erros gerais que não são especificados por nenhuma outra regra léxica
            case "ERRO":
              pw.println("Linha " + line + ": " + t.getText() + " - simbolo nao identificado");
              return;
            default:
                if(!t.getText().equals("<EOF>")){
                    pw.println("Linha "+line+": erro sintatico proximo a "+t.getText());
                }
        }
    }
}
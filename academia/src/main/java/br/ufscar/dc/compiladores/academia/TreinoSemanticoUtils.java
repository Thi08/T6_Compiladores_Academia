package br.ufscar.dc.compiladores.academia;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

public class TreinoSemanticoUtils {
    // Inicializa a lista de erros semânticos
    public static List<String> errosSemanticos = new ArrayList<>();
    
    // adiciona erro semântico na lista de erros
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
}
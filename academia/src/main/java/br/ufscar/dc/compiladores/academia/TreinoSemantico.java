package br.ufscar.dc.compiladores.academia;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;
import br.ufscar.dc.compiladores.academia.TabelaDeSimbolos;

public class TreinoSemantico extends TreinoBaseVisitor<Void> {

    Escopos escopo = new Escopos();
    
    /*
        Verifica se já existe um item com o nome no escopo
    */
    @Override
    public Void visitNome(TreinoParser.NomeContext ctx) {
        TabelaDeSimbolos escopoAtual = escopo.obterEscopoAtual();
        
        if(!escopoAtual.existe(ctx.getText())){
            escopoAtual.inserir(ctx.getText());
        } else {
            String mensagem = String.format("Exercicio %s ja existe na lista de treino\n", ctx.getText());
            TreinoSemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        return null;
    }

}
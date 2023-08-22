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
            String mensagem = String.format("Exercicio %s já existe na lista de treino\n", ctx.getText());
            TreinoSemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        return null;
    }
    
    /*
        Verifica se valor é do tipo inteiro ou real
    */
    @Override
    public Void visitExercicio(TreinoParser.ExercicioContext ctx) {
        if(ctx.series().NUM_INT() == null && ctx.repeticoes().NUM_INT() == null){
            String mensagem = String.format("O número de series/repetições está errado\n");
            TreinoSemanticoUtils.adicionarErroSemantico(ctx.start, mensagem);
        }
        return super.visitExercicio(ctx);
    }
}
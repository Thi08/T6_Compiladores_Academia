package br.ufscar.dc.compiladores.academia;

import static java.lang.Float.parseFloat;
import java.util.Map.Entry;

public class TreinoGeradorPDF extends TreinoBaseVisitor<Void> {

    public static StringBuilder pdf = new StringBuilder();
    TabelaDeSimbolos tds = new TabelaDeSimbolos();

    @Override
    public Void visitLista_treino(TreinoParser.Lista_treinoContext ctx) {
        pdf.append("Lista Treino").append("\n").append("\n");
        
        visitLista_peito(ctx.lista_peito());
        visitLista_triceps(ctx.lista_triceps());
        visitLista_costas(ctx.lista_costas());
        visitLista_biceps(ctx.lista_biceps());
        visitLista_pernas(ctx.lista_pernas());
        visitLista_ombros(ctx.lista_ombros());
        return null; 
    }
    
    @Override
    public Void visitLista_peito(TreinoParser.Lista_peitoContext ctx) {
        pdf.append("Peito:").append("\n");
        ctx.exercicio().forEach(exercicio -> {
            visitExercicio(exercicio);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_triceps(TreinoParser.Lista_tricepsContext ctx) {
        pdf.append("Triceps:").append("\n");
        ctx.exercicio().forEach(exercicio -> {
            visitExercicio(exercicio);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_costas(TreinoParser.Lista_costasContext ctx) {
        pdf.append("Costas:").append("\n");
        ctx.exercicio().forEach(exercicio -> {
            visitExercicio(exercicio);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_biceps(TreinoParser.Lista_bicepsContext ctx) {
        pdf.append("Biceps:").append("\n");
        ctx.exercicio().forEach(exercicio -> {
            visitExercicio(exercicio);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_pernas(TreinoParser.Lista_pernasContext ctx) {
        pdf.append("Pernas:").append("\n");
        ctx.exercicio().forEach(exercicio -> {
            visitExercicio(exercicio);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitLista_ombros(TreinoParser.Lista_ombrosContext ctx) {
        pdf.append("Ombros:").append("\n");
        ctx.exercicio().forEach(exercicio -> {
            visitExercicio(exercicio);
        });
        pdf.append("\n");
        return null;
    }
    
    @Override
    public Void visitExercicio(TreinoParser.ExercicioContext ctx) {
        pdf.append(ctx.nome().getText() + ", " + ctx.series().getText() + " - " + ctx.repeticoes().getText()).append("\n");
        return null; 
    }
    

}
// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.academia;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TreinoParser}.
 */
public interface TreinoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TreinoParser#lista_treino}.
	 * @param ctx the parse tree
	 */
	void enterLista_treino(TreinoParser.Lista_treinoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#lista_treino}.
	 * @param ctx the parse tree
	 */
	void exitLista_treino(TreinoParser.Lista_treinoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#lista_peito}.
	 * @param ctx the parse tree
	 */
	void enterLista_peito(TreinoParser.Lista_peitoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#lista_peito}.
	 * @param ctx the parse tree
	 */
	void exitLista_peito(TreinoParser.Lista_peitoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#lista_triceps}.
	 * @param ctx the parse tree
	 */
	void enterLista_triceps(TreinoParser.Lista_tricepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#lista_triceps}.
	 * @param ctx the parse tree
	 */
	void exitLista_triceps(TreinoParser.Lista_tricepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#lista_costas}.
	 * @param ctx the parse tree
	 */
	void enterLista_costas(TreinoParser.Lista_costasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#lista_costas}.
	 * @param ctx the parse tree
	 */
	void exitLista_costas(TreinoParser.Lista_costasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#lista_biceps}.
	 * @param ctx the parse tree
	 */
	void enterLista_biceps(TreinoParser.Lista_bicepsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#lista_biceps}.
	 * @param ctx the parse tree
	 */
	void exitLista_biceps(TreinoParser.Lista_bicepsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#lista_pernas}.
	 * @param ctx the parse tree
	 */
	void enterLista_pernas(TreinoParser.Lista_pernasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#lista_pernas}.
	 * @param ctx the parse tree
	 */
	void exitLista_pernas(TreinoParser.Lista_pernasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#lista_ombros}.
	 * @param ctx the parse tree
	 */
	void enterLista_ombros(TreinoParser.Lista_ombrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#lista_ombros}.
	 * @param ctx the parse tree
	 */
	void exitLista_ombros(TreinoParser.Lista_ombrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#exercicio}.
	 * @param ctx the parse tree
	 */
	void enterExercicio(TreinoParser.ExercicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#exercicio}.
	 * @param ctx the parse tree
	 */
	void exitExercicio(TreinoParser.ExercicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#nome}.
	 * @param ctx the parse tree
	 */
	void enterNome(TreinoParser.NomeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#nome}.
	 * @param ctx the parse tree
	 */
	void exitNome(TreinoParser.NomeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#series}.
	 * @param ctx the parse tree
	 */
	void enterSeries(TreinoParser.SeriesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#series}.
	 * @param ctx the parse tree
	 */
	void exitSeries(TreinoParser.SeriesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TreinoParser#repeticoes}.
	 * @param ctx the parse tree
	 */
	void enterRepeticoes(TreinoParser.RepeticoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TreinoParser#repeticoes}.
	 * @param ctx the parse tree
	 */
	void exitRepeticoes(TreinoParser.RepeticoesContext ctx);
}
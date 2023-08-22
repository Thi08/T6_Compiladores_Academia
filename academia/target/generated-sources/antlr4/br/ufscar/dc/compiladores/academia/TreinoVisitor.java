// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.academia;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TreinoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TreinoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TreinoParser#lista_treino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_treino(TreinoParser.Lista_treinoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#lista_peito}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_peito(TreinoParser.Lista_peitoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#lista_triceps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_triceps(TreinoParser.Lista_tricepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#lista_costas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_costas(TreinoParser.Lista_costasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#lista_biceps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_biceps(TreinoParser.Lista_bicepsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#lista_pernas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_pernas(TreinoParser.Lista_pernasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#lista_ombros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_ombros(TreinoParser.Lista_ombrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#exercicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExercicio(TreinoParser.ExercicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#nome}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNome(TreinoParser.NomeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#series}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeries(TreinoParser.SeriesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TreinoParser#repeticoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeticoes(TreinoParser.RepeticoesContext ctx);
}
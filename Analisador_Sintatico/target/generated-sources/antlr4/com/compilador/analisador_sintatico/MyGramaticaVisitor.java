// Generated from com\compilador\analisador_sintatico\MyGramatica.g4 by ANTLR 4.7.2
package com.compilador.analisador_sintatico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyGramaticaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyGramaticaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracoes(MyGramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao(MyGramaticaParser.DeclaracaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#listaInstrucoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaInstrucoes(MyGramaticaParser.ListaInstrucoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#instrucao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucao(MyGramaticaParser.InstrucaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MyGramaticaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressaoAritmetica(MyGramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(MyGramaticaParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(MyGramaticaParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#instrucaoAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoAtribuicao(MyGramaticaParser.InstrucaoAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#instrucaoEntrada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoEntrada(MyGramaticaParser.InstrucaoEntradaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyGramaticaParser#instrucaoSaida}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucaoSaida(MyGramaticaParser.InstrucaoSaidaContext ctx);
}
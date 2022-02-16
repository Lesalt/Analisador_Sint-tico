// Generated from com\compilador\analisador_sintatico\MyGramatica.g4 by ANTLR 4.7.2
package com.compilador.analisador_sintatico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyGramaticaParser}.
 */
public interface MyGramaticaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracoes(MyGramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#listaDeclaracoes}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracoes(MyGramaticaParser.ListaDeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(MyGramaticaParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#declaracao}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(MyGramaticaParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#listaInstrucoes}.
	 * @param ctx the parse tree
	 */
	void enterListaInstrucoes(MyGramaticaParser.ListaInstrucoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#listaInstrucoes}.
	 * @param ctx the parse tree
	 */
	void exitListaInstrucoes(MyGramaticaParser.ListaInstrucoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(MyGramaticaParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(MyGramaticaParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyGramaticaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyGramaticaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(MyGramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(MyGramaticaParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(MyGramaticaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(MyGramaticaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(MyGramaticaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(MyGramaticaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#instrucaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoAtribuicao(MyGramaticaParser.InstrucaoAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#instrucaoAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoAtribuicao(MyGramaticaParser.InstrucaoAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#instrucaoEntrada}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoEntrada(MyGramaticaParser.InstrucaoEntradaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#instrucaoEntrada}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoEntrada(MyGramaticaParser.InstrucaoEntradaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyGramaticaParser#instrucaoSaida}.
	 * @param ctx the parse tree
	 */
	void enterInstrucaoSaida(MyGramaticaParser.InstrucaoSaidaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyGramaticaParser#instrucaoSaida}.
	 * @param ctx the parse tree
	 */
	void exitInstrucaoSaida(MyGramaticaParser.InstrucaoSaidaContext ctx);
}
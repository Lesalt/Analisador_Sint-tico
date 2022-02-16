// Generated from com\compilador\analisador_sintatico\MyGramatica.g4 by ANTLR 4.7.2
package com.compilador.analisador_sintatico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TIPO_VAR=9, 
		NUM_INTER=10, NUM_DEC=11, VAR=12, OpLog=13, OpArit1=14, OpArit2=15, OpCond=16;
	public static final int
		RULE_listaDeclaracoes = 0, RULE_declaracao = 1, RULE_listaInstrucoes = 2, 
		RULE_instrucao = 3, RULE_program = 4, RULE_expressaoAritmetica = 5, RULE_termo = 6, 
		RULE_fator = 7, RULE_instrucaoAtribuicao = 8, RULE_instrucaoEntrada = 9, 
		RULE_instrucaoSaida = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"listaDeclaracoes", "declaracao", "listaInstrucoes", "instrucao", "program", 
			"expressaoAritmetica", "termo", "fator", "instrucaoAtribuicao", "instrucaoEntrada", 
			"instrucaoSaida"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'^'", "'DECLARACOES'", "'ALGORITMOS'", "'SET'", "'='", 
			"'rec'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "TIPO_VAR", "NUM_INTER", 
			"NUM_DEC", "VAR", "OpLog", "OpArit1", "OpArit2", "OpCond"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ListaDeclaracoesContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaDeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterListaDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitListaDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitListaDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracoesContext listaDeclaracoes() throws RecognitionException {
		ListaDeclaracoesContext _localctx = new ListaDeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_listaDeclaracoes);
		try {
			setState(26);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				declaracao();
				setState(23);
				listaDeclaracoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				declaracao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MyGramaticaParser.VAR, 0); }
		public TerminalNode TIPO_VAR() { return getToken(MyGramaticaParser.TIPO_VAR, 0); }
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitDeclaracao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitDeclaracao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			match(VAR);
			setState(29);
			match(T__0);
			setState(30);
			match(TIPO_VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaInstrucoesContext extends ParserRuleContext {
		public InstrucaoContext instrucao() {
			return getRuleContext(InstrucaoContext.class,0);
		}
		public ListaInstrucoesContext listaInstrucoes() {
			return getRuleContext(ListaInstrucoesContext.class,0);
		}
		public ListaInstrucoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaInstrucoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterListaInstrucoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitListaInstrucoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitListaInstrucoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaInstrucoesContext listaInstrucoes() throws RecognitionException {
		ListaInstrucoesContext _localctx = new ListaInstrucoesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_listaInstrucoes);
		try {
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				instrucao();
				setState(33);
				listaInstrucoes();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				instrucao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoContext extends ParserRuleContext {
		public InstrucaoAtribuicaoContext instrucaoAtribuicao() {
			return getRuleContext(InstrucaoAtribuicaoContext.class,0);
		}
		public InstrucaoEntradaContext instrucaoEntrada() {
			return getRuleContext(InstrucaoEntradaContext.class,0);
		}
		public InstrucaoSaidaContext instrucaoSaida() {
			return getRuleContext(InstrucaoSaidaContext.class,0);
		}
		public InstrucaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterInstrucao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitInstrucao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitInstrucao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoContext instrucao() throws RecognitionException {
		InstrucaoContext _localctx = new InstrucaoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instrucao);
		try {
			setState(41);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				instrucaoAtribuicao();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				instrucaoEntrada();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				instrucaoSaida();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public ListaDeclaracoesContext listaDeclaracoes() {
			return getRuleContext(ListaDeclaracoesContext.class,0);
		}
		public ListaInstrucoesContext listaInstrucoes() {
			return getRuleContext(ListaInstrucoesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__1);
			setState(44);
			match(T__2);
			setState(45);
			listaDeclaracoes();
			setState(46);
			match(T__1);
			setState(47);
			match(T__3);
			setState(48);
			listaInstrucoes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoAritmeticaContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode OpArit2() { return getToken(MyGramaticaParser.OpArit2, 0); }
		public ExpressaoAritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressaoAritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterExpressaoAritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitExpressaoAritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitExpressaoAritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoAritmeticaContext expressaoAritmetica() throws RecognitionException {
		return expressaoAritmetica(0);
	}

	private ExpressaoAritmeticaContext expressaoAritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressaoAritmeticaContext _localctx = new ExpressaoAritmeticaContext(_ctx, _parentState);
		ExpressaoAritmeticaContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expressaoAritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(51);
			termo(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressaoAritmeticaContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressaoAritmetica);
					setState(53);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(54);
					match(OpArit2);
					setState(55);
					termo(0);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode OpArit2() { return getToken(MyGramaticaParser.OpArit2, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		return termo(0);
	}

	private TermoContext termo(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermoContext _localctx = new TermoContext(_ctx, _parentState);
		TermoContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_termo, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			fator();
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermoContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_termo);
					setState(64);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(65);
					match(OpArit2);
					setState(66);
					fator();
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public TerminalNode NUM_INTER() { return getToken(MyGramaticaParser.NUM_INTER, 0); }
		public TerminalNode NUM_DEC() { return getToken(MyGramaticaParser.NUM_DEC, 0); }
		public TerminalNode VAR() { return getToken(MyGramaticaParser.VAR, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_INTER) | (1L << NUM_DEC) | (1L << VAR))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoAtribuicaoContext extends ParserRuleContext {
		public ExpressaoAritmeticaContext expressaoAritmetica() {
			return getRuleContext(ExpressaoAritmeticaContext.class,0);
		}
		public TerminalNode VAR() { return getToken(MyGramaticaParser.VAR, 0); }
		public InstrucaoAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterInstrucaoAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitInstrucaoAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitInstrucaoAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoAtribuicaoContext instrucaoAtribuicao() throws RecognitionException {
		InstrucaoAtribuicaoContext _localctx = new InstrucaoAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_instrucaoAtribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__4);
			setState(75);
			expressaoAritmetica(0);
			setState(76);
			match(T__5);
			setState(77);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoEntradaContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MyGramaticaParser.VAR, 0); }
		public InstrucaoEntradaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoEntrada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterInstrucaoEntrada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitInstrucaoEntrada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitInstrucaoEntrada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoEntradaContext instrucaoEntrada() throws RecognitionException {
		InstrucaoEntradaContext _localctx = new InstrucaoEntradaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instrucaoEntrada);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__6);
			setState(80);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstrucaoSaidaContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MyGramaticaParser.VAR, 0); }
		public InstrucaoSaidaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucaoSaida; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).enterInstrucaoSaida(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGramaticaListener ) ((MyGramaticaListener)listener).exitInstrucaoSaida(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyGramaticaVisitor ) return ((MyGramaticaVisitor<? extends T>)visitor).visitInstrucaoSaida(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrucaoSaidaContext instrucaoSaida() throws RecognitionException {
		InstrucaoSaidaContext _localctx = new InstrucaoSaidaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instrucaoSaida);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(T__7);
			setState(83);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expressaoAritmetica_sempred((ExpressaoAritmeticaContext)_localctx, predIndex);
		case 6:
			return termo_sempred((TermoContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressaoAritmetica_sempred(ExpressaoAritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean termo_sempred(TermoContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22X\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\3\2\5\2\35\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4"+
		"\'\n\4\3\5\3\5\3\5\5\5,\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\b\3\b\3\b\3\b\3\b\3\b\7\bF\n\b\f"+
		"\b\16\bI\13\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\2\4\f\16\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\f\16\2R\2\34\3\2\2\2"+
		"\4\36\3\2\2\2\6&\3\2\2\2\b+\3\2\2\2\n-\3\2\2\2\f\64\3\2\2\2\16?\3\2\2"+
		"\2\20J\3\2\2\2\22L\3\2\2\2\24Q\3\2\2\2\26T\3\2\2\2\30\31\5\4\3\2\31\32"+
		"\5\2\2\2\32\35\3\2\2\2\33\35\5\4\3\2\34\30\3\2\2\2\34\33\3\2\2\2\35\3"+
		"\3\2\2\2\36\37\7\16\2\2\37 \7\3\2\2 !\7\13\2\2!\5\3\2\2\2\"#\5\b\5\2#"+
		"$\5\6\4\2$\'\3\2\2\2%\'\5\b\5\2&\"\3\2\2\2&%\3\2\2\2\'\7\3\2\2\2(,\5\22"+
		"\n\2),\5\24\13\2*,\5\26\f\2+(\3\2\2\2+)\3\2\2\2+*\3\2\2\2,\t\3\2\2\2-"+
		".\7\4\2\2./\7\5\2\2/\60\5\2\2\2\60\61\7\4\2\2\61\62\7\6\2\2\62\63\5\6"+
		"\4\2\63\13\3\2\2\2\64\65\b\7\1\2\65\66\5\16\b\2\66<\3\2\2\2\678\f\4\2"+
		"\289\7\21\2\29;\5\16\b\2:\67\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\r"+
		"\3\2\2\2><\3\2\2\2?@\b\b\1\2@A\5\20\t\2AG\3\2\2\2BC\f\4\2\2CD\7\21\2\2"+
		"DF\5\20\t\2EB\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\17\3\2\2\2IG\3\2"+
		"\2\2JK\t\2\2\2K\21\3\2\2\2LM\7\7\2\2MN\5\f\7\2NO\7\b\2\2OP\7\16\2\2P\23"+
		"\3\2\2\2QR\7\t\2\2RS\7\16\2\2S\25\3\2\2\2TU\7\n\2\2UV\7\16\2\2V\27\3\2"+
		"\2\2\7\34&+<G";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
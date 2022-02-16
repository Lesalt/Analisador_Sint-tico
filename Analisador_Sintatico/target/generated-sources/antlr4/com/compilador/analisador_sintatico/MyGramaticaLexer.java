// Generated from com\compilador\analisador_sintatico\MyGramatica.g4 by ANTLR 4.7.2
package com.compilador.analisador_sintatico;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, TIPO_VAR=9, 
		NUM_INTER=10, NUM_DEC=11, VAR=12, OpLog=13, OpArit1=14, OpArit2=15, OpCond=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "TIPO_VAR", 
			"NUM_INTER", "NUM_DEC", "VAR", "OpLog", "OpArit1", "OpArit2", "OpCond"
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


	public MyGramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nW\n\n\3"+
		"\13\6\13Z\n\13\r\13\16\13[\3\f\6\f_\n\f\r\f\16\f`\3\f\3\f\6\fe\n\f\r\f"+
		"\16\ff\5\fi\n\f\3\r\3\r\7\rm\n\r\f\r\16\rp\13\r\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\5\16x\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\5\21\u0087\n\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\7\4\2C\\c|\5\2\62;"+
		"C\\c|\4\2>>@@\4\2--//\4\2,,\61\61\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2"+
		"\t\63\3\2\2\2\13>\3\2\2\2\rB\3\2\2\2\17D\3\2\2\2\21H\3\2\2\2\23V\3\2\2"+
		"\2\25Y\3\2\2\2\27^\3\2\2\2\31j\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3\2"+
		"\2\2!\u0086\3\2\2\2#$\7<\2\2$\4\3\2\2\2%&\7`\2\2&\6\3\2\2\2\'(\7F\2\2"+
		"()\7G\2\2)*\7E\2\2*+\7N\2\2+,\7C\2\2,-\7T\2\2-.\7C\2\2./\7E\2\2/\60\7"+
		"Q\2\2\60\61\7G\2\2\61\62\7U\2\2\62\b\3\2\2\2\63\64\7C\2\2\64\65\7N\2\2"+
		"\65\66\7I\2\2\66\67\7Q\2\2\678\7T\2\289\7K\2\29:\7V\2\2:;\7O\2\2;<\7Q"+
		"\2\2<=\7U\2\2=\n\3\2\2\2>?\7U\2\2?@\7G\2\2@A\7V\2\2A\f\3\2\2\2BC\7?\2"+
		"\2C\16\3\2\2\2DE\7t\2\2EF\7g\2\2FG\7e\2\2G\20\3\2\2\2HI\7r\2\2IJ\7t\2"+
		"\2JK\7k\2\2KL\7p\2\2LM\7v\2\2M\22\3\2\2\2NO\7K\2\2OP\7p\2\2PQ\7v\2\2Q"+
		"R\7g\2\2RW\7t\2\2ST\7F\2\2TU\7g\2\2UW\7e\2\2VN\3\2\2\2VS\3\2\2\2W\24\3"+
		"\2\2\2XZ\4\62;\2YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\26\3\2\2\2"+
		"]_\4\62;\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ah\3\2\2\2bd\13\2\2"+
		"\2ce\4\62;\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hb\3\2\2"+
		"\2hi\3\2\2\2i\30\3\2\2\2jn\t\2\2\2km\t\3\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2o\32\3\2\2\2pn\3\2\2\2qx\t\4\2\2rs\7>\2\2sx\7?\2\2tu\7@"+
		"\2\2ux\7?\2\2vx\7?\2\2wq\3\2\2\2wr\3\2\2\2wt\3\2\2\2wv\3\2\2\2x\34\3\2"+
		"\2\2yz\t\5\2\2z\36\3\2\2\2{|\t\6\2\2| \3\2\2\2}~\7g\2\2~\177\7u\2\2\177"+
		"\u0087\7g\2\2\u0080\u0081\7u\2\2\u0081\u0082\7g\2\2\u0082\u0087\7p\2\2"+
		"\u0083\u0084\7g\2\2\u0084\u0085\7p\2\2\u0085\u0087\7s\2\2\u0086}\3\2\2"+
		"\2\u0086\u0080\3\2\2\2\u0086\u0083\3\2\2\2\u0087\"\3\2\2\2\13\2V[`fhn"+
		"w\u0086\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
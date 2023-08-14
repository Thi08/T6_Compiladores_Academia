// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.academia;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Treino extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TREINO=1, DE=2, PEITO=3, TRICEPS=4, COSTAS=5, BICEPS=6, PERNAS=7, OMBROS=8, 
		NUM_INT=9, CADEIA=10, COMENTARIO=11, WS=12, VIRGULA=13, ERRO=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TREINO", "DE", "PEITO", "TRICEPS", "COSTAS", "BICEPS", "PERNAS", "OMBROS", 
			"NUM_INT", "CADEIA", "ESC_SEQ", "COMENTARIO", "WS", "VIRGULA", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'treino'", "'-'", "'peito'", "'triceps'", "'costas'", "'biceps'", 
			"'pernas'", "'ombros'", null, null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TREINO", "DE", "PEITO", "TRICEPS", "COSTAS", "BICEPS", "PERNAS", 
			"OMBROS", "NUM_INT", "CADEIA", "COMENTARIO", "WS", "VIRGULA", "ERRO"
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


	public Treino(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Treino.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 11:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 12:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u000er\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\bT\b\b\u000b\b\f\bU\u0001"+
		"\t\u0001\t\u0005\tZ\b\t\n\t\f\t]\t\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0005\u000bd\b\u000b\n\u000b\f\u000bg\t\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0001\u0001\u0003\u0002\u0005\u0003"+
		"\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015"+
		"\u0000\u0017\u000b\u0019\f\u001b\r\u001d\u000e\u0001\u0000\u0004\u0002"+
		"\u0000AZaz\u0003\u0000  AZaz\u0003\u0000\n\n\r\r}}\u0003\u0000\t\n\r\r"+
		"  s\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000"+
		"\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000"+
		"\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000"+
		"\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000"+
		"\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0001"+
		"\u001f\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005(\u0001"+
		"\u0000\u0000\u0000\u0007.\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000"+
		"\u0000\u000b=\u0001\u0000\u0000\u0000\rD\u0001\u0000\u0000\u0000\u000f"+
		"K\u0001\u0000\u0000\u0000\u0011S\u0001\u0000\u0000\u0000\u0013W\u0001"+
		"\u0000\u0000\u0000\u0015^\u0001\u0000\u0000\u0000\u0017a\u0001\u0000\u0000"+
		"\u0000\u0019k\u0001\u0000\u0000\u0000\u001bn\u0001\u0000\u0000\u0000\u001d"+
		"p\u0001\u0000\u0000\u0000\u001f \u0005t\u0000\u0000 !\u0005r\u0000\u0000"+
		"!\"\u0005e\u0000\u0000\"#\u0005i\u0000\u0000#$\u0005n\u0000\u0000$%\u0005"+
		"o\u0000\u0000%\u0002\u0001\u0000\u0000\u0000&\'\u0005-\u0000\u0000\'\u0004"+
		"\u0001\u0000\u0000\u0000()\u0005p\u0000\u0000)*\u0005e\u0000\u0000*+\u0005"+
		"i\u0000\u0000+,\u0005t\u0000\u0000,-\u0005o\u0000\u0000-\u0006\u0001\u0000"+
		"\u0000\u0000./\u0005t\u0000\u0000/0\u0005r\u0000\u000001\u0005i\u0000"+
		"\u000012\u0005c\u0000\u000023\u0005e\u0000\u000034\u0005p\u0000\u0000"+
		"45\u0005s\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005c\u0000\u0000"+
		"78\u0005o\u0000\u000089\u0005s\u0000\u00009:\u0005t\u0000\u0000:;\u0005"+
		"a\u0000\u0000;<\u0005s\u0000\u0000<\n\u0001\u0000\u0000\u0000=>\u0005"+
		"b\u0000\u0000>?\u0005i\u0000\u0000?@\u0005c\u0000\u0000@A\u0005e\u0000"+
		"\u0000AB\u0005p\u0000\u0000BC\u0005s\u0000\u0000C\f\u0001\u0000\u0000"+
		"\u0000DE\u0005p\u0000\u0000EF\u0005e\u0000\u0000FG\u0005r\u0000\u0000"+
		"GH\u0005n\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005s\u0000\u0000J\u000e"+
		"\u0001\u0000\u0000\u0000KL\u0005o\u0000\u0000LM\u0005m\u0000\u0000MN\u0005"+
		"b\u0000\u0000NO\u0005r\u0000\u0000OP\u0005o\u0000\u0000PQ\u0005s\u0000"+
		"\u0000Q\u0010\u0001\u0000\u0000\u0000RT\u000209\u0000SR\u0001\u0000\u0000"+
		"\u0000TU\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000"+
		"\u0000\u0000V\u0012\u0001\u0000\u0000\u0000W[\u0007\u0000\u0000\u0000"+
		"XZ\u0007\u0001\u0000\u0000YX\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000"+
		"\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\\u0014\u0001"+
		"\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\\\u0000\u0000_`\u0005"+
		"\'\u0000\u0000`\u0016\u0001\u0000\u0000\u0000ae\u0005{\u0000\u0000bd\b"+
		"\u0002\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hi\u0005}\u0000\u0000ij\u0006\u000b\u0000"+
		"\u0000j\u0018\u0001\u0000\u0000\u0000kl\u0007\u0003\u0000\u0000lm\u0006"+
		"\f\u0001\u0000m\u001a\u0001\u0000\u0000\u0000no\u0005,\u0000\u0000o\u001c"+
		"\u0001\u0000\u0000\u0000pq\t\u0000\u0000\u0000q\u001e\u0001\u0000\u0000"+
		"\u0000\u0004\u0000U[e\u0002\u0001\u000b\u0000\u0001\f\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
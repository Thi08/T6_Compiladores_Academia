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
		TREINO=1, PEITO=2, TRICEPS=3, COSTAS=4, BICEPS=5, PERNAS=6, OMBROS=7, 
		NUM_INT=8, CADEIA=9, COMENTARIO=10, WS=11, ERRO=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"TREINO", "PEITO", "TRICEPS", "COSTAS", "BICEPS", "PERNAS", "OMBROS", 
			"NUM_INT", "CADEIA", "ESC_SEQ", "COMENTARIO", "WS", "ERRO"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'treino'", "'peito'", "'triceps'", "'costas'", "'biceps'", "'pernas'", 
			"'ombros'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TREINO", "PEITO", "TRICEPS", "COSTAS", "BICEPS", "PERNAS", "OMBROS", 
			"NUM_INT", "CADEIA", "COMENTARIO", "WS", "ERRO"
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
		case 10:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
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
		"\u0004\u0000\fj\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007N\b"+
		"\u0007\u000b\u0007\f\u0007O\u0001\b\u0001\b\u0005\bT\b\b\n\b\f\bW\t\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0005\n^\b\n\n\n\f\na\t\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\u0000\u0015\n\u0017\u000b\u0019"+
		"\f\u0001\u0000\u0004\u0002\u0000AZaz\u0003\u0000  AZaz\u0003\u0000\n\n"+
		"\r\r}}\u0003\u0000\t\n\r\r  k\u0000\u0001\u0001\u0000\u0000\u0000\u0000"+
		"\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000"+
		"\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b"+
		"\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0015\u0001"+
		"\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001"+
		"\u0000\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\"\u0001\u0000"+
		"\u0000\u0000\u0005(\u0001\u0000\u0000\u0000\u00070\u0001\u0000\u0000\u0000"+
		"\t7\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\rE\u0001\u0000"+
		"\u0000\u0000\u000fM\u0001\u0000\u0000\u0000\u0011Q\u0001\u0000\u0000\u0000"+
		"\u0013X\u0001\u0000\u0000\u0000\u0015[\u0001\u0000\u0000\u0000\u0017e"+
		"\u0001\u0000\u0000\u0000\u0019h\u0001\u0000\u0000\u0000\u001b\u001c\u0005"+
		"t\u0000\u0000\u001c\u001d\u0005r\u0000\u0000\u001d\u001e\u0005e\u0000"+
		"\u0000\u001e\u001f\u0005i\u0000\u0000\u001f \u0005n\u0000\u0000 !\u0005"+
		"o\u0000\u0000!\u0002\u0001\u0000\u0000\u0000\"#\u0005p\u0000\u0000#$\u0005"+
		"e\u0000\u0000$%\u0005i\u0000\u0000%&\u0005t\u0000\u0000&\'\u0005o\u0000"+
		"\u0000\'\u0004\u0001\u0000\u0000\u0000()\u0005t\u0000\u0000)*\u0005r\u0000"+
		"\u0000*+\u0005i\u0000\u0000+,\u0005c\u0000\u0000,-\u0005e\u0000\u0000"+
		"-.\u0005p\u0000\u0000./\u0005s\u0000\u0000/\u0006\u0001\u0000\u0000\u0000"+
		"01\u0005c\u0000\u000012\u0005o\u0000\u000023\u0005s\u0000\u000034\u0005"+
		"t\u0000\u000045\u0005a\u0000\u000056\u0005s\u0000\u00006\b\u0001\u0000"+
		"\u0000\u000078\u0005b\u0000\u000089\u0005i\u0000\u00009:\u0005c\u0000"+
		"\u0000:;\u0005e\u0000\u0000;<\u0005p\u0000\u0000<=\u0005s\u0000\u0000"+
		"=\n\u0001\u0000\u0000\u0000>?\u0005p\u0000\u0000?@\u0005e\u0000\u0000"+
		"@A\u0005r\u0000\u0000AB\u0005n\u0000\u0000BC\u0005a\u0000\u0000CD\u0005"+
		"s\u0000\u0000D\f\u0001\u0000\u0000\u0000EF\u0005o\u0000\u0000FG\u0005"+
		"m\u0000\u0000GH\u0005b\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005o\u0000"+
		"\u0000JK\u0005s\u0000\u0000K\u000e\u0001\u0000\u0000\u0000LN\u000209\u0000"+
		"ML\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000"+
		"\u0000OP\u0001\u0000\u0000\u0000P\u0010\u0001\u0000\u0000\u0000QU\u0007"+
		"\u0000\u0000\u0000RT\u0007\u0001\u0000\u0000SR\u0001\u0000\u0000\u0000"+
		"TW\u0001\u0000\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000"+
		"\u0000V\u0012\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XY\u0005"+
		"\\\u0000\u0000YZ\u0005\'\u0000\u0000Z\u0014\u0001\u0000\u0000\u0000[_"+
		"\u0005{\u0000\u0000\\^\b\u0002\u0000\u0000]\\\u0001\u0000\u0000\u0000"+
		"^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bc\u0005}\u0000"+
		"\u0000cd\u0006\n\u0000\u0000d\u0016\u0001\u0000\u0000\u0000ef\u0007\u0003"+
		"\u0000\u0000fg\u0006\u000b\u0001\u0000g\u0018\u0001\u0000\u0000\u0000"+
		"hi\t\u0000\u0000\u0000i\u001a\u0001\u0000\u0000\u0000\u0004\u0000OU_\u0002"+
		"\u0001\n\u0000\u0001\u000b\u0001";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
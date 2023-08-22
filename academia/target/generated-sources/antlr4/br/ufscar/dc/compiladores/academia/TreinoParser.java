// Generated from java-escape by ANTLR 4.11.1
package br.ufscar.dc.compiladores.academia;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TreinoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TREINO=1, DE=2, PEITO=3, TRICEPS=4, COSTAS=5, BICEPS=6, PERNAS=7, OMBROS=8, 
		NUM_INT=9, CADEIA=10, ESC_SEQ=11, COMENTARIO=12, COMENTARIO_NAO_FECHADO=13, 
		WS=14, VIRGULA=15, ERRO=16;
	public static final int
		RULE_lista_treino = 0, RULE_lista_peito = 1, RULE_lista_triceps = 2, RULE_lista_costas = 3, 
		RULE_lista_biceps = 4, RULE_lista_pernas = 5, RULE_lista_ombros = 6, RULE_exercicio = 7, 
		RULE_nome = 8, RULE_series = 9, RULE_repeticoes = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"lista_treino", "lista_peito", "lista_triceps", "lista_costas", "lista_biceps", 
			"lista_pernas", "lista_ombros", "exercicio", "nome", "series", "repeticoes"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'treino'", "'-'", "'peito'", "'triceps'", "'costas'", "'biceps'", 
			"'pernas'", "'ombros'", null, null, "'\\''", null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TREINO", "DE", "PEITO", "TRICEPS", "COSTAS", "BICEPS", "PERNAS", 
			"OMBROS", "NUM_INT", "CADEIA", "ESC_SEQ", "COMENTARIO", "COMENTARIO_NAO_FECHADO", 
			"WS", "VIRGULA", "ERRO"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TreinoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_treinoContext extends ParserRuleContext {
		public TerminalNode TREINO() { return getToken(TreinoParser.TREINO, 0); }
		public Lista_peitoContext lista_peito() {
			return getRuleContext(Lista_peitoContext.class,0);
		}
		public Lista_tricepsContext lista_triceps() {
			return getRuleContext(Lista_tricepsContext.class,0);
		}
		public Lista_costasContext lista_costas() {
			return getRuleContext(Lista_costasContext.class,0);
		}
		public Lista_bicepsContext lista_biceps() {
			return getRuleContext(Lista_bicepsContext.class,0);
		}
		public Lista_pernasContext lista_pernas() {
			return getRuleContext(Lista_pernasContext.class,0);
		}
		public Lista_ombrosContext lista_ombros() {
			return getRuleContext(Lista_ombrosContext.class,0);
		}
		public Lista_treinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_treino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterLista_treino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitLista_treino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitLista_treino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_treinoContext lista_treino() throws RecognitionException {
		Lista_treinoContext _localctx = new Lista_treinoContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_lista_treino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(TREINO);
			setState(23);
			lista_peito();
			setState(24);
			lista_triceps();
			setState(25);
			lista_costas();
			setState(26);
			lista_biceps();
			setState(27);
			lista_pernas();
			setState(28);
			lista_ombros();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_peitoContext extends ParserRuleContext {
		public TerminalNode PEITO() { return getToken(TreinoParser.PEITO, 0); }
		public List<ExercicioContext> exercicio() {
			return getRuleContexts(ExercicioContext.class);
		}
		public ExercicioContext exercicio(int i) {
			return getRuleContext(ExercicioContext.class,i);
		}
		public Lista_peitoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_peito; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterLista_peito(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitLista_peito(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitLista_peito(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_peitoContext lista_peito() throws RecognitionException {
		Lista_peitoContext _localctx = new Lista_peitoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_lista_peito);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(PEITO);
			setState(32); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(31);
				exercicio();
				}
				}
				setState(34); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_tricepsContext extends ParserRuleContext {
		public TerminalNode TRICEPS() { return getToken(TreinoParser.TRICEPS, 0); }
		public List<ExercicioContext> exercicio() {
			return getRuleContexts(ExercicioContext.class);
		}
		public ExercicioContext exercicio(int i) {
			return getRuleContext(ExercicioContext.class,i);
		}
		public Lista_tricepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_triceps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterLista_triceps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitLista_triceps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitLista_triceps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_tricepsContext lista_triceps() throws RecognitionException {
		Lista_tricepsContext _localctx = new Lista_tricepsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_lista_triceps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(TRICEPS);
			setState(38); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(37);
				exercicio();
				}
				}
				setState(40); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_costasContext extends ParserRuleContext {
		public TerminalNode COSTAS() { return getToken(TreinoParser.COSTAS, 0); }
		public List<ExercicioContext> exercicio() {
			return getRuleContexts(ExercicioContext.class);
		}
		public ExercicioContext exercicio(int i) {
			return getRuleContext(ExercicioContext.class,i);
		}
		public Lista_costasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_costas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterLista_costas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitLista_costas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitLista_costas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_costasContext lista_costas() throws RecognitionException {
		Lista_costasContext _localctx = new Lista_costasContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lista_costas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(COSTAS);
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43);
				exercicio();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_bicepsContext extends ParserRuleContext {
		public TerminalNode BICEPS() { return getToken(TreinoParser.BICEPS, 0); }
		public List<ExercicioContext> exercicio() {
			return getRuleContexts(ExercicioContext.class);
		}
		public ExercicioContext exercicio(int i) {
			return getRuleContext(ExercicioContext.class,i);
		}
		public Lista_bicepsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_biceps; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterLista_biceps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitLista_biceps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitLista_biceps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_bicepsContext lista_biceps() throws RecognitionException {
		Lista_bicepsContext _localctx = new Lista_bicepsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lista_biceps);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(BICEPS);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				exercicio();
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_pernasContext extends ParserRuleContext {
		public TerminalNode PERNAS() { return getToken(TreinoParser.PERNAS, 0); }
		public List<ExercicioContext> exercicio() {
			return getRuleContexts(ExercicioContext.class);
		}
		public ExercicioContext exercicio(int i) {
			return getRuleContext(ExercicioContext.class,i);
		}
		public Lista_pernasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_pernas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterLista_pernas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitLista_pernas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitLista_pernas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_pernasContext lista_pernas() throws RecognitionException {
		Lista_pernasContext _localctx = new Lista_pernasContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lista_pernas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(PERNAS);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				exercicio();
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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

	@SuppressWarnings("CheckReturnValue")
	public static class Lista_ombrosContext extends ParserRuleContext {
		public TerminalNode OMBROS() { return getToken(TreinoParser.OMBROS, 0); }
		public List<ExercicioContext> exercicio() {
			return getRuleContexts(ExercicioContext.class);
		}
		public ExercicioContext exercicio(int i) {
			return getRuleContext(ExercicioContext.class,i);
		}
		public Lista_ombrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_ombros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterLista_ombros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitLista_ombros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitLista_ombros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_ombrosContext lista_ombros() throws RecognitionException {
		Lista_ombrosContext _localctx = new Lista_ombrosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lista_ombros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(OMBROS);
			setState(62); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(61);
				exercicio();
				}
				}
				setState(64); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CADEIA );
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExercicioContext extends ParserRuleContext {
		public NomeContext nome() {
			return getRuleContext(NomeContext.class,0);
		}
		public TerminalNode VIRGULA() { return getToken(TreinoParser.VIRGULA, 0); }
		public SeriesContext series() {
			return getRuleContext(SeriesContext.class,0);
		}
		public TerminalNode DE() { return getToken(TreinoParser.DE, 0); }
		public RepeticoesContext repeticoes() {
			return getRuleContext(RepeticoesContext.class,0);
		}
		public ExercicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exercicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterExercicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitExercicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitExercicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExercicioContext exercicio() throws RecognitionException {
		ExercicioContext _localctx = new ExercicioContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exercicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			nome();
			setState(67);
			match(VIRGULA);
			setState(68);
			series();
			setState(69);
			match(DE);
			setState(70);
			repeticoes();
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

	@SuppressWarnings("CheckReturnValue")
	public static class NomeContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(TreinoParser.CADEIA, 0); }
		public NomeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nome; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterNome(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitNome(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitNome(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NomeContext nome() throws RecognitionException {
		NomeContext _localctx = new NomeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nome);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CADEIA);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SeriesContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(TreinoParser.NUM_INT, 0); }
		public SeriesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_series; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterSeries(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitSeries(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitSeries(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeriesContext series() throws RecognitionException {
		SeriesContext _localctx = new SeriesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_series);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NUM_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticoesContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(TreinoParser.NUM_INT, 0); }
		public RepeticoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).enterRepeticoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TreinoListener ) ((TreinoListener)listener).exitRepeticoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TreinoVisitor ) return ((TreinoVisitor<? extends T>)visitor).visitRepeticoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeticoesContext repeticoes() throws RecognitionException {
		RepeticoesContext _localctx = new RepeticoesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeticoes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(NUM_INT);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0010O\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0004\u0001!\b\u0001\u000b\u0001\f\u0001\"\u0001\u0002"+
		"\u0001\u0002\u0004\u0002\'\b\u0002\u000b\u0002\f\u0002(\u0001\u0003\u0001"+
		"\u0003\u0004\u0003-\b\u0003\u000b\u0003\f\u0003.\u0001\u0004\u0001\u0004"+
		"\u0004\u00043\b\u0004\u000b\u0004\f\u00044\u0001\u0005\u0001\u0005\u0004"+
		"\u00059\b\u0005\u000b\u0005\f\u0005:\u0001\u0006\u0001\u0006\u0004\u0006"+
		"?\b\u0006\u000b\u0006\f\u0006@\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0000\u0000I\u0000\u0016\u0001\u0000\u0000\u0000\u0002"+
		"\u001e\u0001\u0000\u0000\u0000\u0004$\u0001\u0000\u0000\u0000\u0006*\u0001"+
		"\u0000\u0000\u0000\b0\u0001\u0000\u0000\u0000\n6\u0001\u0000\u0000\u0000"+
		"\f<\u0001\u0000\u0000\u0000\u000eB\u0001\u0000\u0000\u0000\u0010H\u0001"+
		"\u0000\u0000\u0000\u0012J\u0001\u0000\u0000\u0000\u0014L\u0001\u0000\u0000"+
		"\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0003\u0002\u0001"+
		"\u0000\u0018\u0019\u0003\u0004\u0002\u0000\u0019\u001a\u0003\u0006\u0003"+
		"\u0000\u001a\u001b\u0003\b\u0004\u0000\u001b\u001c\u0003\n\u0005\u0000"+
		"\u001c\u001d\u0003\f\u0006\u0000\u001d\u0001\u0001\u0000\u0000\u0000\u001e"+
		" \u0005\u0003\u0000\u0000\u001f!\u0003\u000e\u0007\u0000 \u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"#\u0001\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$&\u0005\u0004"+
		"\u0000\u0000%\'\u0003\u000e\u0007\u0000&%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000"+
		")\u0005\u0001\u0000\u0000\u0000*,\u0005\u0005\u0000\u0000+-\u0003\u000e"+
		"\u0007\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.,\u0001"+
		"\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0007\u0001\u0000\u0000"+
		"\u000002\u0005\u0006\u0000\u000013\u0003\u000e\u0007\u000021\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u00005\t\u0001\u0000\u0000\u000068\u0005\u0007\u0000\u0000"+
		"79\u0003\u000e\u0007\u000087\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u000b\u0001"+
		"\u0000\u0000\u0000<>\u0005\b\u0000\u0000=?\u0003\u000e\u0007\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000A\r\u0001\u0000\u0000\u0000BC\u0003\u0010\b"+
		"\u0000CD\u0005\u000f\u0000\u0000DE\u0003\u0012\t\u0000EF\u0005\u0002\u0000"+
		"\u0000FG\u0003\u0014\n\u0000G\u000f\u0001\u0000\u0000\u0000HI\u0005\n"+
		"\u0000\u0000I\u0011\u0001\u0000\u0000\u0000JK\u0005\t\u0000\u0000K\u0013"+
		"\u0001\u0000\u0000\u0000LM\u0005\t\u0000\u0000M\u0015\u0001\u0000\u0000"+
		"\u0000\u0006\"(.4:@";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
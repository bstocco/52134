// Generated from c:/Users/barba/ssl-antlr-calculator-profe/TestSuite-project/TestSuite.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TestSuiteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRUEBA=1, DADO=2, CUANDO=3, ENTONCES=4, ES=5, NO_ES=6, CONTIENE=7, EXISTE=8, 
		DEBE=9, Y=10, TEXTO_DOBLE=11, TEXTO_SIMPLE=12, DOLAR=13, LBRACK=14, RBRACK=15, 
		LBRACE=16, RBRACE=17, COMA=18, PUNTO=19, IDENTIFICADOR=20, NUMERO=21, 
		BOOLEANO=22, NEWLINE=23, WS=24;
	public static final int
		RULE_suite = 0, RULE_prueba = 1, RULE_paso = 2, RULE_pasoTipo = 3, RULE_objeto = 4, 
		RULE_estado = 5, RULE_valor = 6, RULE_texto = 7, RULE_lista = 8, RULE_variable = 9, 
		RULE_numero = 10, RULE_booleano = 11, RULE_identificador = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"suite", "prueba", "paso", "pasoTipo", "objeto", "estado", "valor", "texto", 
			"lista", "variable", "numero", "booleano", "identificador"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'prueba'", "'dado'", "'cuando'", "'entonces'", "'es'", "'no es'", 
			"'contiene'", "'existe'", "'debe'", "'y'", null, null, "'$'", "'['", 
			"']'", "'{'", "'}'", "','", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRUEBA", "DADO", "CUANDO", "ENTONCES", "ES", "NO_ES", "CONTIENE", 
			"EXISTE", "DEBE", "Y", "TEXTO_DOBLE", "TEXTO_SIMPLE", "DOLAR", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "COMA", "PUNTO", "IDENTIFICADOR", "NUMERO", 
			"BOOLEANO", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "TestSuite.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TestSuiteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuiteContext extends ParserRuleContext {
		public List<PruebaContext> prueba() {
			return getRuleContexts(PruebaContext.class);
		}
		public PruebaContext prueba(int i) {
			return getRuleContext(PruebaContext.class,i);
		}
		public SuiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suite; }
	}

	public final SuiteContext suite() throws RecognitionException {
		SuiteContext _localctx = new SuiteContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_suite);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				prueba();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PRUEBA );
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
	public static class PruebaContext extends ParserRuleContext {
		public TerminalNode PRUEBA() { return getToken(TestSuiteParser.PRUEBA, 0); }
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(TestSuiteParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(TestSuiteParser.RBRACE, 0); }
		public List<PasoContext> paso() {
			return getRuleContexts(PasoContext.class);
		}
		public PasoContext paso(int i) {
			return getRuleContext(PasoContext.class,i);
		}
		public PruebaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prueba; }
	}

	public final PruebaContext prueba() throws RecognitionException {
		PruebaContext _localctx = new PruebaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_prueba);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			match(PRUEBA);
			setState(32);
			texto();
			setState(33);
			match(LBRACE);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28L) != 0)) {
				{
				{
				setState(34);
				paso();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(RBRACE);
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
	public static class PasoContext extends ParserRuleContext {
		public PasoTipoContext pasoTipo() {
			return getRuleContext(PasoTipoContext.class,0);
		}
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode NEWLINE() { return getToken(TestSuiteParser.NEWLINE, 0); }
		public EstadoContext estado() {
			return getRuleContext(EstadoContext.class,0);
		}
		public List<TerminalNode> Y() { return getTokens(TestSuiteParser.Y); }
		public TerminalNode Y(int i) {
			return getToken(TestSuiteParser.Y, i);
		}
		public PasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paso; }
	}

	public final PasoContext paso() throws RecognitionException {
		PasoContext _localctx = new PasoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_paso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			pasoTipo();
			setState(43);
			objeto();
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 992L) != 0)) {
				{
				setState(44);
				estado();
				}
			}

			setState(47);
			valor();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Y) {
				{
				{
				setState(48);
				match(Y);
				setState(49);
				valor();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
			match(NEWLINE);
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
	public static class PasoTipoContext extends ParserRuleContext {
		public PasoTipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pasoTipo; }
	 
		public PasoTipoContext() { }
		public void copyFrom(PasoTipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CuandoPasoContext extends PasoTipoContext {
		public TerminalNode CUANDO() { return getToken(TestSuiteParser.CUANDO, 0); }
		public CuandoPasoContext(PasoTipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EntoncesPasoContext extends PasoTipoContext {
		public TerminalNode ENTONCES() { return getToken(TestSuiteParser.ENTONCES, 0); }
		public EntoncesPasoContext(PasoTipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DadoPasoContext extends PasoTipoContext {
		public TerminalNode DADO() { return getToken(TestSuiteParser.DADO, 0); }
		public DadoPasoContext(PasoTipoContext ctx) { copyFrom(ctx); }
	}

	public final PasoTipoContext pasoTipo() throws RecognitionException {
		PasoTipoContext _localctx = new PasoTipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pasoTipo);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DADO:
				_localctx = new DadoPasoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(DADO);
				}
				break;
			case CUANDO:
				_localctx = new CuandoPasoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(CUANDO);
				}
				break;
			case ENTONCES:
				_localctx = new EntoncesPasoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(ENTONCES);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ObjetoContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(TestSuiteParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(TestSuiteParser.PUNTO, i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			identificador();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PUNTO) {
				{
				{
				setState(63);
				match(PUNTO);
				setState(64);
				identificador();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EstadoContext extends ParserRuleContext {
		public TerminalNode ES() { return getToken(TestSuiteParser.ES, 0); }
		public TerminalNode NO_ES() { return getToken(TestSuiteParser.NO_ES, 0); }
		public TerminalNode CONTIENE() { return getToken(TestSuiteParser.CONTIENE, 0); }
		public TerminalNode EXISTE() { return getToken(TestSuiteParser.EXISTE, 0); }
		public TerminalNode DEBE() { return getToken(TestSuiteParser.DEBE, 0); }
		public EstadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_estado; }
	}

	public final EstadoContext estado() throws RecognitionException {
		EstadoContext _localctx = new EstadoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_estado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 992L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	 
		public ValorContext() { }
		public void copyFrom(ValorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumeroValorContext extends ValorContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public NumeroValorContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ListaValorContext extends ValorContext {
		public ListaContext lista() {
			return getRuleContext(ListaContext.class,0);
		}
		public ListaValorContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextoValorContext extends ValorContext {
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public TextoValorContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableValorContext extends ValorContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VariableValorContext(ValorContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoValorContext extends ValorContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BooleanoValorContext(ValorContext ctx) { copyFrom(ctx); }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valor);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO_DOBLE:
			case TEXTO_SIMPLE:
				_localctx = new TextoValorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				texto();
				}
				break;
			case NUMERO:
				_localctx = new NumeroValorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				numero();
				}
				break;
			case BOOLEANO:
				_localctx = new BooleanoValorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				booleano();
				}
				break;
			case DOLAR:
				_localctx = new VariableValorContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(75);
				variable();
				}
				break;
			case LBRACK:
				_localctx = new ListaValorContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				lista();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
	 
		public TextoContext() { }
		public void copyFrom(TextoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextoSimpleContext extends TextoContext {
		public TerminalNode TEXTO_SIMPLE() { return getToken(TestSuiteParser.TEXTO_SIMPLE, 0); }
		public TextoSimpleContext(TextoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TextoDobleContext extends TextoContext {
		public TerminalNode TEXTO_DOBLE() { return getToken(TestSuiteParser.TEXTO_DOBLE, 0); }
		public TextoDobleContext(TextoContext ctx) { copyFrom(ctx); }
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_texto);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO_DOBLE:
				_localctx = new TextoDobleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(TEXTO_DOBLE);
				}
				break;
			case TEXTO_SIMPLE:
				_localctx = new TextoSimpleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(TEXTO_SIMPLE);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(TestSuiteParser.LBRACK, 0); }
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(TestSuiteParser.RBRACK, 0); }
		public List<TerminalNode> COMA() { return getTokens(TestSuiteParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(TestSuiteParser.COMA, i);
		}
		public ListaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista; }
	}

	public final ListaContext lista() throws RecognitionException {
		ListaContext _localctx = new ListaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_lista);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LBRACK);
			setState(84);
			valor();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(85);
				match(COMA);
				setState(86);
				valor();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(RBRACK);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode DOLAR() { return getToken(TestSuiteParser.DOLAR, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(DOLAR);
			setState(95);
			identificador();
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
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(TestSuiteParser.NUMERO, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(NUMERO);
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
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode BOOLEANO() { return getToken(TestSuiteParser.BOOLEANO, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_booleano);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(BOOLEANO);
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
	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(TestSuiteParser.IDENTIFICADOR, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(IDENTIFICADOR);
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
		"\u0004\u0001\u0018h\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001$\b\u0001"+
		"\n\u0001\f\u0001\'\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u00023\b\u0002\n\u0002\f\u00026\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003=\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004B\b\u0004\n\u0004\f\u0004E\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006N\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007"+
		"R\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005\bX\b\b\n\b\f\b[\t\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u0000\u0001\u0001\u0000\u0005\tg\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0002\u001f\u0001\u0000\u0000\u0000\u0004"+
		"*\u0001\u0000\u0000\u0000\u0006<\u0001\u0000\u0000\u0000\b>\u0001\u0000"+
		"\u0000\u0000\nF\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000\u0000\u000e"+
		"Q\u0001\u0000\u0000\u0000\u0010S\u0001\u0000\u0000\u0000\u0012^\u0001"+
		"\u0000\u0000\u0000\u0014a\u0001\u0000\u0000\u0000\u0016c\u0001\u0000\u0000"+
		"\u0000\u0018e\u0001\u0000\u0000\u0000\u001a\u001c\u0003\u0002\u0001\u0000"+
		"\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000\u0000\u0000"+
		"\u001e\u0001\u0001\u0000\u0000\u0000\u001f \u0005\u0001\u0000\u0000 !"+
		"\u0003\u000e\u0007\u0000!%\u0005\u0010\u0000\u0000\"$\u0003\u0004\u0002"+
		"\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000"+
		"\u0000\u0000%&\u0001\u0000\u0000\u0000&(\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000()\u0005\u0011\u0000\u0000)\u0003\u0001\u0000\u0000"+
		"\u0000*+\u0003\u0006\u0003\u0000+-\u0003\b\u0004\u0000,.\u0003\n\u0005"+
		"\u0000-,\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000"+
		"\u0000\u0000/4\u0003\f\u0006\u000001\u0005\n\u0000\u000013\u0003\f\u0006"+
		"\u000020\u0001\u0000\u0000\u000036\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000045\u0001\u0000\u0000\u000057\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000078\u0005\u0017\u0000\u00008\u0005\u0001\u0000\u0000"+
		"\u00009=\u0005\u0002\u0000\u0000:=\u0005\u0003\u0000\u0000;=\u0005\u0004"+
		"\u0000\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001"+
		"\u0000\u0000\u0000=\u0007\u0001\u0000\u0000\u0000>C\u0003\u0018\f\u0000"+
		"?@\u0005\u0013\u0000\u0000@B\u0003\u0018\f\u0000A?\u0001\u0000\u0000\u0000"+
		"BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000D\t\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000FG\u0007\u0000"+
		"\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HN\u0003\u000e\u0007\u0000"+
		"IN\u0003\u0014\n\u0000JN\u0003\u0016\u000b\u0000KN\u0003\u0012\t\u0000"+
		"LN\u0003\u0010\b\u0000MH\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000"+
		"MJ\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000"+
		"\u0000N\r\u0001\u0000\u0000\u0000OR\u0005\u000b\u0000\u0000PR\u0005\f"+
		"\u0000\u0000QO\u0001\u0000\u0000\u0000QP\u0001\u0000\u0000\u0000R\u000f"+
		"\u0001\u0000\u0000\u0000ST\u0005\u000e\u0000\u0000TY\u0003\f\u0006\u0000"+
		"UV\u0005\u0012\u0000\u0000VX\u0003\f\u0006\u0000WU\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z\\\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u000f"+
		"\u0000\u0000]\u0011\u0001\u0000\u0000\u0000^_\u0005\r\u0000\u0000_`\u0003"+
		"\u0018\f\u0000`\u0013\u0001\u0000\u0000\u0000ab\u0005\u0015\u0000\u0000"+
		"b\u0015\u0001\u0000\u0000\u0000cd\u0005\u0016\u0000\u0000d\u0017\u0001"+
		"\u0000\u0000\u0000ef\u0005\u0014\u0000\u0000f\u0019\u0001\u0000\u0000"+
		"\u0000\t\u001d%-4<CMQY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
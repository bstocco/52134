// Generated from c:/Users/barba/ssl-antlr-calculator-profe/TestSuite-project/TestSuite.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TestSuiteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRUEBA=1, DADO=2, CUANDO=3, ENTONCES=4, ES=5, NO_ES=6, CONTIENE=7, EXISTE=8, 
		DEBE=9, Y=10, TEXTO_DOBLE=11, TEXTO_SIMPLE=12, DOLAR=13, LBRACK=14, RBRACK=15, 
		LBRACE=16, RBRACE=17, COMA=18, PUNTO=19, IDENTIFICADOR=20, NUMERO=21, 
		BOOLEANO=22, NEWLINE=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRUEBA", "DADO", "CUANDO", "ENTONCES", "ES", "NO_ES", "CONTIENE", "EXISTE", 
			"DEBE", "Y", "TEXTO_DOBLE", "TEXTO_SIMPLE", "DOLAR", "LBRACK", "RBRACK", 
			"LBRACE", "RBRACE", "COMA", "PUNTO", "IDENTIFICADOR", "NUMERO", "BOOLEANO", 
			"NEWLINE", "WS"
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


	public TestSuiteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TestSuite.g4"; }

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
		"\u0004\u0000\u0018\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0005\np\b"+
		"\n\n\n\f\ns\t\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000by\b"+
		"\u000b\n\u000b\f\u000b|\t\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u0090\b\u0013\n\u0013\f\u0013\u0093\t\u0013"+
		"\u0001\u0014\u0004\u0014\u0096\b\u0014\u000b\u0014\f\u0014\u0097\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u00a8\b\u0015\u0001\u0016\u0003\u0016\u00ab"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004\u0017\u00b0\b\u0017"+
		"\u000b\u0017\f\u0017\u00b1\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017/"+
		"\u0018\u0001\u0000\u0006\u0003\u0000\n\n\r\r\"\"\u0003\u0000\n\n\r\r\'"+
		"\'\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0003\u0000\t\n"+
		"\r\r  \u00bb\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u0003"+
		"8\u0001\u0000\u0000\u0000\u0005=\u0001\u0000\u0000\u0000\u0007D\u0001"+
		"\u0000\u0000\u0000\tM\u0001\u0000\u0000\u0000\u000bP\u0001\u0000\u0000"+
		"\u0000\rV\u0001\u0000\u0000\u0000\u000f_\u0001\u0000\u0000\u0000\u0011"+
		"f\u0001\u0000\u0000\u0000\u0013k\u0001\u0000\u0000\u0000\u0015m\u0001"+
		"\u0000\u0000\u0000\u0017v\u0001\u0000\u0000\u0000\u0019\u007f\u0001\u0000"+
		"\u0000\u0000\u001b\u0081\u0001\u0000\u0000\u0000\u001d\u0083\u0001\u0000"+
		"\u0000\u0000\u001f\u0085\u0001\u0000\u0000\u0000!\u0087\u0001\u0000\u0000"+
		"\u0000#\u0089\u0001\u0000\u0000\u0000%\u008b\u0001\u0000\u0000\u0000\'"+
		"\u008d\u0001\u0000\u0000\u0000)\u0095\u0001\u0000\u0000\u0000+\u00a7\u0001"+
		"\u0000\u0000\u0000-\u00aa\u0001\u0000\u0000\u0000/\u00af\u0001\u0000\u0000"+
		"\u000012\u0005p\u0000\u000023\u0005r\u0000\u000034\u0005u\u0000\u0000"+
		"45\u0005e\u0000\u000056\u0005b\u0000\u000067\u0005a\u0000\u00007\u0002"+
		"\u0001\u0000\u0000\u000089\u0005d\u0000\u00009:\u0005a\u0000\u0000:;\u0005"+
		"d\u0000\u0000;<\u0005o\u0000\u0000<\u0004\u0001\u0000\u0000\u0000=>\u0005"+
		"c\u0000\u0000>?\u0005u\u0000\u0000?@\u0005a\u0000\u0000@A\u0005n\u0000"+
		"\u0000AB\u0005d\u0000\u0000BC\u0005o\u0000\u0000C\u0006\u0001\u0000\u0000"+
		"\u0000DE\u0005e\u0000\u0000EF\u0005n\u0000\u0000FG\u0005t\u0000\u0000"+
		"GH\u0005o\u0000\u0000HI\u0005n\u0000\u0000IJ\u0005c\u0000\u0000JK\u0005"+
		"e\u0000\u0000KL\u0005s\u0000\u0000L\b\u0001\u0000\u0000\u0000MN\u0005"+
		"e\u0000\u0000NO\u0005s\u0000\u0000O\n\u0001\u0000\u0000\u0000PQ\u0005"+
		"n\u0000\u0000QR\u0005o\u0000\u0000RS\u0005 \u0000\u0000ST\u0005e\u0000"+
		"\u0000TU\u0005s\u0000\u0000U\f\u0001\u0000\u0000\u0000VW\u0005c\u0000"+
		"\u0000WX\u0005o\u0000\u0000XY\u0005n\u0000\u0000YZ\u0005t\u0000\u0000"+
		"Z[\u0005i\u0000\u0000[\\\u0005e\u0000\u0000\\]\u0005n\u0000\u0000]^\u0005"+
		"e\u0000\u0000^\u000e\u0001\u0000\u0000\u0000_`\u0005e\u0000\u0000`a\u0005"+
		"x\u0000\u0000ab\u0005i\u0000\u0000bc\u0005s\u0000\u0000cd\u0005t\u0000"+
		"\u0000de\u0005e\u0000\u0000e\u0010\u0001\u0000\u0000\u0000fg\u0005d\u0000"+
		"\u0000gh\u0005e\u0000\u0000hi\u0005b\u0000\u0000ij\u0005e\u0000\u0000"+
		"j\u0012\u0001\u0000\u0000\u0000kl\u0005y\u0000\u0000l\u0014\u0001\u0000"+
		"\u0000\u0000mq\u0005\"\u0000\u0000np\b\u0000\u0000\u0000on\u0001\u0000"+
		"\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000rt\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tu\u0005\"\u0000\u0000u\u0016\u0001\u0000\u0000\u0000vz\u0005\'\u0000"+
		"\u0000wy\b\u0001\u0000\u0000xw\u0001\u0000\u0000\u0000y|\u0001\u0000\u0000"+
		"\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{}\u0001\u0000"+
		"\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\'\u0000\u0000~\u0018\u0001"+
		"\u0000\u0000\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\u001a\u0001\u0000"+
		"\u0000\u0000\u0081\u0082\u0005[\u0000\u0000\u0082\u001c\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0005]\u0000\u0000\u0084\u001e\u0001\u0000\u0000\u0000"+
		"\u0085\u0086\u0005{\u0000\u0000\u0086 \u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005}\u0000\u0000\u0088\"\u0001\u0000\u0000\u0000\u0089\u008a\u0005"+
		",\u0000\u0000\u008a$\u0001\u0000\u0000\u0000\u008b\u008c\u0005.\u0000"+
		"\u0000\u008c&\u0001\u0000\u0000\u0000\u008d\u0091\u0007\u0002\u0000\u0000"+
		"\u008e\u0090\u0007\u0003\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093"+
		"\u0091\u0001\u0000\u0000\u0000\u0094\u0096\u0007\u0004\u0000\u0000\u0095"+
		"\u0094\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"*\u0001\u0000\u0000\u0000\u0099\u009a\u0005v\u0000\u0000\u009a\u009b\u0005"+
		"e\u0000\u0000\u009b\u009c\u0005r\u0000\u0000\u009c\u009d\u0005d\u0000"+
		"\u0000\u009d\u009e\u0005a\u0000\u0000\u009e\u009f\u0005d\u0000\u0000\u009f"+
		"\u00a0\u0005e\u0000\u0000\u00a0\u00a1\u0005r\u0000\u0000\u00a1\u00a8\u0005"+
		"o\u0000\u0000\u00a2\u00a3\u0005f\u0000\u0000\u00a3\u00a4\u0005a\u0000"+
		"\u0000\u00a4\u00a5\u0005l\u0000\u0000\u00a5\u00a6\u0005s\u0000\u0000\u00a6"+
		"\u00a8\u0005o\u0000\u0000\u00a7\u0099\u0001\u0000\u0000\u0000\u00a7\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a8,\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005"+
		"\r\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\n\u0000"+
		"\u0000\u00ad.\u0001\u0000\u0000\u0000\u00ae\u00b0\u0007\u0005\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0006\u0017\u0000\u0000"+
		"\u00b40\u0001\u0000\u0000\u0000\b\u0000qz\u0091\u0097\u00a7\u00aa\u00b1"+
		"\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
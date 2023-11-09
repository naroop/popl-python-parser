// Generated from /Users/nrupp/classes/popl/popl-python-parser/python.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pythonLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARNAME=1, EQUAL=2, PLUSEQUAL=3, MINUSEQUAL=4, MULTIPLYEQUAL=5, DIVIDEEQUAL=6, 
		PLUS=7, MINUS=8, MULTIPLY=9, DIVIDE=10, MOD=11, COMMA=12, LBRACKET=13, 
		RBRACKET=14, INT=15, FLOAT=16, STRING=17, BOOLEAN=18, WHITESPACE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VARNAME", "EQUAL", "PLUSEQUAL", "MINUSEQUAL", "MULTIPLYEQUAL", "DIVIDEEQUAL", 
			"PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "COMMA", "LBRACKET", "RBRACKET", 
			"INT", "FLOAT", "STRING", "BOOLEAN", "WHITESPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "'+='", "'-='", "'*='", "'/='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARNAME", "EQUAL", "PLUSEQUAL", "MINUSEQUAL", "MULTIPLYEQUAL", 
			"DIVIDEEQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "COMMA", 
			"LBRACKET", "RBRACKET", "INT", "FLOAT", "STRING", "BOOLEAN", "WHITESPACE"
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


	public pythonLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "python.g4"; }

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
		"\u0004\u0000\u0013\u008f\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0005\u0000*\b\u0000"+
		"\n\u0000\f\u0000-\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e"+
		"\u0004\u000eN\b\u000e\u000b\u000e\f\u000eO\u0001\u000f\u0005\u000fS\b"+
		"\u000f\n\u000f\f\u000fV\t\u000f\u0001\u000f\u0001\u000f\u0004\u000fZ\b"+
		"\u000f\u000b\u000f\f\u000f[\u0001\u000f\u0004\u000f_\b\u000f\u000b\u000f"+
		"\f\u000f`\u0001\u000f\u0001\u000f\u0005\u000fe\b\u000f\n\u000f\f\u000f"+
		"h\t\u000f\u0003\u000fj\b\u000f\u0001\u0010\u0001\u0010\u0005\u0010n\b"+
		"\u0010\n\u0010\f\u0010q\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010v\b\u0010\n\u0010\f\u0010y\t\u0010\u0001\u0010\u0003\u0010|\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0087\b\u0011\u0001\u0012"+
		"\u0004\u0012\u008a\b\u0012\u000b\u0012\f\u0012\u008b\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001"+
		"\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0001"+
		"\u0000\"\"\u0001\u0000\'\'\u0003\u0000\t\n\r\r  \u009a\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000"+
		"\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000"+
		"\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000"+
		"\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000"+
		"\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001\'"+
		"\u0001\u0000\u0000\u0000\u0003.\u0001\u0000\u0000\u0000\u00050\u0001\u0000"+
		"\u0000\u0000\u00073\u0001\u0000\u0000\u0000\t6\u0001\u0000\u0000\u0000"+
		"\u000b9\u0001\u0000\u0000\u0000\r<\u0001\u0000\u0000\u0000\u000f>\u0001"+
		"\u0000\u0000\u0000\u0011@\u0001\u0000\u0000\u0000\u0013B\u0001\u0000\u0000"+
		"\u0000\u0015D\u0001\u0000\u0000\u0000\u0017F\u0001\u0000\u0000\u0000\u0019"+
		"H\u0001\u0000\u0000\u0000\u001bJ\u0001\u0000\u0000\u0000\u001dM\u0001"+
		"\u0000\u0000\u0000\u001fi\u0001\u0000\u0000\u0000!{\u0001\u0000\u0000"+
		"\u0000#\u0086\u0001\u0000\u0000\u0000%\u0089\u0001\u0000\u0000\u0000\'"+
		"+\u0007\u0000\u0000\u0000(*\u0007\u0001\u0000\u0000)(\u0001\u0000\u0000"+
		"\u0000*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,\u0002\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000"+
		"./\u0005=\u0000\u0000/\u0004\u0001\u0000\u0000\u000001\u0005+\u0000\u0000"+
		"12\u0005=\u0000\u00002\u0006\u0001\u0000\u0000\u000034\u0005-\u0000\u0000"+
		"45\u0005=\u0000\u00005\b\u0001\u0000\u0000\u000067\u0005*\u0000\u0000"+
		"78\u0005=\u0000\u00008\n\u0001\u0000\u0000\u00009:\u0005/\u0000\u0000"+
		":;\u0005=\u0000\u0000;\f\u0001\u0000\u0000\u0000<=\u0005+\u0000\u0000"+
		"=\u000e\u0001\u0000\u0000\u0000>?\u0005-\u0000\u0000?\u0010\u0001\u0000"+
		"\u0000\u0000@A\u0005*\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005"+
		"/\u0000\u0000C\u0014\u0001\u0000\u0000\u0000DE\u0005%\u0000\u0000E\u0016"+
		"\u0001\u0000\u0000\u0000FG\u0005,\u0000\u0000G\u0018\u0001\u0000\u0000"+
		"\u0000HI\u0005[\u0000\u0000I\u001a\u0001\u0000\u0000\u0000JK\u0005]\u0000"+
		"\u0000K\u001c\u0001\u0000\u0000\u0000LN\u0007\u0002\u0000\u0000ML\u0001"+
		"\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P\u001e\u0001\u0000\u0000\u0000QS\u0007\u0002"+
		"\u0000\u0000RQ\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WY\u0005.\u0000\u0000XZ\u0007\u0002\u0000\u0000"+
		"YX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000[\\\u0001\u0000\u0000\u0000\\j\u0001\u0000\u0000\u0000]_\u0007\u0002"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bf\u0005.\u0000\u0000ce\u0007\u0002\u0000\u0000dc\u0001\u0000\u0000\u0000"+
		"eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gj\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000iT\u0001\u0000"+
		"\u0000\u0000i^\u0001\u0000\u0000\u0000j \u0001\u0000\u0000\u0000ko\u0005"+
		"\"\u0000\u0000ln\b\u0003\u0000\u0000ml\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"pr\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000r|\u0005\"\u0000\u0000"+
		"sw\u0005\'\u0000\u0000tv\b\u0004\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000"+
		"\u0000xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z|\u0005\'\u0000"+
		"\u0000{k\u0001\u0000\u0000\u0000{s\u0001\u0000\u0000\u0000|\"\u0001\u0000"+
		"\u0000\u0000}~\u0005T\u0000\u0000~\u007f\u0005r\u0000\u0000\u007f\u0080"+
		"\u0005u\u0000\u0000\u0080\u0087\u0005e\u0000\u0000\u0081\u0082\u0005F"+
		"\u0000\u0000\u0082\u0083\u0005a\u0000\u0000\u0083\u0084\u0005l\u0000\u0000"+
		"\u0084\u0085\u0005s\u0000\u0000\u0085\u0087\u0005e\u0000\u0000\u0086}"+
		"\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000\u0000\u0000\u0087$\u0001"+
		"\u0000\u0000\u0000\u0088\u008a\u0007\u0005\u0000\u0000\u0089\u0088\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0006\u0012\u0000\u0000\u008e&\u0001\u0000"+
		"\u0000\u0000\r\u0000+OT[`fiow{\u0086\u008b\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
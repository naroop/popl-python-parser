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
public class pythonparserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARNAME=1, EQUAL=2, COMMA=3, LBRACKET=4, RBRACKET=5, INT=6, FLOAT=7, STRING=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VARNAME", "EQUAL", "COMMA", "LBRACKET", "RBRACKET", "INT", "FLOAT", 
			"STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'='", "','", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VARNAME", "EQUAL", "COMMA", "LBRACKET", "RBRACKET", "INT", "FLOAT", 
			"STRING"
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


	public pythonparserLexer(CharStream input) {
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
		"\u0004\u0000\bQ\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0001\u0000\u0001\u0000\u0005\u0000\u0014\b\u0000\n\u0000"+
		"\f\u0000\u0017\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u0005"+
		"\"\b\u0005\u000b\u0005\f\u0005#\u0001\u0006\u0005\u0006\'\b\u0006\n\u0006"+
		"\f\u0006*\t\u0006\u0001\u0006\u0001\u0006\u0004\u0006.\b\u0006\u000b\u0006"+
		"\f\u0006/\u0001\u0006\u0004\u00063\b\u0006\u000b\u0006\f\u00064\u0001"+
		"\u0006\u0001\u0006\u0005\u00069\b\u0006\n\u0006\f\u0006<\t\u0006\u0003"+
		"\u0006>\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007B\b\u0007\n\u0007\f"+
		"\u0007E\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007J\b\u0007"+
		"\n\u0007\f\u0007M\t\u0007\u0001\u0007\u0003\u0007P\b\u0007\u0000\u0000"+
		"\b\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0001\u0000\u0005\u0003\u0000AZ__az\u0004\u000009AZ_"+
		"_az\u0001\u000009\u0001\u0000\"\"\u0001\u0000\'\'Z\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0001\u0011\u0001\u0000\u0000\u0000"+
		"\u0003\u0018\u0001\u0000\u0000\u0000\u0005\u001a\u0001\u0000\u0000\u0000"+
		"\u0007\u001c\u0001\u0000\u0000\u0000\t\u001e\u0001\u0000\u0000\u0000\u000b"+
		"!\u0001\u0000\u0000\u0000\r=\u0001\u0000\u0000\u0000\u000fO\u0001\u0000"+
		"\u0000\u0000\u0011\u0015\u0007\u0000\u0000\u0000\u0012\u0014\u0007\u0001"+
		"\u0000\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000"+
		"\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000"+
		"\u0000\u0000\u0016\u0002\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0005=\u0000\u0000\u0019\u0004\u0001\u0000\u0000"+
		"\u0000\u001a\u001b\u0005,\u0000\u0000\u001b\u0006\u0001\u0000\u0000\u0000"+
		"\u001c\u001d\u0005[\u0000\u0000\u001d\b\u0001\u0000\u0000\u0000\u001e"+
		"\u001f\u0005]\u0000\u0000\u001f\n\u0001\u0000\u0000\u0000 \"\u0007\u0002"+
		"\u0000\u0000! \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\f\u0001\u0000\u0000\u0000"+
		"%\'\u0007\u0002\u0000\u0000&%\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+-\u0005.\u0000\u0000,.\u0007\u0002"+
		"\u0000\u0000-,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/-\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u00000>\u0001\u0000\u0000\u0000"+
		"13\u0007\u0002\u0000\u000021\u0001\u0000\u0000\u000034\u0001\u0000\u0000"+
		"\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u000056\u0001\u0000"+
		"\u0000\u00006:\u0005.\u0000\u000079\u0007\u0002\u0000\u000087\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;>\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=(\u0001\u0000\u0000\u0000=2\u0001\u0000\u0000\u0000>\u000e\u0001\u0000"+
		"\u0000\u0000?C\u0005\"\u0000\u0000@B\b\u0003\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BE\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000CD\u0001"+
		"\u0000\u0000\u0000DF\u0001\u0000\u0000\u0000EC\u0001\u0000\u0000\u0000"+
		"FP\u0005\"\u0000\u0000GK\u0005\'\u0000\u0000HJ\b\u0004\u0000\u0000IH\u0001"+
		"\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000NP\u0005\'\u0000\u0000O?\u0001\u0000\u0000\u0000OG\u0001\u0000\u0000"+
		"\u0000P\u0010\u0001\u0000\u0000\u0000\u000b\u0000\u0015#(/4:=CKO\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
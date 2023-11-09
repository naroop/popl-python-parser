// Generated from /Users/nrupp/classes/popl/popl-python-parser/python.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VARNAME=1, EQUAL=2, PLUSEQUAL=3, MINUSEQUAL=4, MULTIPLYEQUAL=5, DIVIDEEQUAL=6, 
		PLUS=7, MINUS=8, MULTIPLY=9, DIVIDE=10, MOD=11, COMMA=12, LBRACKET=13, 
		RBRACKET=14, INT=15, FLOAT=16, STRING=17, BOOLEAN=18, WHITESPACE=19;
	public static final int
		RULE_v_data = 0, RULE_v_array = 1, RULE_v_arithmetic_op = 2, RULE_v_assignment_op = 3, 
		RULE_start = 4, RULE_assignment = 5, RULE_arithmetic = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"v_data", "v_array", "v_arithmetic_op", "v_assignment_op", "start", "assignment", 
			"arithmetic"
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

	@Override
	public String getGrammarFileName() { return "python.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class V_dataContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(pythonParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(pythonParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(pythonParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(pythonParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(pythonParser.BOOLEAN, 0); }
		public V_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_data; }
	}

	public final V_dataContext v_data() throws RecognitionException {
		V_dataContext _localctx = new V_dataContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_v_data);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 491522L) != 0)) ) {
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
	public static class V_arrayContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(pythonParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(pythonParser.RBRACKET, 0); }
		public List<V_dataContext> v_data() {
			return getRuleContexts(V_dataContext.class);
		}
		public V_dataContext v_data(int i) {
			return getRuleContext(V_dataContext.class,i);
		}
		public List<V_arrayContext> v_array() {
			return getRuleContexts(V_arrayContext.class);
		}
		public V_arrayContext v_array(int i) {
			return getRuleContext(V_arrayContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pythonParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pythonParser.COMMA, i);
		}
		public V_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_array; }
	}

	public final V_arrayContext v_array() throws RecognitionException {
		V_arrayContext _localctx = new V_arrayContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_v_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(LBRACKET);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 499714L) != 0)) {
				{
				setState(19);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARNAME:
				case INT:
				case FLOAT:
				case STRING:
				case BOOLEAN:
					{
					setState(17);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(18);
					v_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(21);
					match(COMMA);
					setState(24);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case VARNAME:
					case INT:
					case FLOAT:
					case STRING:
					case BOOLEAN:
						{
						setState(22);
						v_data();
						}
						break;
					case LBRACKET:
						{
						setState(23);
						v_array();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(27);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						setState(26);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(36);
			match(RBRACKET);
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
	public static class V_arithmetic_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(pythonParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(pythonParser.MINUS, 0); }
		public TerminalNode MULTIPLY() { return getToken(pythonParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(pythonParser.DIVIDE, 0); }
		public TerminalNode MOD() { return getToken(pythonParser.MOD, 0); }
		public V_arithmetic_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_arithmetic_op; }
	}

	public final V_arithmetic_opContext v_arithmetic_op() throws RecognitionException {
		V_arithmetic_opContext _localctx = new V_arithmetic_opContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_v_arithmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) ) {
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
	public static class V_assignment_opContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(pythonParser.EQUAL, 0); }
		public TerminalNode PLUSEQUAL() { return getToken(pythonParser.PLUSEQUAL, 0); }
		public TerminalNode MINUSEQUAL() { return getToken(pythonParser.MINUSEQUAL, 0); }
		public TerminalNode MULTIPLYEQUAL() { return getToken(pythonParser.MULTIPLYEQUAL, 0); }
		public TerminalNode DIVIDEEQUAL() { return getToken(pythonParser.DIVIDEEQUAL, 0); }
		public V_assignment_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_assignment_op; }
	}

	public final V_assignment_opContext v_assignment_op() throws RecognitionException {
		V_assignment_opContext _localctx = new V_assignment_opContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_v_assignment_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 124L) != 0)) ) {
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
	public static class StartContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 499714L) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(42);
					assignment();
					}
					break;
				case 2:
					{
					setState(43);
					arithmetic();
					}
					break;
				}
				}
				setState(48);
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
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(pythonParser.VARNAME, 0); }
		public V_assignment_opContext v_assignment_op() {
			return getRuleContext(V_assignment_opContext.class,0);
		}
		public V_dataContext v_data() {
			return getRuleContext(V_dataContext.class,0);
		}
		public V_arrayContext v_array() {
			return getRuleContext(V_arrayContext.class,0);
		}
		public List<ArithmeticContext> arithmetic() {
			return getRuleContexts(ArithmeticContext.class);
		}
		public ArithmeticContext arithmetic(int i) {
			return getRuleContext(ArithmeticContext.class,i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(VARNAME);
			setState(50);
			v_assignment_op();
			setState(61);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VARNAME:
				case INT:
				case FLOAT:
				case STRING:
				case BOOLEAN:
					{
					setState(51);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(52);
					v_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				{
				setState(58);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(55);
						arithmetic();
						}
						} 
					}
					setState(60);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				}
				break;
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
	public static class ArithmeticContext extends ParserRuleContext {
		public List<V_dataContext> v_data() {
			return getRuleContexts(V_dataContext.class);
		}
		public V_dataContext v_data(int i) {
			return getRuleContext(V_dataContext.class,i);
		}
		public List<V_arithmetic_opContext> v_arithmetic_op() {
			return getRuleContexts(V_arithmetic_opContext.class);
		}
		public V_arithmetic_opContext v_arithmetic_op(int i) {
			return getRuleContext(V_arithmetic_opContext.class,i);
		}
		public List<V_arrayContext> v_array() {
			return getRuleContexts(V_arrayContext.class);
		}
		public V_arrayContext v_array(int i) {
			return getRuleContext(V_arrayContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(pythonParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(pythonParser.PLUS, i);
		}
		public ArithmeticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmetic; }
	}

	public final ArithmeticContext arithmetic() throws RecognitionException {
		ArithmeticContext _localctx = new ArithmeticContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arithmetic);
		int _la;
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
			case INT:
			case FLOAT:
			case STRING:
			case BOOLEAN:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				v_data();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3968L) != 0)) {
					{
					{
					setState(64);
					v_arithmetic_op();
					setState(65);
					v_data();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				v_array();
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(73);
					match(PLUS);
					setState(74);
					v_array();
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\u0004\u0001\u0013S\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0014\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001\u0019\b\u0001\u0001\u0001\u0003\u0001\u001c"+
		"\b\u0001\u0005\u0001\u001e\b\u0001\n\u0001\f\u0001!\t\u0001\u0003\u0001"+
		"#\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u0004-\b\u0004\n\u0004\f\u0004"+
		"0\t\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"6\b\u0005\u0001\u0005\u0005\u00059\b\u0005\n\u0005\f\u0005<\t\u0005\u0003"+
		"\u0005>\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006D\b\u0006\n\u0006\f\u0006G\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006L\b\u0006\n\u0006\f\u0006O\t\u0006\u0003\u0006Q\b\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0003"+
		"\u0002\u0000\u0001\u0001\u000f\u0012\u0001\u0000\u0007\u000b\u0001\u0000"+
		"\u0002\u0006X\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000"+
		"\u0000\u0000\u0004&\u0001\u0000\u0000\u0000\u0006(\u0001\u0000\u0000\u0000"+
		"\b.\u0001\u0000\u0000\u0000\n1\u0001\u0000\u0000\u0000\fP\u0001\u0000"+
		"\u0000\u0000\u000e\u000f\u0007\u0000\u0000\u0000\u000f\u0001\u0001\u0000"+
		"\u0000\u0000\u0010\"\u0005\r\u0000\u0000\u0011\u0014\u0003\u0000\u0000"+
		"\u0000\u0012\u0014\u0003\u0002\u0001\u0000\u0013\u0011\u0001\u0000\u0000"+
		"\u0000\u0013\u0012\u0001\u0000\u0000\u0000\u0014\u001f\u0001\u0000\u0000"+
		"\u0000\u0015\u0018\u0005\f\u0000\u0000\u0016\u0019\u0003\u0000\u0000\u0000"+
		"\u0017\u0019\u0003\u0002\u0001\u0000\u0018\u0016\u0001\u0000\u0000\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000\u0000\u0000"+
		"\u001a\u001c\u0005\f\u0000\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001b"+
		"\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000\u001d"+
		"\u0015\u0001\u0000\u0000\u0000\u001e!\u0001\u0000\u0000\u0000\u001f\u001d"+
		"\u0001\u0000\u0000\u0000\u001f \u0001\u0000\u0000\u0000 #\u0001\u0000"+
		"\u0000\u0000!\u001f\u0001\u0000\u0000\u0000\"\u0013\u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$%\u0005\u000e"+
		"\u0000\u0000%\u0003\u0001\u0000\u0000\u0000&\'\u0007\u0001\u0000\u0000"+
		"\'\u0005\u0001\u0000\u0000\u0000()\u0007\u0002\u0000\u0000)\u0007\u0001"+
		"\u0000\u0000\u0000*-\u0003\n\u0005\u0000+-\u0003\f\u0006\u0000,*\u0001"+
		"\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\t\u0001\u0000\u0000"+
		"\u00000.\u0001\u0000\u0000\u000012\u0005\u0001\u0000\u00002=\u0003\u0006"+
		"\u0003\u000036\u0003\u0000\u0000\u000046\u0003\u0002\u0001\u000053\u0001"+
		"\u0000\u0000\u000054\u0001\u0000\u0000\u00006>\u0001\u0000\u0000\u0000"+
		"79\u0003\f\u0006\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000"+
		":8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;>\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000=5\u0001\u0000\u0000\u0000=:\u0001\u0000"+
		"\u0000\u0000>\u000b\u0001\u0000\u0000\u0000?E\u0003\u0000\u0000\u0000"+
		"@A\u0003\u0004\u0002\u0000AB\u0003\u0000\u0000\u0000BD\u0001\u0000\u0000"+
		"\u0000C@\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000EC\u0001\u0000"+
		"\u0000\u0000EF\u0001\u0000\u0000\u0000FQ\u0001\u0000\u0000\u0000GE\u0001"+
		"\u0000\u0000\u0000HM\u0003\u0002\u0001\u0000IJ\u0005\u0007\u0000\u0000"+
		"JL\u0003\u0002\u0001\u0000KI\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NQ\u0001\u0000"+
		"\u0000\u0000OM\u0001\u0000\u0000\u0000P?\u0001\u0000\u0000\u0000PH\u0001"+
		"\u0000\u0000\u0000Q\r\u0001\u0000\u0000\u0000\r\u0013\u0018\u001b\u001f"+
		"\",.5:=EMP";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		AND=1, OR=2, NOT=3, EQUAL=4, PLUSEQUAL=5, MINUSEQUAL=6, MULTIPLYEQUAL=7, 
		DIVIDEEQUAL=8, PLUS=9, MINUS=10, MULTIPLY=11, DIVIDE=12, MOD=13, COMMA=14, 
		LBRACKET=15, RBRACKET=16, LPAREN=17, RPAREN=18, INT=19, FLOAT=20, STRING=21, 
		BOOLEAN=22, TAB=23, WHITESPACE=24, NEWLINE=25, IF=26, ELSE=27, ELIF=28, 
		COLON=29, GREATERTHAN=30, LESSTHAN=31, EQUALTO=32, NOTEQUALTO=33, GREATERTHANEQUAL=34, 
		LESSTHANEQUAL=35, VARNAME=36;
	public static final int
		RULE_v_negation = 0, RULE_v_data = 1, RULE_v_array = 2, RULE_v_arithmetic_op = 3, 
		RULE_v_assignment_op = 4, RULE_v_comparison_op = 5, RULE_v_comparison_statement = 6, 
		RULE_start = 7, RULE_line = 8, RULE_statement = 9, RULE_assignment = 10, 
		RULE_arithmetic = 11, RULE_comparison = 12, RULE_if_block = 13, RULE_elif_block = 14, 
		RULE_else_block = 15, RULE_conditional = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"v_negation", "v_data", "v_array", "v_arithmetic_op", "v_assignment_op", 
			"v_comparison_op", "v_comparison_statement", "start", "line", "statement", 
			"assignment", "arithmetic", "comparison", "if_block", "elif_block", "else_block", 
			"conditional"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'not'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "','", "'['", "']'", "'('", "')'", 
			null, null, null, null, null, null, null, "'if'", "'else'", "'elif'", 
			"':'", "'>'", "'<'", "'=='", "'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQUAL", "PLUSEQUAL", "MINUSEQUAL", "MULTIPLYEQUAL", 
			"DIVIDEEQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "COMMA", 
			"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "INT", "FLOAT", "STRING", 
			"BOOLEAN", "TAB", "WHITESPACE", "NEWLINE", "IF", "ELSE", "ELIF", "COLON", 
			"GREATERTHAN", "LESSTHAN", "EQUALTO", "NOTEQUALTO", "GREATERTHANEQUAL", 
			"LESSTHANEQUAL", "VARNAME"
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
	public static class V_negationContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(pythonParser.NOT, 0); }
		public V_dataContext v_data() {
			return getRuleContext(V_dataContext.class,0);
		}
		public V_negationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_negation; }
	}

	public final V_negationContext v_negation() throws RecognitionException {
		V_negationContext _localctx = new V_negationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_v_negation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(NOT);
			setState(35);
			v_data();
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
	public static class V_dataContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(pythonParser.VARNAME, 0); }
		public TerminalNode INT() { return getToken(pythonParser.INT, 0); }
		public TerminalNode MINUS() { return getToken(pythonParser.MINUS, 0); }
		public TerminalNode FLOAT() { return getToken(pythonParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(pythonParser.STRING, 0); }
		public TerminalNode BOOLEAN() { return getToken(pythonParser.BOOLEAN, 0); }
		public V_negationContext v_negation() {
			return getRuleContext(V_negationContext.class,0);
		}
		public V_dataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_data; }
	}

	public final V_dataContext v_data() throws RecognitionException {
		V_dataContext _localctx = new V_dataContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_v_data);
		int _la;
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(VARNAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(38);
					match(MINUS);
					}
				}

				setState(41);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(42);
					match(MINUS);
					}
				}

				setState(45);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				v_negation();
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
		enterRule(_localctx, 4, RULE_v_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(LBRACKET);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68727374856L) != 0)) {
				{
				setState(54);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case MINUS:
				case INT:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case VARNAME:
					{
					setState(52);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(53);
					v_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(66);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(56);
					match(COMMA);
					setState(59);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case NOT:
					case MINUS:
					case INT:
					case FLOAT:
					case STRING:
					case BOOLEAN:
					case VARNAME:
						{
						setState(57);
						v_data();
						}
						break;
					case LBRACKET:
						{
						setState(58);
						v_array();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(62);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(61);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(71);
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
		enterRule(_localctx, 6, RULE_v_arithmetic_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15872L) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_v_assignment_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 496L) != 0)) ) {
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
	public static class V_comparison_opContext extends ParserRuleContext {
		public TerminalNode GREATERTHAN() { return getToken(pythonParser.GREATERTHAN, 0); }
		public TerminalNode LESSTHAN() { return getToken(pythonParser.LESSTHAN, 0); }
		public TerminalNode EQUALTO() { return getToken(pythonParser.EQUALTO, 0); }
		public TerminalNode NOTEQUALTO() { return getToken(pythonParser.NOTEQUALTO, 0); }
		public TerminalNode GREATERTHANEQUAL() { return getToken(pythonParser.GREATERTHANEQUAL, 0); }
		public TerminalNode LESSTHANEQUAL() { return getToken(pythonParser.LESSTHANEQUAL, 0); }
		public TerminalNode AND() { return getToken(pythonParser.AND, 0); }
		public TerminalNode OR() { return getToken(pythonParser.OR, 0); }
		public V_comparison_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_comparison_op; }
	}

	public final V_comparison_opContext v_comparison_op() throws RecognitionException {
		V_comparison_opContext _localctx = new V_comparison_opContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_v_comparison_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734918L) != 0)) ) {
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
	public static class V_comparison_statementContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(pythonParser.LPAREN, 0); }
		public List<V_dataContext> v_data() {
			return getRuleContexts(V_dataContext.class);
		}
		public V_dataContext v_data(int i) {
			return getRuleContext(V_dataContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(pythonParser.RPAREN, 0); }
		public List<V_comparison_opContext> v_comparison_op() {
			return getRuleContexts(V_comparison_opContext.class);
		}
		public V_comparison_opContext v_comparison_op(int i) {
			return getRuleContext(V_comparison_opContext.class,i);
		}
		public V_comparison_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_comparison_statement; }
	}

	public final V_comparison_statementContext v_comparison_statement() throws RecognitionException {
		V_comparison_statementContext _localctx = new V_comparison_statementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_v_comparison_statement);
		int _la;
		try {
			int _alt;
			setState(100);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(LPAREN);
				setState(80);
				v_data();
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734918L) != 0)) {
					{
					{
					setState(81);
					v_comparison_op();
					setState(82);
					v_data();
					}
					}
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(89);
				match(RPAREN);
				}
				break;
			case NOT:
			case MINUS:
			case INT:
			case FLOAT:
			case STRING:
			case BOOLEAN:
			case VARNAME:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				v_data();
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(92);
						v_comparison_op();
						setState(93);
						v_data();
						}
						} 
					}
					setState(99);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68828169224L) != 0)) {
				{
				{
				setState(102);
				line();
				}
				}
				setState(107);
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
	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(pythonParser.NEWLINE, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_line);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				statement();
				setState(110);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				conditional();
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(119);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(116);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				arithmetic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				comparison();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(pythonParser.VARNAME, 0); }
		public V_assignment_opContext v_assignment_op() {
			return getRuleContext(V_assignment_opContext.class,0);
		}
		public ArithmeticContext arithmetic() {
			return getRuleContext(ArithmeticContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public V_dataContext v_data() {
			return getRuleContext(V_dataContext.class,0);
		}
		public V_arrayContext v_array() {
			return getRuleContext(V_arrayContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(VARNAME);
			setState(122);
			v_assignment_op();
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(125);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
				case MINUS:
				case INT:
				case FLOAT:
				case STRING:
				case BOOLEAN:
				case VARNAME:
					{
					setState(123);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(124);
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
				setState(127);
				arithmetic();
				}
				break;
			case 3:
				{
				setState(128);
				comparison();
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
		enterRule(_localctx, 22, RULE_arithmetic);
		int _la;
		try {
			int _alt;
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
			case MINUS:
			case INT:
			case FLOAT:
			case STRING:
			case BOOLEAN:
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				v_data();
				setState(137);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(132);
						v_arithmetic_op();
						setState(133);
						v_data();
						}
						} 
					}
					setState(139);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				v_array();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(141);
					match(PLUS);
					setState(142);
					v_array();
					}
					}
					setState(147);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonContext extends ParserRuleContext {
		public List<V_comparison_statementContext> v_comparison_statement() {
			return getRuleContexts(V_comparison_statementContext.class);
		}
		public V_comparison_statementContext v_comparison_statement(int i) {
			return getRuleContext(V_comparison_statementContext.class,i);
		}
		public List<V_comparison_opContext> v_comparison_op() {
			return getRuleContexts(V_comparison_opContext.class);
		}
		public V_comparison_opContext v_comparison_op(int i) {
			return getRuleContext(V_comparison_opContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			v_comparison_statement();
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734918L) != 0)) {
				{
				{
				setState(151);
				v_comparison_op();
				setState(152);
				v_comparison_statement();
				}
				}
				setState(158);
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
	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(IF);
			setState(160);
			comparison();
			setState(161);
			match(COLON);
			setState(163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(162);
				match(NEWLINE);
				}
				}
				setState(165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(167);
					match(TAB);
					setState(168);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Elif_blockContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(pythonParser.ELIF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Elif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_block; }
	}

	public final Elif_blockContext elif_block() throws RecognitionException {
		Elif_blockContext _localctx = new Elif_blockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elif_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ELIF);
			setState(174);
			comparison();
			setState(175);
			match(COLON);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(176);
				match(NEWLINE);
				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(183); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(181);
					match(TAB);
					setState(182);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(185); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(pythonParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ELSE);
			setState(188);
			match(COLON);
			setState(190); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(189);
				match(NEWLINE);
				}
				}
				setState(192); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(196); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(194);
					match(TAB);
					setState(195);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(198); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ConditionalContext extends ParserRuleContext {
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public List<Elif_blockContext> elif_block() {
			return getRuleContexts(Elif_blockContext.class);
		}
		public Elif_blockContext elif_block(int i) {
			return getRuleContext(Elif_blockContext.class,i);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_conditional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			if_block();
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(201);
					elif_block();
					}
					} 
				}
				setState(206);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(207);
				else_block();
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

	public static final String _serializedATN =
		"\u0004\u0001$\u00d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001(\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		",\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00027\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0003"+
		"\u0002?\b\u0002\u0005\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0003\u0002"+
		"F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006U\b\u0006\n\u0006\f\u0006X\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006`\b\u0006\n\u0006\f\u0006c\t\u0006\u0003\u0006e\b\u0006\u0001"+
		"\u0007\u0005\u0007h\b\u0007\n\u0007\f\u0007k\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\bs\b\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\tx\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n~\b\n\u0001\n\u0001\n\u0003"+
		"\n\u0082\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u0088\b\u000b\n\u000b\f\u000b\u008b\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u0090\b\u000b\n\u000b\f\u000b\u0093\t\u000b\u0003\u000b"+
		"\u0095\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u009b\b\f\n\f\f"+
		"\f\u009e\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00a4\b\r\u000b\r"+
		"\f\r\u00a5\u0001\r\u0001\r\u0004\r\u00aa\b\r\u000b\r\f\r\u00ab\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e\u00b2\b\u000e\u000b\u000e"+
		"\f\u000e\u00b3\u0001\u000e\u0001\u000e\u0004\u000e\u00b8\b\u000e\u000b"+
		"\u000e\f\u000e\u00b9\u0001\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00bf"+
		"\b\u000f\u000b\u000f\f\u000f\u00c0\u0001\u000f\u0001\u000f\u0004\u000f"+
		"\u00c5\b\u000f\u000b\u000f\f\u000f\u00c6\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00cb\b\u0010\n\u0010\f\u0010\u00ce\t\u0010\u0001\u0010\u0003\u0010"+
		"\u00d1\b\u0010\u0001\u0010\u0000\u0000\u0011\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \u0000\u0003"+
		"\u0001\u0000\t\r\u0001\u0000\u0004\b\u0002\u0000\u0001\u0002\u001e#\u00e5"+
		"\u0000\"\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000\u0000\u0004"+
		"3\u0001\u0000\u0000\u0000\u0006I\u0001\u0000\u0000\u0000\bK\u0001\u0000"+
		"\u0000\u0000\nM\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000e"+
		"i\u0001\u0000\u0000\u0000\u0010r\u0001\u0000\u0000\u0000\u0012w\u0001"+
		"\u0000\u0000\u0000\u0014y\u0001\u0000\u0000\u0000\u0016\u0094\u0001\u0000"+
		"\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u009f\u0001\u0000"+
		"\u0000\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e\u00bb\u0001\u0000"+
		"\u0000\u0000 \u00c8\u0001\u0000\u0000\u0000\"#\u0005\u0003\u0000\u0000"+
		"#$\u0003\u0002\u0001\u0000$\u0001\u0001\u0000\u0000\u0000%2\u0005$\u0000"+
		"\u0000&(\u0005\n\u0000\u0000\'&\u0001\u0000\u0000\u0000\'(\u0001\u0000"+
		"\u0000\u0000()\u0001\u0000\u0000\u0000)2\u0005\u0013\u0000\u0000*,\u0005"+
		"\n\u0000\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,-\u0001"+
		"\u0000\u0000\u0000-2\u0005\u0014\u0000\u0000.2\u0005\u0015\u0000\u0000"+
		"/2\u0005\u0016\u0000\u000002\u0003\u0000\u0000\u00001%\u0001\u0000\u0000"+
		"\u00001\'\u0001\u0000\u0000\u00001+\u0001\u0000\u0000\u00001.\u0001\u0000"+
		"\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0003"+
		"\u0001\u0000\u0000\u00003E\u0005\u000f\u0000\u000047\u0003\u0002\u0001"+
		"\u000057\u0003\u0004\u0002\u000064\u0001\u0000\u0000\u000065\u0001\u0000"+
		"\u0000\u00007B\u0001\u0000\u0000\u00008;\u0005\u000e\u0000\u00009<\u0003"+
		"\u0002\u0001\u0000:<\u0003\u0004\u0002\u0000;9\u0001\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=?\u0005\u000e\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?A\u0001\u0000"+
		"\u0000\u0000@8\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000"+
		"DB\u0001\u0000\u0000\u0000E6\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0010\u0000\u0000H\u0005\u0001"+
		"\u0000\u0000\u0000IJ\u0007\u0000\u0000\u0000J\u0007\u0001\u0000\u0000"+
		"\u0000KL\u0007\u0001\u0000\u0000L\t\u0001\u0000\u0000\u0000MN\u0007\u0002"+
		"\u0000\u0000N\u000b\u0001\u0000\u0000\u0000OP\u0005\u0011\u0000\u0000"+
		"PV\u0003\u0002\u0001\u0000QR\u0003\n\u0005\u0000RS\u0003\u0002\u0001\u0000"+
		"SU\u0001\u0000\u0000\u0000TQ\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WY\u0001\u0000"+
		"\u0000\u0000XV\u0001\u0000\u0000\u0000YZ\u0005\u0012\u0000\u0000Ze\u0001"+
		"\u0000\u0000\u0000[a\u0003\u0002\u0001\u0000\\]\u0003\n\u0005\u0000]^"+
		"\u0003\u0002\u0001\u0000^`\u0001\u0000\u0000\u0000_\\\u0001\u0000\u0000"+
		"\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000dO\u0001"+
		"\u0000\u0000\u0000d[\u0001\u0000\u0000\u0000e\r\u0001\u0000\u0000\u0000"+
		"fh\u0003\u0010\b\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000"+
		"ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000j\u000f\u0001\u0000"+
		"\u0000\u0000ki\u0001\u0000\u0000\u0000ls\u0005\u0019\u0000\u0000mn\u0003"+
		"\u0012\t\u0000no\u0005\u0019\u0000\u0000os\u0001\u0000\u0000\u0000ps\u0003"+
		"\u0012\t\u0000qs\u0003 \u0010\u0000rl\u0001\u0000\u0000\u0000rm\u0001"+
		"\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000"+
		"s\u0011\u0001\u0000\u0000\u0000tx\u0003\u0014\n\u0000ux\u0003\u0016\u000b"+
		"\u0000vx\u0003\u0018\f\u0000wt\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000"+
		"\u0000wv\u0001\u0000\u0000\u0000x\u0013\u0001\u0000\u0000\u0000yz\u0005"+
		"$\u0000\u0000z\u0081\u0003\b\u0004\u0000{~\u0003\u0002\u0001\u0000|~\u0003"+
		"\u0004\u0002\u0000}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000"+
		"~\u0082\u0001\u0000\u0000\u0000\u007f\u0082\u0003\u0016\u000b\u0000\u0080"+
		"\u0082\u0003\u0018\f\u0000\u0081}\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0081\u0080\u0001\u0000\u0000\u0000\u0082\u0015"+
		"\u0001\u0000\u0000\u0000\u0083\u0089\u0003\u0002\u0001\u0000\u0084\u0085"+
		"\u0003\u0006\u0003\u0000\u0085\u0086\u0003\u0002\u0001\u0000\u0086\u0088"+
		"\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u008b"+
		"\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a"+
		"\u0001\u0000\u0000\u0000\u008a\u0095\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u0091\u0003\u0004\u0002\u0000\u008d\u008e"+
		"\u0005\t\u0000\u0000\u008e\u0090\u0003\u0004\u0002\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u0090\u0093\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0095\u0001"+
		"\u0000\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0083\u0001"+
		"\u0000\u0000\u0000\u0094\u008c\u0001\u0000\u0000\u0000\u0095\u0017\u0001"+
		"\u0000\u0000\u0000\u0096\u009c\u0003\f\u0006\u0000\u0097\u0098\u0003\n"+
		"\u0005\u0000\u0098\u0099\u0003\f\u0006\u0000\u0099\u009b\u0001\u0000\u0000"+
		"\u0000\u009a\u0097\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000"+
		"\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000"+
		"\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0005\u001a\u0000\u0000\u00a0\u00a1\u0003\u0018\f\u0000"+
		"\u00a1\u00a3\u0005\u001d\u0000\u0000\u00a2\u00a4\u0005\u0019\u0000\u0000"+
		"\u00a3\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a9\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0017\u0000\u0000"+
		"\u00a8\u00aa\u0003\u0010\b\u0000\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa"+
		"\u00ab\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0005\u001c\u0000\u0000\u00ae\u00af\u0003\u0018\f\u0000\u00af\u00b1"+
		"\u0005\u001d\u0000\u0000\u00b0\u00b2\u0005\u0019\u0000\u0000\u00b1\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6\u00b8"+
		"\u0003\u0010\b\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001"+
		"\u0000\u0000\u0000\u00ba\u001d\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\u001b\u0000\u0000\u00bc\u00be\u0005\u001d\u0000\u0000\u00bd\u00bf\u0005"+
		"\u0019\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005"+
		"\u0017\u0000\u0000\u00c3\u00c5\u0003\u0010\b\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u001f\u0001\u0000"+
		"\u0000\u0000\u00c8\u00cc\u0003\u001a\r\u0000\u00c9\u00cb\u0003\u001c\u000e"+
		"\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cd\u00d0\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d1\u0003\u001e\u000f\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1!\u0001\u0000\u0000\u0000"+
		"\u001c\'+16;>BEVadirw}\u0081\u0089\u0091\u0094\u009c\u00a5\u00ab\u00b3"+
		"\u00b9\u00c0\u00c6\u00cc\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
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
		RULE_arithmetic = 11, RULE_comparison = 12, RULE_if_statement = 13, RULE_elif_statement = 14, 
		RULE_else_statement = 15, RULE_if_block = 16, RULE_elif_block = 17, RULE_else_block = 18, 
		RULE_conditional = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"v_negation", "v_data", "v_array", "v_arithmetic_op", "v_assignment_op", 
			"v_comparison_op", "v_comparison_statement", "start", "line", "statement", 
			"assignment", "arithmetic", "comparison", "if_statement", "elif_statement", 
			"else_statement", "if_block", "elif_block", "else_block", "conditional"
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
			setState(40);
			match(NOT);
			setState(41);
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				match(VARNAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(44);
					match(MINUS);
					}
				}

				setState(47);
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(48);
					match(MINUS);
					}
				}

				setState(51);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
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
			setState(57);
			match(LBRACKET);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68727374856L) != 0)) {
				{
				setState(60);
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
					setState(58);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(59);
					v_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(62);
					match(COMMA);
					setState(65);
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
						setState(63);
						v_data();
						}
						break;
					case LBRACKET:
						{
						setState(64);
						v_array();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(68);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(67);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(77);
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
			setState(79);
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
			setState(81);
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
			setState(83);
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
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(LPAREN);
				setState(86);
				v_data();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734918L) != 0)) {
					{
					{
					setState(87);
					v_comparison_op();
					setState(88);
					v_data();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
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
				setState(97);
				v_data();
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(98);
						v_comparison_op();
						setState(99);
						v_data();
						}
						} 
					}
					setState(105);
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
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 68828169224L) != 0)) {
				{
				{
				setState(108);
				line();
				}
				}
				setState(113);
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
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				statement();
				setState(116);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				arithmetic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
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
			setState(127);
			match(VARNAME);
			setState(128);
			v_assignment_op();
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(131);
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
					setState(129);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(130);
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
				setState(133);
				arithmetic();
				}
				break;
			case 3:
				{
				setState(134);
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
			setState(154);
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
				setState(137);
				v_data();
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(138);
						v_arithmetic_op();
						setState(139);
						v_data();
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				v_array();
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(147);
					match(PLUS);
					setState(148);
					v_array();
					}
					}
					setState(153);
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
			setState(156);
			v_comparison_statement();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 67645734918L) != 0)) {
				{
				{
				setState(157);
				v_comparison_op();
				setState(158);
				v_comparison_statement();
				}
				}
				setState(164);
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pythonParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_if_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IF);
			setState(166);
			comparison();
			setState(167);
			match(COLON);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
	public static class Elif_statementContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(pythonParser.ELIF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public Elif_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_statement; }
	}

	public final Elif_statementContext elif_statement() throws RecognitionException {
		Elif_statementContext _localctx = new Elif_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_elif_statement);
		int _la;
		try {
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
	public static class Else_statementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(pythonParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(ELSE);
			setState(182);
			match(COLON);
			setState(184); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				match(NEWLINE);
				}
				}
				setState(186); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
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
		enterRule(_localctx, 32, RULE_if_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			if_statement();
			setState(191); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(189);
					match(TAB);
					setState(190);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(193); 
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
	public static class Elif_blockContext extends ParserRuleContext {
		public Elif_statementContext elif_statement() {
			return getRuleContext(Elif_statementContext.class,0);
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
		enterRule(_localctx, 34, RULE_elif_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			elif_statement();
			setState(198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(196);
					match(TAB);
					setState(197);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
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
		enterRule(_localctx, 36, RULE_else_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			else_statement();
			setState(205); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(203);
					match(TAB);
					setState(204);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(207); 
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
		enterRule(_localctx, 38, RULE_conditional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			if_block();
			setState(213);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(210);
					elif_block();
					}
					} 
				}
				setState(215);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(216);
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
		"\u0004\u0001$\u00dc\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0003\u0001.\b\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"8\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0003"+
		"\u0002E\b\u0002\u0005\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0003\u0002"+
		"L\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006[\b\u0006\n\u0006\f\u0006^\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006f\b\u0006\n\u0006\f\u0006i\t\u0006\u0003\u0006k\b\u0006\u0001"+
		"\u0007\u0005\u0007n\b\u0007\n\u0007\f\u0007q\t\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\by\b\b\u0001\t\u0001\t\u0001\t\u0003"+
		"\t~\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0084\b\n\u0001\n\u0001"+
		"\n\u0003\n\u0088\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005"+
		"\u000b\u008e\b\u000b\n\u000b\f\u000b\u0091\t\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u0096\b\u000b\n\u000b\f\u000b\u0099\t\u000b\u0003"+
		"\u000b\u009b\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a1\b\f"+
		"\n\f\f\f\u00a4\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00aa\b\r\u000b"+
		"\r\f\r\u00ab\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u00b2\b\u000e\u000b\u000e\f\u000e\u00b3\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u00b9\b\u000f\u000b\u000f\f\u000f\u00ba\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0004\u0010\u00c0\b\u0010\u000b\u0010\f\u0010"+
		"\u00c1\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00c7\b\u0011\u000b"+
		"\u0011\f\u0011\u00c8\u0001\u0012\u0001\u0012\u0001\u0012\u0004\u0012\u00ce"+
		"\b\u0012\u000b\u0012\f\u0012\u00cf\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u00d4\b\u0013\n\u0013\f\u0013\u00d7\t\u0013\u0001\u0013\u0003\u0013\u00da"+
		"\b\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0003\u0001"+
		"\u0000\t\r\u0001\u0000\u0004\b\u0002\u0000\u0001\u0002\u001e#\u00eb\u0000"+
		"(\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u00049\u0001"+
		"\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bQ\u0001\u0000\u0000"+
		"\u0000\nS\u0001\u0000\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000eo\u0001"+
		"\u0000\u0000\u0000\u0010x\u0001\u0000\u0000\u0000\u0012}\u0001\u0000\u0000"+
		"\u0000\u0014\u007f\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000"+
		"\u0000\u0018\u009c\u0001\u0000\u0000\u0000\u001a\u00a5\u0001\u0000\u0000"+
		"\u0000\u001c\u00ad\u0001\u0000\u0000\u0000\u001e\u00b5\u0001\u0000\u0000"+
		"\u0000 \u00bc\u0001\u0000\u0000\u0000\"\u00c3\u0001\u0000\u0000\u0000"+
		"$\u00ca\u0001\u0000\u0000\u0000&\u00d1\u0001\u0000\u0000\u0000()\u0005"+
		"\u0003\u0000\u0000)*\u0003\u0002\u0001\u0000*\u0001\u0001\u0000\u0000"+
		"\u0000+8\u0005$\u0000\u0000,.\u0005\n\u0000\u0000-,\u0001\u0000\u0000"+
		"\u0000-.\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/8\u0005\u0013"+
		"\u0000\u000002\u0005\n\u0000\u000010\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000038\u0005\u0014\u0000\u000048\u0005"+
		"\u0015\u0000\u000058\u0005\u0016\u0000\u000068\u0003\u0000\u0000\u0000"+
		"7+\u0001\u0000\u0000\u00007-\u0001\u0000\u0000\u000071\u0001\u0000\u0000"+
		"\u000074\u0001\u0000\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000"+
		"\u0000\u00008\u0003\u0001\u0000\u0000\u00009K\u0005\u000f\u0000\u0000"+
		":=\u0003\u0002\u0001\u0000;=\u0003\u0004\u0002\u0000<:\u0001\u0000\u0000"+
		"\u0000<;\u0001\u0000\u0000\u0000=H\u0001\u0000\u0000\u0000>A\u0005\u000e"+
		"\u0000\u0000?B\u0003\u0002\u0001\u0000@B\u0003\u0004\u0002\u0000A?\u0001"+
		"\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BD\u0001\u0000\u0000\u0000"+
		"CE\u0005\u000e\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EG\u0001\u0000\u0000\u0000F>\u0001\u0000\u0000\u0000GJ\u0001\u0000"+
		"\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000K<\u0001\u0000\u0000\u0000"+
		"KL\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0005\u0010\u0000"+
		"\u0000N\u0005\u0001\u0000\u0000\u0000OP\u0007\u0000\u0000\u0000P\u0007"+
		"\u0001\u0000\u0000\u0000QR\u0007\u0001\u0000\u0000R\t\u0001\u0000\u0000"+
		"\u0000ST\u0007\u0002\u0000\u0000T\u000b\u0001\u0000\u0000\u0000UV\u0005"+
		"\u0011\u0000\u0000V\\\u0003\u0002\u0001\u0000WX\u0003\n\u0005\u0000XY"+
		"\u0003\u0002\u0001\u0000Y[\u0001\u0000\u0000\u0000ZW\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000"+
		"\u0000\u0000]_\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_`\u0005"+
		"\u0012\u0000\u0000`k\u0001\u0000\u0000\u0000ag\u0003\u0002\u0001\u0000"+
		"bc\u0003\n\u0005\u0000cd\u0003\u0002\u0001\u0000df\u0001\u0000\u0000\u0000"+
		"eb\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000jU\u0001\u0000\u0000\u0000ja\u0001\u0000\u0000\u0000k\r\u0001"+
		"\u0000\u0000\u0000ln\u0003\u0010\b\u0000ml\u0001\u0000\u0000\u0000nq\u0001"+
		"\u0000\u0000\u0000om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000"+
		"p\u000f\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000ry\u0005\u0019"+
		"\u0000\u0000st\u0003\u0012\t\u0000tu\u0005\u0019\u0000\u0000uy\u0001\u0000"+
		"\u0000\u0000vy\u0003\u0012\t\u0000wy\u0003&\u0013\u0000xr\u0001\u0000"+
		"\u0000\u0000xs\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xw\u0001"+
		"\u0000\u0000\u0000y\u0011\u0001\u0000\u0000\u0000z~\u0003\u0014\n\u0000"+
		"{~\u0003\u0016\u000b\u0000|~\u0003\u0018\f\u0000}z\u0001\u0000\u0000\u0000"+
		"}{\u0001\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0013\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0005$\u0000\u0000\u0080\u0087\u0003\b\u0004"+
		"\u0000\u0081\u0084\u0003\u0002\u0001\u0000\u0082\u0084\u0003\u0004\u0002"+
		"\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000"+
		"\u0000\u0084\u0088\u0001\u0000\u0000\u0000\u0085\u0088\u0003\u0016\u000b"+
		"\u0000\u0086\u0088\u0003\u0018\f\u0000\u0087\u0083\u0001\u0000\u0000\u0000"+
		"\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0088\u0015\u0001\u0000\u0000\u0000\u0089\u008f\u0003\u0002\u0001\u0000"+
		"\u008a\u008b\u0003\u0006\u0003\u0000\u008b\u008c\u0003\u0002\u0001\u0000"+
		"\u008c\u008e\u0001\u0000\u0000\u0000\u008d\u008a\u0001\u0000\u0000\u0000"+
		"\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000"+
		"\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u009b\u0001\u0000\u0000\u0000"+
		"\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0097\u0003\u0004\u0002\u0000"+
		"\u0093\u0094\u0005\t\u0000\u0000\u0094\u0096\u0003\u0004\u0002\u0000\u0095"+
		"\u0093\u0001\u0000\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097"+
		"\u0095\u0001\u0000\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098"+
		"\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a"+
		"\u0089\u0001\u0000\u0000\u0000\u009a\u0092\u0001\u0000\u0000\u0000\u009b"+
		"\u0017\u0001\u0000\u0000\u0000\u009c\u00a2\u0003\f\u0006\u0000\u009d\u009e"+
		"\u0003\n\u0005\u0000\u009e\u009f\u0003\f\u0006\u0000\u009f\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a0\u009d\u0001\u0000\u0000\u0000\u00a1\u00a4\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001"+
		"\u0000\u0000\u0000\u00a5\u00a6\u0005\u001a\u0000\u0000\u00a6\u00a7\u0003"+
		"\u0018\f\u0000\u00a7\u00a9\u0005\u001d\u0000\u0000\u00a8\u00aa\u0005\u0019"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ac\u001b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005\u001c"+
		"\u0000\u0000\u00ae\u00af\u0003\u0018\f\u0000\u00af\u00b1\u0005\u001d\u0000"+
		"\u0000\u00b0\u00b2\u0005\u0019\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000"+
		"\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u001d\u0001\u0000\u0000"+
		"\u0000\u00b5\u00b6\u0005\u001b\u0000\u0000\u00b6\u00b8\u0005\u001d\u0000"+
		"\u0000\u00b7\u00b9\u0005\u0019\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u001f\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bf\u0003\u001a\r\u0000\u00bd\u00be\u0005\u0017\u0000\u0000"+
		"\u00be\u00c0\u0003\u0010\b\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c1\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c2!\u0001\u0000\u0000\u0000\u00c3\u00c6"+
		"\u0003\u001c\u000e\u0000\u00c4\u00c5\u0005\u0017\u0000\u0000\u00c5\u00c7"+
		"\u0003\u0010\b\u0000\u00c6\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9\u0001"+
		"\u0000\u0000\u0000\u00c9#\u0001\u0000\u0000\u0000\u00ca\u00cd\u0003\u001e"+
		"\u000f\u0000\u00cb\u00cc\u0005\u0017\u0000\u0000\u00cc\u00ce\u0003\u0010"+
		"\b\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000"+
		"\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d0%\u0001\u0000\u0000\u0000\u00d1\u00d5\u0003 \u0010\u0000\u00d2"+
		"\u00d4\u0003\"\u0011\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d8\u00da\u0003$\u0012\u0000\u00d9\u00d8\u0001"+
		"\u0000\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\'\u0001\u0000"+
		"\u0000\u0000\u001c-17<ADHK\\gjox}\u0083\u0087\u008f\u0097\u009a\u00a2"+
		"\u00ab\u00b3\u00ba\u00c1\u00c8\u00cf\u00d5\u00d9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
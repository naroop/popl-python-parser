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
		BOOLEAN=22, TAB=23, WHITESPACE=24, NEWLINE=25, WHILE=26, FOR=27, RANGE=28, 
		IN=29, HASHTAG=30, BLOCKCOMMENT=31, IF=32, ELSE=33, ELIF=34, COLON=35, 
		GREATERTHAN=36, LESSTHAN=37, EQUALTO=38, NOTEQUALTO=39, GREATERTHANEQUAL=40, 
		LESSTHANEQUAL=41, VARNAME=42, COMMENT=43, MULTILINECOMMENT=44;
	public static final int
		RULE_v_negation = 0, RULE_v_data = 1, RULE_v_array = 2, RULE_v_arithmetic_op = 3, 
		RULE_v_assignment_op = 4, RULE_v_comparison_op = 5, RULE_v_comparison_statement = 6, 
		RULE_v_range = 7, RULE_v_iterable = 8, RULE_start = 9, RULE_line = 10, 
		RULE_statement = 11, RULE_assignment = 12, RULE_arithmetic = 13, RULE_comparison = 14, 
		RULE_if_block = 15, RULE_elif_block = 16, RULE_else_block = 17, RULE_conditional = 18, 
		RULE_while_block = 19, RULE_for_block = 20, RULE_loop = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"v_negation", "v_data", "v_array", "v_arithmetic_op", "v_assignment_op", 
			"v_comparison_op", "v_comparison_statement", "v_range", "v_iterable", 
			"start", "line", "statement", "assignment", "arithmetic", "comparison", 
			"if_block", "elif_block", "else_block", "conditional", "while_block", 
			"for_block", "loop"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'and'", "'or'", "'not'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "','", "'['", "']'", "'('", "')'", 
			null, null, null, null, null, null, null, "'while'", "'for'", "'range'", 
			"'in'", "'#'", "'''''", "'if'", "'else'", "'elif'", "':'", "'>'", "'<'", 
			"'=='", "'!='", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND", "OR", "NOT", "EQUAL", "PLUSEQUAL", "MINUSEQUAL", "MULTIPLYEQUAL", 
			"DIVIDEEQUAL", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "MOD", "COMMA", 
			"LBRACKET", "RBRACKET", "LPAREN", "RPAREN", "INT", "FLOAT", "STRING", 
			"BOOLEAN", "TAB", "WHITESPACE", "NEWLINE", "WHILE", "FOR", "RANGE", "IN", 
			"HASHTAG", "BLOCKCOMMENT", "IF", "ELSE", "ELIF", "COLON", "GREATERTHAN", 
			"LESSTHAN", "EQUALTO", "NOTEQUALTO", "GREATERTHANEQUAL", "LESSTHANEQUAL", 
			"VARNAME", "COMMENT", "MULTILINECOMMENT"
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
			setState(44);
			match(NOT);
			setState(45);
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
			setState(59);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(VARNAME);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
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
				match(INT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(52);
					match(MINUS);
					}
				}

				setState(55);
				match(FLOAT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				match(BOOLEAN);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(58);
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
			setState(61);
			match(LBRACKET);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4398054409224L) != 0)) {
				{
				setState(64);
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
					setState(62);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(63);
					v_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(66);
					match(COMMA);
					setState(69);
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
						setState(67);
						v_data();
						}
						break;
					case LBRACKET:
						{
						setState(68);
						v_array();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						setState(71);
						match(COMMA);
						}
						break;
					}
					}
					}
					setState(78);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(81);
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
			setState(83);
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
			setState(85);
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
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034374L) != 0)) ) {
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(LPAREN);
				setState(90);
				v_data();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034374L) != 0)) {
					{
					{
					setState(91);
					v_comparison_op();
					setState(92);
					v_data();
					}
					}
					setState(98);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(99);
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
				setState(101);
				v_data();
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(102);
						v_comparison_op();
						setState(103);
						v_data();
						}
						} 
					}
					setState(109);
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
	public static class V_rangeContext extends ParserRuleContext {
		public TerminalNode RANGE() { return getToken(pythonParser.RANGE, 0); }
		public TerminalNode LPAREN() { return getToken(pythonParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(pythonParser.RPAREN, 0); }
		public List<TerminalNode> INT() { return getTokens(pythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(pythonParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(pythonParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(pythonParser.FLOAT, i);
		}
		public TerminalNode COMMA() { return getToken(pythonParser.COMMA, 0); }
		public V_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_range; }
	}

	public final V_rangeContext v_range() throws RecognitionException {
		V_rangeContext _localctx = new V_rangeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_v_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(RANGE);
			setState(113);
			match(LPAREN);
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				{
				setState(114);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(115);
				match(COMMA);
				setState(116);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case 2:
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(120);
			match(RPAREN);
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
	public static class V_iterableContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(pythonParser.VARNAME, 0); }
		public V_arrayContext v_array() {
			return getRuleContext(V_arrayContext.class,0);
		}
		public V_rangeContext v_range() {
			return getRuleContext(V_rangeContext.class,0);
		}
		public V_iterableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_v_iterable; }
	}

	public final V_iterableContext v_iterable() throws RecognitionException {
		V_iterableContext _localctx = new V_iterableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_v_iterable);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(VARNAME);
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				v_array();
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				v_range();
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
		enterRule(_localctx, 18, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4402592777224L) != 0)) {
				{
				{
				setState(127);
				line();
				}
				}
				setState(132);
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
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_line);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				statement();
				setState(135);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(138);
				conditional();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				loop();
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				arithmetic();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
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
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(VARNAME);
			setState(148);
			v_assignment_op();
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(149);
				arithmetic();
				}
				break;
			case 2:
				{
				setState(152);
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
					setState(150);
					v_data();
					}
					break;
				case LBRACKET:
					{
					setState(151);
					v_array();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				{
				setState(154);
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
		enterRule(_localctx, 26, RULE_arithmetic);
		int _la;
		try {
			int _alt;
			setState(174);
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
				setState(157);
				v_data();
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(158);
						v_arithmetic_op();
						setState(159);
						v_data();
						}
						} 
					}
					setState(165);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				}
				}
				break;
			case LBRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				v_array();
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==PLUS) {
					{
					{
					setState(167);
					match(PLUS);
					setState(168);
					v_array();
					}
					}
					setState(173);
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
		enterRule(_localctx, 28, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			v_comparison_statement();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4329327034374L) != 0)) {
				{
				{
				setState(177);
				v_comparison_op();
				setState(178);
				v_comparison_statement();
				}
				}
				setState(184);
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
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
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
		enterRule(_localctx, 30, RULE_if_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(185);
				match(TAB);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(IF);
			setState(192);
			comparison();
			setState(193);
			match(COLON);
			setState(195); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(194);
				match(NEWLINE);
				}
				}
				setState(197); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(205); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(200); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(199);
							match(TAB);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(202); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class Elif_blockContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(pythonParser.ELIF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
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
		enterRule(_localctx, 32, RULE_elif_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(209);
				match(TAB);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(ELIF);
			setState(216);
			comparison();
			setState(217);
			match(COLON);
			setState(219); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(218);
				match(NEWLINE);
				}
				}
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(229); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(224); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(223);
							match(TAB);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(226); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(228);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(231); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
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
		enterRule(_localctx, 34, RULE_else_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(233);
				match(TAB);
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(ELSE);
			setState(240);
			match(COLON);
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				match(NEWLINE);
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(252); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(247); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(246);
							match(TAB);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(249); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(251);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(254); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 36, RULE_conditional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			if_block();
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(257);
					elif_block();
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(263);
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

	@SuppressWarnings("CheckReturnValue")
	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(pythonParser.WHILE, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_while_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(WHILE);
			setState(267);
			comparison();
			setState(268);
			match(COLON);
			setState(270); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(269);
				match(NEWLINE);
				}
				}
				setState(272); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(280); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(275); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(274);
							match(TAB);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(277); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(279);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(282); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
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
	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pythonParser.FOR, 0); }
		public TerminalNode VARNAME() { return getToken(pythonParser.VARNAME, 0); }
		public TerminalNode IN() { return getToken(pythonParser.IN, 0); }
		public V_iterableContext v_iterable() {
			return getRuleContext(V_iterableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(pythonParser.COLON, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(pythonParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(pythonParser.NEWLINE, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> TAB() { return getTokens(pythonParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(pythonParser.TAB, i);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_for_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(FOR);
			setState(285);
			match(VARNAME);
			setState(286);
			match(IN);
			setState(287);
			v_iterable();
			setState(288);
			match(COLON);
			setState(290); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(289);
				match(NEWLINE);
				}
				}
				setState(292); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(300); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(295); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(294);
							match(TAB);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(297); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(299);
					line();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(302); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
	public static class LoopContext extends ParserRuleContext {
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_loop);
		try {
			setState(306);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				while_block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				for_block();
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
		"\u0004\u0001,\u0135\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0001\u0001\u0001\u0003\u00016\b\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002F\b\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0005\u0002"+
		"K\b\u0002\n\u0002\f\u0002N\t\u0002\u0003\u0002P\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006_\b\u0006\n\u0006\f\u0006b\t\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006j\b\u0006\n\u0006"+
		"\f\u0006m\t\u0006\u0003\u0006o\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007w\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0003\b~\b\b\u0001\t\u0005\t\u0081"+
		"\b\t\n\t\f\t\u0084\t\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u008d\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0092\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0099\b"+
		"\f\u0001\f\u0003\f\u009c\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00a2"+
		"\b\r\n\r\f\r\u00a5\t\r\u0001\r\u0001\r\u0001\r\u0005\r\u00aa\b\r\n\r\f"+
		"\r\u00ad\t\r\u0003\r\u00af\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u00b5\b\u000e\n\u000e\f\u000e\u00b8\t\u000e\u0001\u000f"+
		"\u0005\u000f\u00bb\b\u000f\n\u000f\f\u000f\u00be\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u00c4\b\u000f\u000b\u000f\f"+
		"\u000f\u00c5\u0001\u000f\u0004\u000f\u00c9\b\u000f\u000b\u000f\f\u000f"+
		"\u00ca\u0001\u000f\u0004\u000f\u00ce\b\u000f\u000b\u000f\f\u000f\u00cf"+
		"\u0001\u0010\u0005\u0010\u00d3\b\u0010\n\u0010\f\u0010\u00d6\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010\u00dc\b\u0010\u000b"+
		"\u0010\f\u0010\u00dd\u0001\u0010\u0004\u0010\u00e1\b\u0010\u000b\u0010"+
		"\f\u0010\u00e2\u0001\u0010\u0004\u0010\u00e6\b\u0010\u000b\u0010\f\u0010"+
		"\u00e7\u0001\u0011\u0005\u0011\u00eb\b\u0011\n\u0011\f\u0011\u00ee\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0004\u0011\u00f3\b\u0011\u000b\u0011"+
		"\f\u0011\u00f4\u0001\u0011\u0004\u0011\u00f8\b\u0011\u000b\u0011\f\u0011"+
		"\u00f9\u0001\u0011\u0004\u0011\u00fd\b\u0011\u000b\u0011\f\u0011\u00fe"+
		"\u0001\u0012\u0001\u0012\u0005\u0012\u0103\b\u0012\n\u0012\f\u0012\u0106"+
		"\t\u0012\u0001\u0012\u0003\u0012\u0109\b\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0004\u0013\u010f\b\u0013\u000b\u0013\f\u0013"+
		"\u0110\u0001\u0013\u0004\u0013\u0114\b\u0013\u000b\u0013\f\u0013\u0115"+
		"\u0001\u0013\u0004\u0013\u0119\b\u0013\u000b\u0013\f\u0013\u011a\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0004"+
		"\u0014\u0123\b\u0014\u000b\u0014\f\u0014\u0124\u0001\u0014\u0004\u0014"+
		"\u0128\b\u0014\u000b\u0014\f\u0014\u0129\u0001\u0014\u0004\u0014\u012d"+
		"\b\u0014\u000b\u0014\f\u0014\u012e\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0133\b\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0004\u0001\u0000\t\r\u0001\u0000\u0004\b\u0002\u0000\u0001\u0002$)\u0001"+
		"\u0000\u0013\u0014\u0153\u0000,\u0001\u0000\u0000\u0000\u0002;\u0001\u0000"+
		"\u0000\u0000\u0004=\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000"+
		"\bU\u0001\u0000\u0000\u0000\nW\u0001\u0000\u0000\u0000\fn\u0001\u0000"+
		"\u0000\u0000\u000ep\u0001\u0000\u0000\u0000\u0010}\u0001\u0000\u0000\u0000"+
		"\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000\u0000\u0000"+
		"\u0016\u0091\u0001\u0000\u0000\u0000\u0018\u0093\u0001\u0000\u0000\u0000"+
		"\u001a\u00ae\u0001\u0000\u0000\u0000\u001c\u00b0\u0001\u0000\u0000\u0000"+
		"\u001e\u00bc\u0001\u0000\u0000\u0000 \u00d4\u0001\u0000\u0000\u0000\""+
		"\u00ec\u0001\u0000\u0000\u0000$\u0100\u0001\u0000\u0000\u0000&\u010a\u0001"+
		"\u0000\u0000\u0000(\u011c\u0001\u0000\u0000\u0000*\u0132\u0001\u0000\u0000"+
		"\u0000,-\u0005\u0003\u0000\u0000-.\u0003\u0002\u0001\u0000.\u0001\u0001"+
		"\u0000\u0000\u0000/<\u0005*\u0000\u000002\u0005\n\u0000\u000010\u0001"+
		"\u0000\u0000\u000012\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"3<\u0005\u0013\u0000\u000046\u0005\n\u0000\u000054\u0001\u0000\u0000\u0000"+
		"56\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007<\u0005\u0014\u0000"+
		"\u00008<\u0005\u0015\u0000\u00009<\u0005\u0016\u0000\u0000:<\u0003\u0000"+
		"\u0000\u0000;/\u0001\u0000\u0000\u0000;1\u0001\u0000\u0000\u0000;5\u0001"+
		"\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<\u0003\u0001\u0000\u0000\u0000=O\u0005\u000f"+
		"\u0000\u0000>A\u0003\u0002\u0001\u0000?A\u0003\u0004\u0002\u0000@>\u0001"+
		"\u0000\u0000\u0000@?\u0001\u0000\u0000\u0000AL\u0001\u0000\u0000\u0000"+
		"BE\u0005\u000e\u0000\u0000CF\u0003\u0002\u0001\u0000DF\u0003\u0004\u0002"+
		"\u0000EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FH\u0001\u0000"+
		"\u0000\u0000GI\u0005\u000e\u0000\u0000HG\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000"+
		"KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000O@\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0010\u0000\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0007\u0000\u0000"+
		"\u0000T\u0007\u0001\u0000\u0000\u0000UV\u0007\u0001\u0000\u0000V\t\u0001"+
		"\u0000\u0000\u0000WX\u0007\u0002\u0000\u0000X\u000b\u0001\u0000\u0000"+
		"\u0000YZ\u0005\u0011\u0000\u0000Z`\u0003\u0002\u0001\u0000[\\\u0003\n"+
		"\u0005\u0000\\]\u0003\u0002\u0001\u0000]_\u0001\u0000\u0000\u0000^[\u0001"+
		"\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000ac\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000"+
		"\u0000cd\u0005\u0012\u0000\u0000do\u0001\u0000\u0000\u0000ek\u0003\u0002"+
		"\u0001\u0000fg\u0003\n\u0005\u0000gh\u0003\u0002\u0001\u0000hj\u0001\u0000"+
		"\u0000\u0000if\u0001\u0000\u0000\u0000jm\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000kl\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000"+
		"mk\u0001\u0000\u0000\u0000nY\u0001\u0000\u0000\u0000ne\u0001\u0000\u0000"+
		"\u0000o\r\u0001\u0000\u0000\u0000pq\u0005\u001c\u0000\u0000qv\u0005\u0011"+
		"\u0000\u0000rs\u0007\u0003\u0000\u0000st\u0005\u000e\u0000\u0000tw\u0007"+
		"\u0003\u0000\u0000uw\u0007\u0003\u0000\u0000vr\u0001\u0000\u0000\u0000"+
		"vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xy\u0005\u0012\u0000"+
		"\u0000y\u000f\u0001\u0000\u0000\u0000z~\u0005*\u0000\u0000{~\u0003\u0004"+
		"\u0002\u0000|~\u0003\u000e\u0007\u0000}z\u0001\u0000\u0000\u0000}{\u0001"+
		"\u0000\u0000\u0000}|\u0001\u0000\u0000\u0000~\u0011\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0003\u0014\n\u0000\u0080\u007f\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0085\u008d\u0005\u0019\u0000\u0000"+
		"\u0086\u0087\u0003\u0016\u000b\u0000\u0087\u0088\u0005\u0019\u0000\u0000"+
		"\u0088\u008d\u0001\u0000\u0000\u0000\u0089\u008d\u0003\u0016\u000b\u0000"+
		"\u008a\u008d\u0003$\u0012\u0000\u008b\u008d\u0003*\u0015\u0000\u008c\u0085"+
		"\u0001\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0089"+
		"\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u0015\u0001\u0000\u0000\u0000\u008e\u0092"+
		"\u0003\u0018\f\u0000\u008f\u0092\u0003\u001a\r\u0000\u0090\u0092\u0003"+
		"\u001c\u000e\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\u0017\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0005*\u0000\u0000\u0094\u009b\u0003\b"+
		"\u0004\u0000\u0095\u009c\u0003\u001a\r\u0000\u0096\u0099\u0003\u0002\u0001"+
		"\u0000\u0097\u0099\u0003\u0004\u0002\u0000\u0098\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u009c\u0003\u001c\u000e\u0000\u009b\u0095\u0001\u0000\u0000"+
		"\u0000\u009b\u0098\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000\u0000"+
		"\u0000\u009c\u0019\u0001\u0000\u0000\u0000\u009d\u00a3\u0003\u0002\u0001"+
		"\u0000\u009e\u009f\u0003\u0006\u0003\u0000\u009f\u00a0\u0003\u0002\u0001"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009e\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a1\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00af\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a3\u0001\u0000\u0000\u0000\u00a6\u00ab\u0003\u0004\u0002"+
		"\u0000\u00a7\u00a8\u0005\t\u0000\u0000\u00a8\u00aa\u0003\u0004\u0002\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000"+
		"\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000"+
		"\u00ae\u009d\u0001\u0000\u0000\u0000\u00ae\u00a6\u0001\u0000\u0000\u0000"+
		"\u00af\u001b\u0001\u0000\u0000\u0000\u00b0\u00b6\u0003\f\u0006\u0000\u00b1"+
		"\u00b2\u0003\n\u0005\u0000\u00b2\u00b3\u0003\f\u0006\u0000\u00b3\u00b5"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b1\u0001\u0000\u0000\u0000\u00b5\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u001d\u0001\u0000\u0000\u0000\u00b8\u00b6"+
		"\u0001\u0000\u0000\u0000\u00b9\u00bb\u0005\u0017\u0000\u0000\u00ba\u00b9"+
		"\u0001\u0000\u0000\u0000\u00bb\u00be\u0001\u0000\u0000\u0000\u00bc\u00ba"+
		"\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00bf"+
		"\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00bf\u00c0"+
		"\u0005 \u0000\u0000\u00c0\u00c1\u0003\u001c\u000e\u0000\u00c1\u00c3\u0005"+
		"#\u0000\u0000\u00c2\u00c4\u0005\u0019\u0000\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00cd\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c9\u0005\u0017\u0000\u0000\u00c8\u00c7\u0001\u0000"+
		"\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ce\u0003\u0014\n\u0000\u00cd\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u001f\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d3\u0005\u0017\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\"\u0000\u0000"+
		"\u00d8\u00d9\u0003\u001c\u000e\u0000\u00d9\u00db\u0005#\u0000\u0000\u00da"+
		"\u00dc\u0005\u0019\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00e5\u0001\u0000\u0000\u0000\u00df"+
		"\u00e1\u0005\u0017\u0000\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0003\u0014\n\u0000\u00e5\u00e0\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8!\u0001\u0000\u0000\u0000\u00e9\u00eb\u0005"+
		"\u0017\u0000\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005!\u0000\u0000\u00f0\u00f2\u0005#\u0000"+
		"\u0000\u00f1\u00f3\u0005\u0019\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00fc\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f8\u0005\u0017\u0000\u0000\u00f7\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000"+
		"\u0000\u00fb\u00fd\u0003\u0014\n\u0000\u00fc\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff#\u0001\u0000\u0000\u0000\u0100"+
		"\u0104\u0003\u001e\u000f\u0000\u0101\u0103\u0003 \u0010\u0000\u0102\u0101"+
		"\u0001\u0000\u0000\u0000\u0103\u0106\u0001\u0000\u0000\u0000\u0104\u0102"+
		"\u0001\u0000\u0000\u0000\u0104\u0105\u0001\u0000\u0000\u0000\u0105\u0108"+
		"\u0001\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0107\u0109"+
		"\u0003\"\u0011\u0000\u0108\u0107\u0001\u0000\u0000\u0000\u0108\u0109\u0001"+
		"\u0000\u0000\u0000\u0109%\u0001\u0000\u0000\u0000\u010a\u010b\u0005\u001a"+
		"\u0000\u0000\u010b\u010c\u0003\u001c\u000e\u0000\u010c\u010e\u0005#\u0000"+
		"\u0000\u010d\u010f\u0005\u0019\u0000\u0000\u010e\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0118\u0001\u0000\u0000"+
		"\u0000\u0112\u0114\u0005\u0017\u0000\u0000\u0113\u0112\u0001\u0000\u0000"+
		"\u0000\u0114\u0115\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0119\u0003\u0014\n\u0000\u0118\u0113\u0001\u0000\u0000\u0000"+
		"\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000\u0000\u0000"+
		"\u011a\u011b\u0001\u0000\u0000\u0000\u011b\'\u0001\u0000\u0000\u0000\u011c"+
		"\u011d\u0005\u001b\u0000\u0000\u011d\u011e\u0005*\u0000\u0000\u011e\u011f"+
		"\u0005\u001d\u0000\u0000\u011f\u0120\u0003\u0010\b\u0000\u0120\u0122\u0005"+
		"#\u0000\u0000\u0121\u0123\u0005\u0019\u0000\u0000\u0122\u0121\u0001\u0000"+
		"\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000"+
		"\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u012c\u0001\u0000"+
		"\u0000\u0000\u0126\u0128\u0005\u0017\u0000\u0000\u0127\u0126\u0001\u0000"+
		"\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000"+
		"\u0000\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0001\u0000"+
		"\u0000\u0000\u012b\u012d\u0003\u0014\n\u0000\u012c\u0127\u0001\u0000\u0000"+
		"\u0000\u012d\u012e\u0001\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000"+
		"\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f)\u0001\u0000\u0000\u0000"+
		"\u0130\u0133\u0003&\u0013\u0000\u0131\u0133\u0003(\u0014\u0000\u0132\u0130"+
		"\u0001\u0000\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0133+\u0001"+
		"\u0000\u0000\u0000+15;@EHLO`knv}\u0082\u008c\u0091\u0098\u009b\u00a3\u00ab"+
		"\u00ae\u00b6\u00bc\u00c5\u00ca\u00cf\u00d4\u00dd\u00e2\u00e7\u00ec\u00f4"+
		"\u00f9\u00fe\u0104\u0108\u0110\u0115\u011a\u0124\u0129\u012e\u0132";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
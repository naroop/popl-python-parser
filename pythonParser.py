# Generated from python.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,19,83,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,1,0,1,0,1,1,1,1,1,1,3,1,20,8,1,1,1,1,1,1,1,3,1,25,8,1,1,1,3,1,
        28,8,1,5,1,30,8,1,10,1,12,1,33,9,1,3,1,35,8,1,1,1,1,1,1,2,1,2,1,
        3,1,3,1,4,1,4,5,4,45,8,4,10,4,12,4,48,9,4,1,5,1,5,1,5,1,5,3,5,54,
        8,5,1,5,5,5,57,8,5,10,5,12,5,60,9,5,3,5,62,8,5,1,6,1,6,1,6,1,6,5,
        6,68,8,6,10,6,12,6,71,9,6,1,6,1,6,1,6,5,6,76,8,6,10,6,12,6,79,9,
        6,3,6,81,8,6,1,6,0,0,7,0,2,4,6,8,10,12,0,3,2,0,1,1,15,18,1,0,7,11,
        1,0,2,6,88,0,14,1,0,0,0,2,16,1,0,0,0,4,38,1,0,0,0,6,40,1,0,0,0,8,
        46,1,0,0,0,10,49,1,0,0,0,12,80,1,0,0,0,14,15,7,0,0,0,15,1,1,0,0,
        0,16,34,5,13,0,0,17,20,3,0,0,0,18,20,3,2,1,0,19,17,1,0,0,0,19,18,
        1,0,0,0,20,31,1,0,0,0,21,24,5,12,0,0,22,25,3,0,0,0,23,25,3,2,1,0,
        24,22,1,0,0,0,24,23,1,0,0,0,25,27,1,0,0,0,26,28,5,12,0,0,27,26,1,
        0,0,0,27,28,1,0,0,0,28,30,1,0,0,0,29,21,1,0,0,0,30,33,1,0,0,0,31,
        29,1,0,0,0,31,32,1,0,0,0,32,35,1,0,0,0,33,31,1,0,0,0,34,19,1,0,0,
        0,34,35,1,0,0,0,35,36,1,0,0,0,36,37,5,14,0,0,37,3,1,0,0,0,38,39,
        7,1,0,0,39,5,1,0,0,0,40,41,7,2,0,0,41,7,1,0,0,0,42,45,3,10,5,0,43,
        45,3,12,6,0,44,42,1,0,0,0,44,43,1,0,0,0,45,48,1,0,0,0,46,44,1,0,
        0,0,46,47,1,0,0,0,47,9,1,0,0,0,48,46,1,0,0,0,49,50,5,1,0,0,50,61,
        3,6,3,0,51,54,3,0,0,0,52,54,3,2,1,0,53,51,1,0,0,0,53,52,1,0,0,0,
        54,62,1,0,0,0,55,57,3,12,6,0,56,55,1,0,0,0,57,60,1,0,0,0,58,56,1,
        0,0,0,58,59,1,0,0,0,59,62,1,0,0,0,60,58,1,0,0,0,61,53,1,0,0,0,61,
        58,1,0,0,0,62,11,1,0,0,0,63,69,3,0,0,0,64,65,3,4,2,0,65,66,3,0,0,
        0,66,68,1,0,0,0,67,64,1,0,0,0,68,71,1,0,0,0,69,67,1,0,0,0,69,70,
        1,0,0,0,70,81,1,0,0,0,71,69,1,0,0,0,72,77,3,2,1,0,73,74,5,7,0,0,
        74,76,3,2,1,0,75,73,1,0,0,0,76,79,1,0,0,0,77,75,1,0,0,0,77,78,1,
        0,0,0,78,81,1,0,0,0,79,77,1,0,0,0,80,63,1,0,0,0,80,72,1,0,0,0,81,
        13,1,0,0,0,13,19,24,27,31,34,44,46,53,58,61,69,77,80
    ]

class pythonParser ( Parser ):

    grammarFileName = "python.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'='", "'+='", "'-='", "'*='", 
                     "'/='", "'+'", "'-'", "'*'", "'/'", "'%'", "','", "'['", 
                     "']'" ]

    symbolicNames = [ "<INVALID>", "VARNAME", "EQUAL", "PLUSEQUAL", "MINUSEQUAL", 
                      "MULTIPLYEQUAL", "DIVIDEEQUAL", "PLUS", "MINUS", "MULTIPLY", 
                      "DIVIDE", "MOD", "COMMA", "LBRACKET", "RBRACKET", 
                      "INT", "FLOAT", "STRING", "BOOLEAN", "WHITESPACE" ]

    RULE_v_data = 0
    RULE_v_array = 1
    RULE_v_arithmetic_op = 2
    RULE_v_assignment_op = 3
    RULE_start = 4
    RULE_assignment = 5
    RULE_arithmetic = 6

    ruleNames =  [ "v_data", "v_array", "v_arithmetic_op", "v_assignment_op", 
                   "start", "assignment", "arithmetic" ]

    EOF = Token.EOF
    VARNAME=1
    EQUAL=2
    PLUSEQUAL=3
    MINUSEQUAL=4
    MULTIPLYEQUAL=5
    DIVIDEEQUAL=6
    PLUS=7
    MINUS=8
    MULTIPLY=9
    DIVIDE=10
    MOD=11
    COMMA=12
    LBRACKET=13
    RBRACKET=14
    INT=15
    FLOAT=16
    STRING=17
    BOOLEAN=18
    WHITESPACE=19

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class V_dataContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(pythonParser.VARNAME, 0)

        def INT(self):
            return self.getToken(pythonParser.INT, 0)

        def FLOAT(self):
            return self.getToken(pythonParser.FLOAT, 0)

        def STRING(self):
            return self.getToken(pythonParser.STRING, 0)

        def BOOLEAN(self):
            return self.getToken(pythonParser.BOOLEAN, 0)

        def getRuleIndex(self):
            return pythonParser.RULE_v_data

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterV_data" ):
                listener.enterV_data(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitV_data" ):
                listener.exitV_data(self)




    def v_data(self):

        localctx = pythonParser.V_dataContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_v_data)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 14
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 491522) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class V_arrayContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LBRACKET(self):
            return self.getToken(pythonParser.LBRACKET, 0)

        def RBRACKET(self):
            return self.getToken(pythonParser.RBRACKET, 0)

        def v_data(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.V_dataContext)
            else:
                return self.getTypedRuleContext(pythonParser.V_dataContext,i)


        def v_array(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.V_arrayContext)
            else:
                return self.getTypedRuleContext(pythonParser.V_arrayContext,i)


        def COMMA(self, i:int=None):
            if i is None:
                return self.getTokens(pythonParser.COMMA)
            else:
                return self.getToken(pythonParser.COMMA, i)

        def getRuleIndex(self):
            return pythonParser.RULE_v_array

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterV_array" ):
                listener.enterV_array(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitV_array" ):
                listener.exitV_array(self)




    def v_array(self):

        localctx = pythonParser.V_arrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_v_array)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 16
            self.match(pythonParser.LBRACKET)
            self.state = 34
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 499714) != 0):
                self.state = 19
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1, 15, 16, 17, 18]:
                    self.state = 17
                    self.v_data()
                    pass
                elif token in [13]:
                    self.state = 18
                    self.v_array()
                    pass
                else:
                    raise NoViableAltException(self)

                self.state = 31
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==12:
                    self.state = 21
                    self.match(pythonParser.COMMA)
                    self.state = 24
                    self._errHandler.sync(self)
                    token = self._input.LA(1)
                    if token in [1, 15, 16, 17, 18]:
                        self.state = 22
                        self.v_data()
                        pass
                    elif token in [13]:
                        self.state = 23
                        self.v_array()
                        pass
                    else:
                        raise NoViableAltException(self)

                    self.state = 27
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        self.state = 26
                        self.match(pythonParser.COMMA)


                    self.state = 33
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)



            self.state = 36
            self.match(pythonParser.RBRACKET)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class V_arithmetic_opContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PLUS(self):
            return self.getToken(pythonParser.PLUS, 0)

        def MINUS(self):
            return self.getToken(pythonParser.MINUS, 0)

        def MULTIPLY(self):
            return self.getToken(pythonParser.MULTIPLY, 0)

        def DIVIDE(self):
            return self.getToken(pythonParser.DIVIDE, 0)

        def MOD(self):
            return self.getToken(pythonParser.MOD, 0)

        def getRuleIndex(self):
            return pythonParser.RULE_v_arithmetic_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterV_arithmetic_op" ):
                listener.enterV_arithmetic_op(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitV_arithmetic_op" ):
                listener.exitV_arithmetic_op(self)




    def v_arithmetic_op(self):

        localctx = pythonParser.V_arithmetic_opContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_v_arithmetic_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 38
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 3968) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class V_assignment_opContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EQUAL(self):
            return self.getToken(pythonParser.EQUAL, 0)

        def PLUSEQUAL(self):
            return self.getToken(pythonParser.PLUSEQUAL, 0)

        def MINUSEQUAL(self):
            return self.getToken(pythonParser.MINUSEQUAL, 0)

        def MULTIPLYEQUAL(self):
            return self.getToken(pythonParser.MULTIPLYEQUAL, 0)

        def DIVIDEEQUAL(self):
            return self.getToken(pythonParser.DIVIDEEQUAL, 0)

        def getRuleIndex(self):
            return pythonParser.RULE_v_assignment_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterV_assignment_op" ):
                listener.enterV_assignment_op(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitV_assignment_op" ):
                listener.exitV_assignment_op(self)




    def v_assignment_op(self):

        localctx = pythonParser.V_assignment_opContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_v_assignment_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 40
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 124) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StartContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.AssignmentContext)
            else:
                return self.getTypedRuleContext(pythonParser.AssignmentContext,i)


        def arithmetic(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.ArithmeticContext)
            else:
                return self.getTypedRuleContext(pythonParser.ArithmeticContext,i)


        def getRuleIndex(self):
            return pythonParser.RULE_start

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStart" ):
                listener.enterStart(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStart" ):
                listener.exitStart(self)




    def start(self):

        localctx = pythonParser.StartContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_start)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 46
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 499714) != 0):
                self.state = 44
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
                if la_ == 1:
                    self.state = 42
                    self.assignment()
                    pass

                elif la_ == 2:
                    self.state = 43
                    self.arithmetic()
                    pass


                self.state = 48
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARNAME(self):
            return self.getToken(pythonParser.VARNAME, 0)

        def v_assignment_op(self):
            return self.getTypedRuleContext(pythonParser.V_assignment_opContext,0)


        def v_data(self):
            return self.getTypedRuleContext(pythonParser.V_dataContext,0)


        def v_array(self):
            return self.getTypedRuleContext(pythonParser.V_arrayContext,0)


        def arithmetic(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.ArithmeticContext)
            else:
                return self.getTypedRuleContext(pythonParser.ArithmeticContext,i)


        def getRuleIndex(self):
            return pythonParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)




    def assignment(self):

        localctx = pythonParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_assignment)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 49
            self.match(pythonParser.VARNAME)
            self.state = 50
            self.v_assignment_op()
            self.state = 61
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.state = 53
                self._errHandler.sync(self)
                token = self._input.LA(1)
                if token in [1, 15, 16, 17, 18]:
                    self.state = 51
                    self.v_data()
                    pass
                elif token in [13]:
                    self.state = 52
                    self.v_array()
                    pass
                else:
                    raise NoViableAltException(self)

                pass

            elif la_ == 2:
                self.state = 58
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,8,self._ctx)
                while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                    if _alt==1:
                        self.state = 55
                        self.arithmetic() 
                    self.state = 60
                    self._errHandler.sync(self)
                    _alt = self._interp.adaptivePredict(self._input,8,self._ctx)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArithmeticContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def v_data(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.V_dataContext)
            else:
                return self.getTypedRuleContext(pythonParser.V_dataContext,i)


        def v_arithmetic_op(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.V_arithmetic_opContext)
            else:
                return self.getTypedRuleContext(pythonParser.V_arithmetic_opContext,i)


        def v_array(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(pythonParser.V_arrayContext)
            else:
                return self.getTypedRuleContext(pythonParser.V_arrayContext,i)


        def PLUS(self, i:int=None):
            if i is None:
                return self.getTokens(pythonParser.PLUS)
            else:
                return self.getToken(pythonParser.PLUS, i)

        def getRuleIndex(self):
            return pythonParser.RULE_arithmetic

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArithmetic" ):
                listener.enterArithmetic(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArithmetic" ):
                listener.exitArithmetic(self)




    def arithmetic(self):

        localctx = pythonParser.ArithmeticContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_arithmetic)
        self._la = 0 # Token type
        try:
            self.state = 80
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [1, 15, 16, 17, 18]:
                self.enterOuterAlt(localctx, 1)
                self.state = 63
                self.v_data()
                self.state = 69
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 3968) != 0):
                    self.state = 64
                    self.v_arithmetic_op()
                    self.state = 65
                    self.v_data()
                    self.state = 71
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            elif token in [13]:
                self.enterOuterAlt(localctx, 2)
                self.state = 72
                self.v_array()
                self.state = 77
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==7:
                    self.state = 73
                    self.match(pythonParser.PLUS)
                    self.state = 74
                    self.v_array()
                    self.state = 79
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx






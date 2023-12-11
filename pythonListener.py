# Generated from python.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .pythonParser import pythonParser
else:
    from pythonParser import pythonParser

# This class defines a complete listener for a parse tree produced by pythonParser.
class pythonListener(ParseTreeListener):

    # Enter a parse tree produced by pythonParser#v_negation.
    def enterV_negation(self, ctx:pythonParser.V_negationContext):
        pass

    # Exit a parse tree produced by pythonParser#v_negation.
    def exitV_negation(self, ctx:pythonParser.V_negationContext):
        pass


    # Enter a parse tree produced by pythonParser#v_data.
    def enterV_data(self, ctx:pythonParser.V_dataContext):
        pass

    # Exit a parse tree produced by pythonParser#v_data.
    def exitV_data(self, ctx:pythonParser.V_dataContext):
        pass


    # Enter a parse tree produced by pythonParser#v_array.
    def enterV_array(self, ctx:pythonParser.V_arrayContext):
        pass

    # Exit a parse tree produced by pythonParser#v_array.
    def exitV_array(self, ctx:pythonParser.V_arrayContext):
        pass


    # Enter a parse tree produced by pythonParser#v_arithmetic_op.
    def enterV_arithmetic_op(self, ctx:pythonParser.V_arithmetic_opContext):
        pass

    # Exit a parse tree produced by pythonParser#v_arithmetic_op.
    def exitV_arithmetic_op(self, ctx:pythonParser.V_arithmetic_opContext):
        pass


    # Enter a parse tree produced by pythonParser#v_assignment_op.
    def enterV_assignment_op(self, ctx:pythonParser.V_assignment_opContext):
        pass

    # Exit a parse tree produced by pythonParser#v_assignment_op.
    def exitV_assignment_op(self, ctx:pythonParser.V_assignment_opContext):
        pass


    # Enter a parse tree produced by pythonParser#v_comparison_op.
    def enterV_comparison_op(self, ctx:pythonParser.V_comparison_opContext):
        pass

    # Exit a parse tree produced by pythonParser#v_comparison_op.
    def exitV_comparison_op(self, ctx:pythonParser.V_comparison_opContext):
        pass


    # Enter a parse tree produced by pythonParser#v_comparison_statement.
    def enterV_comparison_statement(self, ctx:pythonParser.V_comparison_statementContext):
        pass

    # Exit a parse tree produced by pythonParser#v_comparison_statement.
    def exitV_comparison_statement(self, ctx:pythonParser.V_comparison_statementContext):
        pass


    # Enter a parse tree produced by pythonParser#v_range.
    def enterV_range(self, ctx:pythonParser.V_rangeContext):
        pass

    # Exit a parse tree produced by pythonParser#v_range.
    def exitV_range(self, ctx:pythonParser.V_rangeContext):
        pass


    # Enter a parse tree produced by pythonParser#v_iterable.
    def enterV_iterable(self, ctx:pythonParser.V_iterableContext):
        pass

    # Exit a parse tree produced by pythonParser#v_iterable.
    def exitV_iterable(self, ctx:pythonParser.V_iterableContext):
        pass


    # Enter a parse tree produced by pythonParser#start.
    def enterStart(self, ctx:pythonParser.StartContext):
        pass

    # Exit a parse tree produced by pythonParser#start.
    def exitStart(self, ctx:pythonParser.StartContext):
        pass


    # Enter a parse tree produced by pythonParser#line.
    def enterLine(self, ctx:pythonParser.LineContext):
        pass

    # Exit a parse tree produced by pythonParser#line.
    def exitLine(self, ctx:pythonParser.LineContext):
        pass


    # Enter a parse tree produced by pythonParser#statement.
    def enterStatement(self, ctx:pythonParser.StatementContext):
        pass

    # Exit a parse tree produced by pythonParser#statement.
    def exitStatement(self, ctx:pythonParser.StatementContext):
        pass


    # Enter a parse tree produced by pythonParser#assignment.
    def enterAssignment(self, ctx:pythonParser.AssignmentContext):
        pass

    # Exit a parse tree produced by pythonParser#assignment.
    def exitAssignment(self, ctx:pythonParser.AssignmentContext):
        pass


    # Enter a parse tree produced by pythonParser#arithmetic.
    def enterArithmetic(self, ctx:pythonParser.ArithmeticContext):
        pass

    # Exit a parse tree produced by pythonParser#arithmetic.
    def exitArithmetic(self, ctx:pythonParser.ArithmeticContext):
        pass


    # Enter a parse tree produced by pythonParser#comparison.
    def enterComparison(self, ctx:pythonParser.ComparisonContext):
        pass

    # Exit a parse tree produced by pythonParser#comparison.
    def exitComparison(self, ctx:pythonParser.ComparisonContext):
        pass


    # Enter a parse tree produced by pythonParser#if_block.
    def enterIf_block(self, ctx:pythonParser.If_blockContext):
        pass

    # Exit a parse tree produced by pythonParser#if_block.
    def exitIf_block(self, ctx:pythonParser.If_blockContext):
        pass


    # Enter a parse tree produced by pythonParser#elif_block.
    def enterElif_block(self, ctx:pythonParser.Elif_blockContext):
        pass

    # Exit a parse tree produced by pythonParser#elif_block.
    def exitElif_block(self, ctx:pythonParser.Elif_blockContext):
        pass


    # Enter a parse tree produced by pythonParser#else_block.
    def enterElse_block(self, ctx:pythonParser.Else_blockContext):
        pass

    # Exit a parse tree produced by pythonParser#else_block.
    def exitElse_block(self, ctx:pythonParser.Else_blockContext):
        pass


    # Enter a parse tree produced by pythonParser#conditional.
    def enterConditional(self, ctx:pythonParser.ConditionalContext):
        pass

    # Exit a parse tree produced by pythonParser#conditional.
    def exitConditional(self, ctx:pythonParser.ConditionalContext):
        pass


    # Enter a parse tree produced by pythonParser#while_block.
    def enterWhile_block(self, ctx:pythonParser.While_blockContext):
        pass

    # Exit a parse tree produced by pythonParser#while_block.
    def exitWhile_block(self, ctx:pythonParser.While_blockContext):
        pass


    # Enter a parse tree produced by pythonParser#for_block.
    def enterFor_block(self, ctx:pythonParser.For_blockContext):
        pass

    # Exit a parse tree produced by pythonParser#for_block.
    def exitFor_block(self, ctx:pythonParser.For_blockContext):
        pass


    # Enter a parse tree produced by pythonParser#loop.
    def enterLoop(self, ctx:pythonParser.LoopContext):
        pass

    # Exit a parse tree produced by pythonParser#loop.
    def exitLoop(self, ctx:pythonParser.LoopContext):
        pass



del pythonParser
# Generated from python.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .pythonParser import pythonParser
else:
    from pythonParser import pythonParser

# This class defines a complete listener for a parse tree produced by pythonParser.
class pythonListener(ParseTreeListener):

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


    # Enter a parse tree produced by pythonParser#start.
    def enterStart(self, ctx:pythonParser.StartContext):
        pass

    # Exit a parse tree produced by pythonParser#start.
    def exitStart(self, ctx:pythonParser.StartContext):
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



del pythonParser
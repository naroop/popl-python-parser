import sys
from antlr4 import *
from pythonLexer import pythonLexer
from pythonParser import pythonParser


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = pythonLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = pythonParser(stream)
    tree = parser.start()
    print(tree.toStringTree())


if __name__ == '__main__':
    main(sys.argv)

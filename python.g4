grammar python;

// tokens --
AND: 'and';
OR: 'or';
NOT: 'not';
EQUAL: '=';
PLUSEQUAL: '+=';
MINUSEQUAL: '-=';
MULTIPLYEQUAL: '*=';
DIVIDEEQUAL: '/=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MOD: '%';
COMMA: ',';
LBRACKET: '[';
RBRACKET: ']';
LPAREN: '(';
RPAREN: ')';
INT: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+ | [0-9]+ '.' [0-9]*;
STRING: '"' ~["]* '"' | '\'' ~[']* '\'';
BOOLEAN: 'True' | 'False';
TAB: [\t] | '    ';
WHITESPACE: [ \r]+ -> skip;
NEWLINE: [\n];
WHILE: 'while';
FOR: 'for';
RANGE: 'range';
IN: 'in';
HASHTAG: '#';
BLOCKCOMMENT: '\'\'\'';
IF: 'if';
ELSE: 'else';
ELIF: 'elif';
COLON: ':';
GREATERTHAN: '>';
LESSTHAN: '<';
EQUALTO: '==';
NOTEQUALTO: '!=';
GREATERTHANEQUAL: '>=';
LESSTHANEQUAL: '<=';
VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;

// going to skip all comments because they aren't actually a part of the syntax/code
COMMENT: HASHTAG ~[\r\n]* -> skip;
MULTILINECOMMENT: BLOCKCOMMENT (.|NEWLINE)*? BLOCKCOMMENT -> skip;

// parse variables? --
v_negation: NOT v_data;
v_data: VARNAME | MINUS? INT | MINUS? FLOAT | STRING | BOOLEAN | v_negation;
v_array:
	LBRACKET (
		(v_data | v_array) (COMMA ( v_data | v_array) COMMA?)*
	)? RBRACKET;
v_arithmetic_op: PLUS | MINUS | MULTIPLY | DIVIDE | MOD;
v_assignment_op:
	EQUAL
	| PLUSEQUAL
	| MINUSEQUAL
	| MULTIPLYEQUAL
	| DIVIDEEQUAL;
v_comparison_op:
	GREATERTHAN
	| LESSTHAN
	| EQUALTO
	| NOTEQUALTO
	| GREATERTHANEQUAL
	| LESSTHANEQUAL
	| AND
	| OR;
v_comparison_statement:
	LPAREN v_data (v_comparison_op v_data)* RPAREN
	| v_data (v_comparison_op v_data)*;
v_range: RANGE LPAREN (((INT | FLOAT) COMMA (INT | FLOAT)) | (INT | FLOAT)) RPAREN;
v_iterable: VARNAME | v_array | v_range;

// parse --
start: line*;

line: NEWLINE | statement NEWLINE | statement | conditional | loop;

statement: assignment | arithmetic | comparison;

assignment:
	VARNAME v_assignment_op (arithmetic | (v_data | v_array) | comparison );

arithmetic:
	v_data (v_arithmetic_op v_data)*
	| v_array (PLUS v_array)*;

comparison:
	v_comparison_statement (
		v_comparison_op v_comparison_statement
	)*;

if_block: TAB* IF comparison COLON NEWLINE+ (TAB+ line)+;
elif_block: TAB* ELIF comparison COLON NEWLINE+ (TAB+ line)+;
else_block: TAB* ELSE COLON NEWLINE+ (TAB+ line)+;

conditional: if_block elif_block* else_block?;

while_block: WHILE comparison COLON NEWLINE+ (TAB+ line)+;
for_block: FOR VARNAME IN v_iterable COLON NEWLINE+ (TAB+ line)+;

loop: while_block | for_block;
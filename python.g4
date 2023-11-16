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

// parse --
start: line*;

line: NEWLINE | statement NEWLINE | statement | conditional;

statement: assignment | arithmetic | comparison;

assignment:
	VARNAME v_assignment_op (
		(v_data | v_array)
		| arithmetic
		| comparison
	);

arithmetic:
	v_data (v_arithmetic_op v_data)*
	| v_array (PLUS v_array)*;

comparison:
	v_comparison_statement (
		v_comparison_op v_comparison_statement
	)*;

if_statement: IF comparison COLON NEWLINE+;
elif_statement: ELIF comparison COLON NEWLINE+;
else_statement: ELSE COLON NEWLINE+;

if_block: if_statement (TAB line)+;
elif_block: elif_statement (TAB line)+;
else_block: else_statement (TAB line)+;

conditional: if_block elif_block* else_block?;
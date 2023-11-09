grammar python;

// tokens --
VARNAME: [a-zA-Z_][a-zA-Z0-9_]*;
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
INT: [0-9]+;
FLOAT: [0-9]* '.' [0-9]+ | [0-9]+ '.' [0-9]*;
STRING: '"' ~["]* '"' | '\'' ~[']* '\'';
BOOLEAN: 'True' | 'False';
WHITESPACE: [ \t\r\n]+ -> skip;

// parse variables? --
v_data: VARNAME | INT | FLOAT | STRING | BOOLEAN;
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

// parse --
start: (assignment | arithmetic)*;

assignment:
	VARNAME v_assignment_op ((v_data | v_array) | arithmetic*);

arithmetic:
	v_data (v_arithmetic_op v_data)*
	| v_array (PLUS v_array)*;
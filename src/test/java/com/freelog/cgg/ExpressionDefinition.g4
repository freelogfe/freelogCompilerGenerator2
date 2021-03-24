grammar ExpressionDefinition;

prog : stat+ EOF ;

stat
    : expression    # printExpr
    | NEWLINE       # blank
    ;

expression
    : expression op='^' expression          # calculatePow
    | expression op=('*' | '/') expression  # calculateTim
    | expression op=('+' | '-') expression  # calculatePlu
    | signedAtom                            # calculateSign
    ;

signedAtom
   : op=('+' | '-') signedAtom  # signed4Self
   | built_in_function          # signed4Function
   | atom                       # signed4Atom
   ;

built_in_function
  : funcname LPAREN args+=expression (COMMA args+=expression)* RPAREN
  ;

funcname
  : 'sum'
  | 'avg'
  ;

atom
  : scientific                  # atom4Scientific
  | constant                    # atom4Constant
  | LPAREN expression RPAREN    # atom4Expression
  | variable                    # atom4Variable
  ;

scientific
  : SCIENTIFIC_NUMBER
  ;

constant
  : PI
  | EULER
  ;

variable
  : environment_variable # VariableEnvironment
  | ID                   # VariableArg
  ;
environment_variable
  : VARIABLE_CONTRACT
  ;

// ExpressionToken
SCIENTIFIC_NUMBER
   : NUMBER (('E' | 'e') SIGN? NUMBER)?
   ;

// EnvironmentVariableToken
VARIABLE_CONTRACT : 'self' '.' VARIABLE_CONTRACT_ATTRIBUTE ;
VARIABLE_CONTRACT_ATTRIBUTE
  : 'exhibited' // 展品计数
  ;

// 关键词组
PI : 'pi' ;
EULER : 'e' ;

// 关键符号
COMMA : ',' ;
LPAREN : '(' ;
RPAREN : ')' ;
PLUS : '+' ;
MINUS : '-' ;
TIMES : '*' ;
DIV : '/' ;
POW : '^' ;

// LexToken
ID : ALPHABET (ALPHABET | DIGIT | '_')* ;

NEWLINE:'\r'? '\n' ;

fragment SIGN : '+' | '-' ;
fragment NUMBER : DIGIT+ ('.' DIGIT+)? ;
fragment DIGIT : [0-9] ;
fragment ALPHABET : [a-zA-Z] ;
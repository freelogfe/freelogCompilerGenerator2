lexer grammar EnvironmentVariableToken;

VARIABLE_CONTRACT : 'self' '.' VARIABLE_CONTRACT_ATTRIBUTE ;

fragment VARIABLE_CONTRACT_ATTRIBUTE
  : 'exhibited' // 展品计数
  ;
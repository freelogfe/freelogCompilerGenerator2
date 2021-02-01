lexer grammar MappingRuleToken;

// 映射规则
ADD : 'add' ;
ALTER : 'alter' ;
ACTIVATE_THEME : 'activate_theme' ;

AS : 'as' ;
DO : 'do' ;
END : 'end' ;

// 命令
SET_LABELS : 'set_labels' ;
REPLACE : 'replace' ;
SHOW : 'show' ;
HIDE : 'hide' ;
SET_TITLE : 'set_title' ;
SET_COVER : 'set_cover' ;
ADD_ATTR : 'add_attr' ;
DELETE_ATTR : 'delete_attr' ;

WITH : 'with' ;
UNDER : 'under' ;

// 符号
DOLLAR : '$' ;
AT : '@' -> mode(SEMVER_MODE) ;
HASH : '#' ;
SLASH : '/' ;
GT : '>' ;
COMMA : ',' ;

// 词组
ID : (ALPHABET | CHINESE_WORD | DIGIT | '-' | '_' | '.')+ ;
// 字符串
STRING : '"' (ESC | ~["\\])* '"' ;
WS : [ \t\r\n]+ -> skip ;

mode SEMVER_MODE;

// 版本
SEMVER : ('^' | '~')? POSITIVE_INT '.' POSITIVE_INT '.' POSITIVE_INT -> mode(DEFAULT_MODE) ;

fragment ESC : '\\' (["\\/bfnrt] | UNICODE) ;
fragment UNICODE : 'u' HEX HEX HEX HEX ;
fragment INT : '-'? POSITIVE_INT ;
fragment POSITIVE_INT : [1-9] [0-9]* ;
fragment DIGIT : [0-9] ;
fragment HEX : [a-fA-F0-9] ;
fragment ALPHABET : [a-zA-Z] ;
fragment CHINESE_WORD : '\u4e00'..'\u9fef' ;

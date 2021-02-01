grammar A;
import AToken;

@lexer::header{
import java.util.*;
}
@lexer::members{
Map<String,Integer> keywords = new HashMap<String,Integer>(){
    {
        put("begin",AParser.BEGIN);
        put("end",AParser.END);
        put("if",AParser.IF);
        put("then",AParser.THEN);
        put("while",AParser.WHILE);
    }
}
}

tokens{BEGIN,END,IF,THEN,WHILE}

stat
    : BEGIN stat* END
    | IF expr THEN stat
    | WHILE expr stat
    | ID '=' expr ';'
    ;

expr
    : INT
    | CHAR
    ;

ID : [a-zA-Z]+
    {
        if(keywords.contanisKey(getText())){
            setType(keywords.get(getText()));
        }
    }
    ;

INT : [0-9] ;
CHAR : '\'' . '\'' {setText(String.valueOf(getText().charAt(1)));} ;
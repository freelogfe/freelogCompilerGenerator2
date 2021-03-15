package com.freelog.ccg;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.antlr.v4.runtime.*;

public class MappingRuleErrorLexerListener extends BaseErrorListener {

    public JSONArray errors;

    public JSONArray errorObjects;

    public MappingRuleErrorLexerListener() {
        errors = new JSONArray();
        errorObjects = new JSONArray();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if(e instanceof LexerNoViableAltException){
            errors.add(String.format("line %d:%d %s", line, charPositionInLine, msg));
            errorObjects.add(new JSONObject()
                    .fluentPut("line", line)
                    .fluentPut("charPositionInLine", charPositionInLine)
                    .fluentPut("msg", msg));
        }
    }
}

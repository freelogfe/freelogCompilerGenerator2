package com.freelog.ccg;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class MappingRuleErrorListener extends BaseErrorListener {

    public JSONArray errors;

    public JSONArray errorObjects;

    public MappingRuleErrorListener() {
        errors = new JSONArray();
        errorObjects = new JSONArray();
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errors.add(String.format("line %d:%d %s", line, charPositionInLine, msg));
        errorObjects.add(new JSONObject()
                .fluentPut("line", line)
                .fluentPut("charPositionInLine", charPositionInLine)
                .fluentPut("offendingSymbol", ((CommonToken) offendingSymbol).getText())
                .fluentPut("msg", msg));
    }
}

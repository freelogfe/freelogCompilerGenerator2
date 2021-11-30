package com.freelog.ccg;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.freelog.cg.tool.TreeVisualizer;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class B {

    public void compile(String grammarName) {
        List<String> toolArgs = new LinkedList<String>(Arrays.asList(
                Paths.get(String.format("src/test/java/com/freelog/ccg/%s", grammarName)).toString(),
                "-visitor",
                "-package",
                "com.freelog.ccg",
                "-Dlanguage=JavaScript"
//                "-Dlanguage=Java"
        ));

        String[] toolArgsArray = new String[toolArgs.size()];
        toolArgs.toArray(toolArgsArray);
//        System.out.println("array\n" + Arrays.toString(toolArgsArray));

        Tool tool = new Tool(toolArgsArray);
        tool.processGrammarsOnCommandLine();
    }

    @Test
    public void b() {
        compile("MappingRuleToken.g4");
        compile("MappingRule.g4");
    }

    public static void main(String[] args) throws Exception {
        InputStream is = B.class.getClassLoader().getResourceAsStream("B.sc");
        ANTLRInputStream input = new ANTLRInputStream(is);

        // 新建词法分析器
        MappingRuleToken lexer = new MappingRuleToken(input);
        lexer.removeErrorListeners();
        MappingRuleErrorLexerListener lexerErrorListener = new MappingRuleErrorLexerListener();
        lexer.addErrorListener(lexerErrorListener);
        // 新建词法符号缓冲区
        CommonTokenStream stream = new CommonTokenStream(lexer);
        // 新建语法分析器
        MappingRule parser = new MappingRule(stream);
        parser.removeErrorListeners();
        MappingRuleErrorListener errorListener = new MappingRuleErrorListener();
        parser.addErrorListener(errorListener);
        // 关闭恢复机制
//        parser.setErrorHandler(new BailErrorStrategy());

        ParseTree tree = parser.mapping_rule_section();
        if (lexerErrorListener.errors.size() != 0) {
            JSONObject result = new JSONObject();
            result.put("errors", lexerErrorListener.errors);
            result.put("errorObjects", lexerErrorListener.errorObjects);

            System.out.println(JSON.toJSONString(result, SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));
            return;
        }

        MappingRuleCustomVisitor visitor = new MappingRuleCustomVisitor();
        visitor.visit(tree);
        visitor.verify();

        String output = JSON.toJSONString(visitor.mappingRules, SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat);
        String outputFile = "zhaojn.json";
        Files.writeString(Paths.get(outputFile), output);

        JSONObject result = new JSONObject();
        result.put("rules", visitor.mappingRules);
        result.put("errors", new JSONArray().fluentAddAll(errorListener.errors).fluentAddAll(visitor.errors));
        result.put("errorObjects", errorListener.errorObjects);

        System.out.println(JSON.toJSONString(result, SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat));

        TreeVisualizer.viewAST(Arrays.asList(parser.getRuleNames()), tree);
    }
}

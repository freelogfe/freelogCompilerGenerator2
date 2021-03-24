package com.freelog.cgg;

import com.alibaba.fastjson.JSONObject;
import com.freelog.cg.tool.TreeVisualizer;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BailErrorStrategy;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;

import java.io.InputStream;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class A {

    @Test
    public void a() {
        List<String> toolArgs = new LinkedList<String>(Arrays.asList(
                Paths.get("src/test/java/com/freelog/cgg/ExpressionDefinition.g4").toString(),
                "-visitor",
                "-package",
                "com.freelog.cgg",
                "-Dlanguage=JavaScript"
        ));

        String[] toolArgsArray = new String[toolArgs.size()];
        toolArgs.toArray(toolArgsArray);
//        System.out.println("array\n" + Arrays.toString(toolArgsArray));

        Tool tool = new Tool(toolArgsArray);
        tool.processGrammarsOnCommandLine();
    }

    public static void main(String[] args) throws Exception {
        InputStream is = A.class.getClassLoader().getResourceAsStream("A.sc");
        ANTLRInputStream input = new ANTLRInputStream(is);

        // 新建词法分析器
        ExpressionDefinitionLexer lexer = new ExpressionDefinitionLexer(input);
        // 新建词法符号缓冲区
        CommonTokenStream stream = new CommonTokenStream(lexer);
        // 新建语法分析器
        ExpressionDefinitionParser parser = new ExpressionDefinitionParser(stream);
        ExpressionDefinitionCustomListener listener = new ExpressionDefinitionCustomListener();
        parser.addParseListener(listener);
        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = parser.prog();

        System.out.println(JSONObject.toJSONString(listener.expressions, true));

        TreeVisualizer.viewAST(Arrays.asList(parser.getRuleNames()), tree);
    }
}

package com.freelog.ccg;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
                "com.freelog.ccg"
        ));

        String[] toolArgsArray = new String[toolArgs.size()];
        toolArgs.toArray(toolArgsArray);
//        System.out.println("array\n" + Arrays.toString(toolArgsArray));

        Tool tool = new Tool(toolArgsArray);
        tool.processGrammarsOnCommandLine();
    }

    @Test
    public void b() {
        compile("RuleToken.g4");
        compile("Rule.g4");
    }

    public static void main(String[] args) throws Exception {
        InputStream is = B.class.getClassLoader().getResourceAsStream("B.sc");
        ANTLRInputStream input = new ANTLRInputStream(is);

        // 新建词法分析器
        RuleToken lexer = new RuleToken(input);
        // 新建词法符号缓冲区
        CommonTokenStream stream = new CommonTokenStream(lexer);
        // 新建语法分析器
        Rule parser = new Rule(stream);
//        parser.setErrorHandler(new BailErrorStrategy());

        ParseTree tree = parser.mapping_rule_section();

        RuleCustomVisitor visitor = new RuleCustomVisitor();
        visitor.visit(tree);

        String output = JSON.toJSONString(visitor.mappingRules, SerializerFeature.WriteMapNullValue, SerializerFeature.PrettyFormat);
        String outputFile = "zhaojn.json";
        Files.writeString(Paths.get(outputFile), output);

//        TreeVisualizer.viewAST(Arrays.asList(parser.getRuleNames()), tree);
    }
}

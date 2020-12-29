package com.freelog.cgg;

import com.freelog.cg.tool.TreeVisualizer;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.ANTLRInputStream;
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
                Paths.get("src/test/java/com/freelog/cgg/A.g4").toString(),
                "-package",
                "com.freelog.cgg"
        ));

        String[] toolArgsArray = new String[toolArgs.size()];
        toolArgs.toArray(toolArgsArray);
//        System.out.println("array\n" + Arrays.toString(toolArgsArray));

        Tool tool = new Tool(toolArgsArray);
        tool.processGrammarsOnCommandLine();
    }

    public static void main(String[] args) throws Exception{

//    }
//    @Test
//    public void b() throws Exception {
        InputStream is = A.class.getClassLoader().getResourceAsStream("A.sc");
        ANTLRInputStream input = new ANTLRInputStream(is);

        // 新建词法分析器
        ALexer lexer = new ALexer(input);
        // 新建词法符号缓冲区
        CommonTokenStream stream = new CommonTokenStream(lexer);
        // 新建语法分析器
        AParser parser = new AParser(stream);
//        parser.setErrorHandler(new BailErrorStrategy());
//        parser.removeErrorListeners();
//        parser.addErrorListener(new VerboseListener());
        // 令语法分析器报告所有的歧义
//        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
//        parser.addErrorListener(new DiagnosticErrorListener());
//        parser.setBuildParseTree(false);
        ParseTree tree = parser.r();

        // 新建语法分析树遍历器
//        ParseTreeWalker walker = new ParseTreeWalker();
        // 新建监听器
//        CustomListener listener = new CustomListener();
        // 遍历
//        walker.walk(listener, tree);

        // 新建访问器
//        CustomVisitor visitor = new CustomVisitor();
        // 访问
//        visitor.visit(tree);

        TreeVisualizer.viewAST(Arrays.asList(parser.getRuleNames()), tree);
    }
}

package com.freelog.cgg;

import com.freelog.cg.tool.TreeVisualizer;
import org.antlr.v4.Tool;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;
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
                "-visitor",
                "-package",
                "com.freelog.cgg"
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
        ALexer lexer = new ALexer(input);
        // 新建词法符号缓冲区
        CommonTokenStream stream = new CommonTokenStream(lexer);
        // 新建语法分析器
        AParser parser = new CAParser(stream);
        parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        parser.removeErrorListeners();
        parser.setErrorHandler(new BailErrorStrategy());
        ParseTree tree = null;
        try {
            tree = parser.file();
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getCause() instanceof RecognitionException)
                stream.reset();
            parser.addErrorListener(ConsoleErrorListener.INSTANCE);
            // 添加歧义错误监听器
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);

            tree = parser.file();
        }

        CAVisitor visitor = new CAVisitor();
        visitor.visit(tree);

        TreeVisualizer.viewAST(Arrays.asList(parser.getRuleNames()), tree);
    }
}

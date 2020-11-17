package com.freelog.cg.antlr;

import com.freelog.cg.tool.TreeVisualizer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.InputStream;
import java.util.Arrays;

public class UserPolicy {

    public static void main(String[] args) throws Exception {
        InputStream is = UserPolicy.class.getClassLoader().getResourceAsStream("grammar_tests/zhaojn.sc");
        ANTLRInputStream input = new ANTLRInputStream(is);

//        ANTLRInputStream input = new ANTLRFileStream("grammar_tests/zhaojn.sc");

        // 新建词法分析器
        UserPolicyLexer lexer = new UserPolicyLexer(input);
        CustomTokenFactory factory = new CustomTokenFactory(input);
        lexer.setTokenFactory(factory);

        // 新建词法符号缓冲区
        CommonTokenStream stream = new CommonTokenStream(lexer);
        // 打印全部词法符号
//        stream.fill();
//        System.out.println(stream.getTokens());

        // 新建语法分析器
        UserPolicyParser parser = new UserPolicyParser(stream);
        parser.setTokenFactory(factory);
//        parser.setErrorHandler(new BailErrorStrategy());
//        parser.removeErrorListeners();
//        parser.addErrorListener(new VerboseListener());
        // 令语法分析器报告所有的歧义
//        parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
//        parser.addErrorListener(new DiagnosticErrorListener());
//        parser.setBuildParseTree(false);

        ParseTree tree = parser.policy();

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

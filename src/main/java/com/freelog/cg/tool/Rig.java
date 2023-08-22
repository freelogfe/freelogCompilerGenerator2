/*
 * Copyright (c) 2012-2017 The ANTLR Project. All rights reserved.
 * Use of this file is governed by the BSD 3-clause license that
 * can be found in the LICENSE.txt file in the project root.
 */

package com.freelog.cg.tool;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.PredictionMode;

import javax.print.PrintException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Run a lexer/parser combo, optionally printing tree string or generating
 * postscript file. Optionally taking input file.
 * <p>
 * $ java org.antlr.v4.runtime.misc.TestRig GrammarName startRuleName
 * [-tree]
 * [-tokens] [-gui] [-ps file.ps]
 * [-trace]
 * [-diagnostics]
 * [-SLL]
 * [input-filename(s)]
 */
public class Rig {
    public static final String LEXER_START_RULE_NAME = "tokens";

    public String grammarName;
    public String startRuleName;
    public final List<String> inputFiles = new ArrayList<String>();
    public boolean printTree = false;
    public boolean gui = false;
    public String psFile = null;
    public boolean showTokens = false;
    public boolean trace = false;
    public boolean diagnostics = false;
    public String encoding = null;
    public boolean SLL = false;

    public void process() throws Exception {
//		System.out.println("exec "+grammarName+"."+startRuleName);
        String lexerName = grammarName + "Lexer";
        ClassLoader cl = Thread.currentThread().getContextClassLoader();
        Class<? extends Lexer> lexerClass = null;
        try {
            lexerClass = cl.loadClass(lexerName).asSubclass(Lexer.class);
        } catch (ClassNotFoundException cnfe) {
            // might be pure lexer grammar; no Lexer suffix then
            lexerName = grammarName;
            try {
                lexerClass = cl.loadClass(lexerName).asSubclass(Lexer.class);
            } catch (ClassNotFoundException cnfe2) {
                System.err.println("Can't load " + lexerName + " as lexer or parser");
                return;
            }
        }

        Constructor<? extends Lexer> lexerCtor = lexerClass.getConstructor(CharStream.class);
        Lexer lexer = lexerCtor.newInstance((CharStream) null);

        Class<? extends Parser> parserClass = null;
        Parser parser = null;
        if (!startRuleName.equals(LEXER_START_RULE_NAME)) {
            String parserName = grammarName + "Parser";
            parserClass = cl.loadClass(parserName).asSubclass(Parser.class);
            Constructor<? extends Parser> parserCtor = parserClass.getConstructor(TokenStream.class);
            parser = parserCtor.newInstance((TokenStream) null);
        }

        Charset charset = (encoding == null ? Charset.defaultCharset() : Charset.forName(encoding));
        if (inputFiles.size() == 0) {
            CharStream charStream = CharStreams.fromStream(System.in, charset);
            process(lexer, parserClass, parser, charStream);
            return;
        }
        for (String inputFile : inputFiles) {
            CharStream charStream = CharStreams.fromPath(Paths.get(inputFile), charset);
            if (inputFiles.size() > 1) {
                System.err.println(inputFile);
            }
            process(lexer, parserClass, parser, charStream);
        }
    }

    public void process(Lexer lexer, Class<? extends Parser> parserClass, Parser parser, CharStream input) throws IOException, IllegalAccessException, InvocationTargetException, PrintException {
        lexer.setInputStream(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        tokens.fill();

        if (showTokens) {
            for (Token tok : tokens.getTokens()) {
                if (tok instanceof CommonToken) {
                    System.out.println(((CommonToken) tok).toString(lexer));
                } else {
                    System.out.println(tok.toString());
                }
            }
        }

        if (startRuleName.equals(LEXER_START_RULE_NAME)) return;

        if (diagnostics) {
            parser.addErrorListener(new DiagnosticErrorListener());
            parser.getInterpreter().setPredictionMode(PredictionMode.LL_EXACT_AMBIG_DETECTION);
        }

        if (printTree || gui || psFile != null) {
            parser.setBuildParseTree(true);
        }

        if (SLL) { // overrides diagnostics
            parser.getInterpreter().setPredictionMode(PredictionMode.SLL);
        }

        parser.setTokenStream(tokens);
        parser.setTrace(trace);

        try {
            Method startRule = parserClass.getMethod(startRuleName);
            ParserRuleContext tree = (ParserRuleContext) startRule.invoke(parser, (Object[]) null);

            if (printTree) {
                System.out.println(tree.toStringTree(parser));
            }
            if (gui) {
                Trees.inspect(tree, parser);
            }
            if (psFile != null) {
                Trees.save(tree, parser, psFile); // Generate postscript
            }
        } catch (NoSuchMethodException nsme) {
            System.err.println("No method for rule " + startRuleName + " or it has arguments");
        }
    }
}

package com.freelog.cg;

import org.junit.Test;
//import static org.junit.Assert.*;


/**
 * Unit test for simple App.
 */
public class CompilerGeneratorTest 
{

    @Test
    public void generateJavaTarget(){
        CompilerGeneratorBuilder builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = builder.setServiceName("Resource").setTargetLang("Java").setOutputDir("./target/java").setGrammarDir("./target/generated_grammar").setNoVisitor(true).setNoListener(true).setExactOutput(true).setPackageName("com.freelog.compiler").build();
        cg.generate();
    }

    @Test
    public void generateCollectionJavaTarget(){
        CompilerGeneratorBuilder builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = builder.setServiceName("Collection").setTargetLang("Java").setOutputDir("./target/java").setGrammarDir("./target/generated_grammar").setNoVisitor(true).setNoListener(true).setExactOutput(true).setPackageName("com.freelog.compiler").build();
        cg.generate();
    }

    @Test
    public void generateJavaLexer(){
        CompilerGeneratorBuilder builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = builder.setPartialNode("LexToken").setTargetLang("Java").setOutputDir("./target/java").setExactOutput(true).setGrammarDir("./target/generated_grammar").build();
        cg.generate();
    }

    @Test
    public void generateJavaEntityParser(){
        CompilerGeneratorBuilder builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = builder.setPartialNode("Entity").setTargetLang("Java").setOutputDir("./target/java").setGrammarDir("./target/generated_grammar").setNoVisitor(true).setNoListener(true).setExactOutput(true).setPackageName("com.freelog.compiler").build();
        cg.generate();
    }

    @Test
    public void generateJavaExpressionParser(){
        CompilerGeneratorBuilder builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = builder.setPartialNode("Expression").setTargetLang("Java").setOutputDir("./target/java").setGrammarDir("./target/generated_grammar").setNoVisitor(true).setNoListener(true).setExactOutput(true).setPackageName("com.freelog.compiler").build();
        cg.generate();
    }

}

package com.freelog.cg;

import com.freelog.cg.tool.GeneratedFileHelper;
import org.junit.Test;

import java.nio.file.Paths;

public class MainTest {

    @Test
    public void testJava() throws Exception {
        String targetDir = Paths.get("output").toString();

        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder
                .setOutputDir(targetDir)
                .setServiceName("Collection")
                .setTargetLang("Java")
                .setExactOutput(true)
                .setPackageName("com.freelog.compiler.collection")
                .build();

        cg.generate();

        GeneratedFileHelper helper = new GeneratedFileHelper(cg_builder);
        // 结果整理
        helper.generateAndClean(Paths.get("output_finally").toString());
    }

    @Test
    public void testJavaScript() throws Exception {
        String targetDir = Paths.get("output").toString();

        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder
                .setOutputDir(targetDir)
                .setServiceName("Collection")
                .setTargetLang("JavaScript")
                .setExactOutput(true)
                .build();

        cg.generate();

        GeneratedFileHelper helper = new GeneratedFileHelper(cg_builder);
        // 结果整理
        helper.generateAndClean(Paths.get("output_finally").toString());
    }
}
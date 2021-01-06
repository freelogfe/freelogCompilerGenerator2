package com.freelog.cg;

import com.freelog.cg.tool.GeneratedFileHelper;
import org.junit.Test;

import java.nio.file.Paths;

public class MainTest {

    @Test
    public void testJava() throws Exception {
        String targetDir = Paths.get("").toAbsolutePath().getParent() + "/FreelogCompilerJavaTarget2/src/main/java";

        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder
                .setOutputDir(targetDir)
                .setServiceName("User")
                .setTargetLang("Java")
                .setPackageName("com.freelog.compiler")
                .setNoGrammar(true)
                .setNoOthers(true)
                .build();

        cg.generate();

        GeneratedFileHelper helper = new GeneratedFileHelper(cg_builder, cg);
        // 结果整理
        helper.generateAndClean();
    }

    @Test
    public void testJavaScript() throws Exception {
        String targetDir = Paths.get("D:/space_webstorm/resource-policy-lang/gen").toString();

        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder
                .setOutputDir(targetDir)
                .setServiceName("resource")
                .setTargetLang("JavaScript")
                .setNoGrammar(true)
                .setNoOthers(true)
                .build();

        cg.generate();

        GeneratedFileHelper helper = new GeneratedFileHelper(cg_builder, cg);
        // 结果整理
        helper.generateAndClean();
    }
}
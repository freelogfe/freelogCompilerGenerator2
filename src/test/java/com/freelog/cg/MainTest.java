package com.freelog.cg;

import com.freelog.cg.tool.GeneratedFileHelper;
import org.junit.Test;

import java.nio.file.Paths;

public class MainTest {

    @Test
    public void testJava() {
        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder
                .setServiceName("User")
                .setTargetLang("Java")
                .setPackageName("com.freelog.compiler")
                .build();

        cg.generate();

        String sourceDir = cg.outputDir + "/" + cg.grammarDir;
        String targetDir = Paths.get("").toAbsolutePath().getParent() + "/FreelogCompilerJavaTarget2/src/main/java";
        GeneratedFileHelper.transfer4Java(sourceDir, targetDir, cg.targetLang, cg.packageName);
    }

    @Test
    public void testJavaScript() {
        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder
                .setServiceName("resource")
                .setTargetLang("JavaScript")
                .build();

        cg.generate();

        String sourceDir = cg.outputDir + "/" + cg.grammarDir;
        String targetDir = Paths.get("D:/space_webstorm/resource-policy-lang/gen2").toString();
        GeneratedFileHelper.transfer4Java(sourceDir, targetDir, cg.targetLang, cg.packageName);
    }
}

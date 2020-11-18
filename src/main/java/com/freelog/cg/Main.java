package com.freelog.cg;

import com.freelog.cg.tool.GeneratedFileHelper;

import java.nio.file.Paths;
import java.util.*;

class Main {

    public static void main(String[] args) {
        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder
                .setServiceName("User")
                .setTargetLang("Java")
                .setPackageName("com.freelog.compiler")
                .build();

        cg.generate();

        String sourceDir = cg.outputDir + "/" + cg.grammarDir;
        String targetDir = Paths.get("").toAbsolutePath().getParent() + "/FreelogCompilerJavaTarget/src/main/java";
        GeneratedFileHelper.transfer4Java(sourceDir, targetDir, cg.packageName);
    }

    // 参数解析
    public static Map<String, String> parseArgs(String[] args) {
        Map<String, String> argMap = new HashMap<String, String>();
        List<String> argList = Arrays.asList(args);
        ListIterator<String> iterator = argList.listIterator();

        while (iterator.hasNext()) {
            String option = iterator.next();
            if (argMap.size() == 0 && option.equals("-help")) {
                return Map.ofEntries(Map.entry("-help", ""));
            }
            if (option.charAt(0) != '-' || option.equals("-help")) {
                return Map.ofEntries(Map.entry("-help", "invalid option: " + option));
            }
            if (!iterator.hasNext()) {
                return Map.ofEntries(Map.entry("-help", "missing operand of option:" + option));
            }
            String operand = iterator.next();
            if (operand.charAt(0) == '-') {
                return Map.ofEntries(Map.entry("-help", "invalid operand:" + operand));
            }
            argMap.put(option, operand);
        }
        return argMap;
    }
}
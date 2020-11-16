package com.freelog.cg;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

class Main {

    public static void main(String[] args) {
        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder.setServiceName("User").setTargetLang("Java").build();

        cg.generate();

        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.java");
        try {
            Files.walkFileTree(Paths.get(cg.outputDir + "/" + cg.grammarDir), new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Files.copy(file, Paths.get("src/main/java/com/freelog/cg/antlr/" + file.getFileName()), StandardCopyOption.REPLACE_EXISTING);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
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
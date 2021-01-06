package com.freelog.cg;

import com.freelog.cg.tool.GeneratedFileHelper;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Map<String, String> argMap = parseArgs(args);

        CompilerGeneratorBuilder cg_builder = new CompilerGeneratorBuilder();
        CompilerGenerator cg = cg_builder.setFieldsFromOptions(argMap).build();

        cg.generate();

        GeneratedFileHelper helper = new GeneratedFileHelper(cg_builder, cg);
        // 结果整理
        helper.generateAndClean();
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
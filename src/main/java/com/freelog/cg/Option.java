package com.freelog.cg;

import java.util.Map;

public class Option {

    public enum OptionArgType {BOOL, STRING}

    String fieldName;
    OptionArgType argType;
    String description;

    public Option(final String fieldName, final String description) {
        this(fieldName, OptionArgType.BOOL, description);
    }

    public Option(final String name, final OptionArgType argType, final String description) {
        this.fieldName = name;
        this.argType = argType;
        this.description = description;
    }

    // 选项集合
    public static Map<String, Option> optionDefs = Map.ofEntries(
            Map.entry("-help", new Option("help", OptionArgType.STRING, "print help messages")),
            Map.entry("-ng", new Option("noGrammar", "不保留语法书")),
            Map.entry("-no", new Option("noOthers", "不保留其他文件")),
            Map.entry("-nv", new Option("noVisitor", "dont generate visitor")),
            Map.entry("-o", new Option("outputDir", OptionArgType.STRING, "specify location to generate compilers or grammars")),
            Map.entry("-p", new Option("partial", OptionArgType.STRING, "partial compile up to specific partial step grammar definition, grammar definition DAG for structure")),
            Map.entry("-pn", new Option("packageName", OptionArgType.STRING, "包名，仅在Java语言中使用")),
            Map.entry("-sn", new Option("serviceName", OptionArgType.STRING, "specify coloring definition of the compiler to be generated")),
            Map.entry("-t", new Option("targetLang", OptionArgType.STRING, "specify target language of the generated compilers"))
    );

    public static Object parseValue(Option option, String value) {
        switch (option.argType) {
            case BOOL:
                return Boolean.parseBoolean(value);
            default:
                return value;
        }
    }
}
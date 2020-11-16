package com.freelog.cg;


import java.lang.reflect.Field;
import java.util.Map;


public class CompilerGeneratorBuilder {

    // 语法模板目录
    public String templateDir = "grammar_templates";

    // 输出目录
    public String outputDir = "output";

    public String serviceName = "";

    // 语言目录
    public String grammarDir = "generated_grammars";

    // 目标语言
    public String targetLang = "JavaScript";

    // 是否生成访问器
    public Boolean noVisitor = false;
    // 是否生成监听器
    public Boolean noListener = false;
    public String partialNode = "";

    // 包名
    public String packageName = null;

    public CompilerGenerator build() {
        CompilerGenerator cg = new CompilerGenerator(this.serviceName, this.grammarDir, this.outputDir, this.targetLang, this.partialNode, this.noVisitor, this.noListener, this.packageName);
        return cg;
    }

    public CompilerGeneratorBuilder setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    public CompilerGeneratorBuilder setTargetLang(String targetLang) {
        this.targetLang = targetLang;
        return this;
    }

    public CompilerGeneratorBuilder setOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    public CompilerGeneratorBuilder setGrammarDir(String grammarDir) {
        this.grammarDir = grammarDir;
        return this;
    }

    public CompilerGeneratorBuilder setPartialNode(String partialNode) {
        this.partialNode = partialNode;
        return this;
    }

    public CompilerGeneratorBuilder setNoVisitor(Boolean noVisitor) {
        this.noVisitor = noVisitor;
        return this;
    }

    public CompilerGeneratorBuilder setNoListener(Boolean noListener) {
        this.noListener = noListener;
        return this;
    }

    public CompilerGeneratorBuilder setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    // 根据参数配置字段
    public CompilerGeneratorBuilder setFieldsFromOptions(Map<String, String> cli_options) {
        Class<? extends CompilerGeneratorBuilder> thisClass = this.getClass();

        for (Map.Entry<String, String> entry : cli_options.entrySet()) {
            try {
                Option option = Option.optionDefs.get(entry.getKey());
                Field f = thisClass.getDeclaredField(option.fieldName);
                f.set(this, entry.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this;
    }
}
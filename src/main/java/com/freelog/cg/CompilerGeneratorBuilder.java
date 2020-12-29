package com.freelog.cg;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.util.Map;


public class CompilerGeneratorBuilder {

    private static final Logger logger = LoggerFactory.getLogger(CompilerGeneratorBuilder.class);

    public String outputDir = "output"; // 输出目录
    public String serviceName = "";
    public String grammarDir = "generated_grammars"; // 语言目录
    public String targetLang = "JavaScript"; // 目标语言
    public Boolean noVisitor = false; // 是否生成访问器
    public Boolean noListener = false; // 是否生成监听器
    public String partialNode = "";
    public String packageName = null;
    public Boolean noGrammar = false; // 不保留语法书
    public Boolean noOthers = false; // 不保留其他文件

    public CompilerGenerator build() {
        return new CompilerGenerator(this.serviceName, this.targetLang, this.partialNode, this.noVisitor, this.noListener, this.packageName);
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
                if (option == null) {
                    continue;
                }
                Field f = thisClass.getDeclaredField(option.fieldName);
                f.set(this, Option.parseValue(option, entry.getValue()));
            } catch (NoSuchFieldException e) {
                logger.warn("", e);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return this;
    }
}
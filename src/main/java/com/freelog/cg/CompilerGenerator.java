package com.freelog.cg;

import org.antlr.v4.Tool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CompilerGenerator {

    private static final Logger logger = LoggerFactory.getLogger(CompilerGenerator.class);

    public String serviceName;
    public String grammarDir;
    public String targetLang;
    public String outputDir;
    public Boolean noVisitor;
    public Boolean noListener;
    public Boolean exactOutput;
    public String partialNode;
    public String packageName;

    public final Map<String, Map<String, String>> all_injections = TargetDependentInjection.injections;

    public final String templateGroupDir = "grammar_templates";
    public final String grammarResource = "grammar_files";
    public final String templateStartingRule = "policy_grammar";

    public CompilerGenerator() {
    }

    public CompilerGenerator(String serviceName, String grammarDir, String outputDir, String targetLang, String partialNode, Boolean noVisitor, Boolean noListener, Boolean exactOutput, String packageName) {
        this.serviceName = serviceName;
        this.targetLang = targetLang;
        this.outputDir = outputDir;
        this.grammarDir = grammarDir;
        this.partialNode = partialNode;
        this.noVisitor = noVisitor;
        this.noListener = noListener;
        this.exactOutput = exactOutput;
        this.packageName = packageName;
    }

    /*  two stages:
     *      1. generate grammar from templates and resource
     *          1.1 render templates
     *          1.2 simply copy over those grammar that are not templated
     *      2. compile grammar to generate compiler for specific target
     */
    public void generate() {
        renderGrammarFromTemplate();
        copyGrammar();
        parserGrammarTokens();
        parseGrammar();
    }

    private void renderGrammarFromTemplate() {
        STGroup stg = new STGroupDir(this.templateGroupDir);
        String startingRule = this.templateStartingRule;
        ST st = stg.getInstanceOf(startingRule);
        st.add("serviceName", this.serviceName);

        Map<String, String> injections = all_injections.get(this.targetLang);
        for (Map.Entry<String, String> entry : injections.entrySet()) {
            st.add(entry.getKey(), entry.getValue());
        }

        String grammar = st.render();

        Path outputPath = Paths.get(this.grammarDir, this.serviceName + "Policy.g4");
        writeFile(outputPath, grammar);
    }

    private void copyGrammar() {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.g4");
        try {
            ResourceAccess.walkResource(this.grammarResource, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Path dest = Paths.get(CompilerGenerator.this.grammarDir + "/" + file.getFileName());
                        copyFile(file, dest);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void parserGrammarTokens() {
        Path grammarPath = Paths.get(this.grammarDir, "LexToken.g4");
        List<String> toolArgs = new LinkedList<String>(Arrays.asList(
                grammarPath.toString(),
                "-o", this.outputDir,
                "-Dlanguage=" + this.targetLang
        ));

        if (this.exactOutput) {
            toolArgs.add("-Xexact-output-dir");
        }

        if (this.packageName != null) {
            toolArgs.add("-package");
            toolArgs.add(this.packageName);
        }

        String[] toolArgsArray = new String[toolArgs.size()];
        toolArgs.toArray(toolArgsArray);

        Tool tool = new Tool(toolArgsArray);
        tool.processGrammarsOnCommandLine();
    }

    private void parseGrammar() {
        String grammarFile = this.partialNode.equals("") ? this.serviceName + "Policy.g4" : this.partialNode + ".g4";
        Path grammarPath = Paths.get(this.grammarDir, grammarFile);
        String visitorFlag = this.noVisitor ? "-no-visitor" : "-visitor";
        String listenerFlag = this.noListener ? "-no-listener" : "-listener";
        List<String> toolArgs = new LinkedList<String>(Arrays.asList(
                grammarPath.toString(),
                "-lib", this.grammarDir,
                "-o", this.outputDir,
                visitorFlag,
                listenerFlag,
                "-Dlanguage=" + this.targetLang
        ));

        if (this.exactOutput) {
            toolArgs.add("-Xexact-output-dir");
        }

        if (this.packageName != null) {
            toolArgs.add("-package");
            toolArgs.add(this.packageName);
        }

        String[] toolArgsArray = new String[toolArgs.size()];
        toolArgs.toArray(toolArgsArray);

        Tool tool = new Tool(toolArgsArray);
        tool.processGrammarsOnCommandLine();
    }

    private void writeFile(Path path, String content) {
        try {
            Files.createDirectories(path.getParent());
            if (Files.exists(path)) {
                Files.delete(path);
            }
            Files.createFile(path);
            Files.writeString(path, content, StandardCharsets.UTF_8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void copyFile(Path source, Path dest) {
        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
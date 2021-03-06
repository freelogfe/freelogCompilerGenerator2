package com.freelog.cg;

import org.antlr.v4.Tool;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupDir;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.*;
import java.util.*;

public class CompilerGenerator {
    public String serviceName;
    public String grammarDir;
    public String targetLang;
    public String outputDir;
    public String partialNode;
    public Boolean noVisitor;
    public Boolean noListener;
    public String packageName;

    public final Map<String, Map<String, String>> all_injections = TargetDependentInjection.injections;

    public final String templateGroupDir = "grammar_templates";
    public final String grammarResource = "grammar_files";
    public final String templateStartingRule = "policy_grammar";

    public CompilerGenerator() {}
    public CompilerGenerator(String serviceName, String grammarDir, String outputDir, String targetLang, String partialNode, Boolean noVisitor, Boolean noListener, String packageName) {
        this.serviceName = serviceName;
        this.targetLang = targetLang;
        this.outputDir = outputDir;
        this.grammarDir = grammarDir;
        this.partialNode = partialNode;
        this.noVisitor = noVisitor;
        this.noListener = noListener;
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
        parseGrammar();
    }

    public void renderGrammarFromTemplate() {
        STGroup stg = new STGroupDir(this.templateGroupDir);
        String startingRule = this.templateStartingRule;
        ST st = stg.getInstanceOf(startingRule);
        st.add("serviceName", this.serviceName);

        Map<String, String> injections = all_injections.get(this.targetLang);
        for (Map.Entry<String, String> entry : injections.entrySet()) {
            st.add(entry.getKey(), entry.getValue());
        }

        String grammar = st.render();

        Path outputPath = Paths.get(this.grammarDir, this.serviceName+"Policy.g4");
        System.out.println(outputPath);
        writeFile(outputPath, grammar);
    }

    private void copyGrammar(){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.g4");
        try {
            ResourceAccess.walkResource(this.grammarResource, new SimpleFileVisitor<Path>() { 
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)){
                        Path dest = Paths.get(CompilerGenerator.this.grammarDir + "/" + file.getFileName());
                        copyFile(file, dest);
                    }
                    return FileVisitResult.CONTINUE;
                }
            }); 
        }
        catch (Exception e) {
            System.err.println("copy grammar:\n" + e);
        }
    }

    public void parseGrammar() {
        String grammarFile = this.partialNode.equals("")? this.serviceName+"Policy.g4" : this.partialNode + ".g4";
        Path grammarPath = Paths.get(this.grammarDir, grammarFile);
        String visitorFlag = this.noVisitor ? "-no-visitor" : "-visitor";
        String listenerFlag = this.noListener ? "-no-listener" : "-listener";
        List<String> toolArgs = new LinkedList<String> (Arrays.asList(
            grammarPath.toString(),
            visitorFlag,
            listenerFlag,
            "-Dlanguage=" + this.targetLang,
            "-o", this.outputDir
        ));

        if (this.packageName != null) {
            toolArgs.add("-package");
            toolArgs.add(this.packageName);
        }


        String[] toolArgsArray = new String[toolArgs.size()];
        toolArgs.toArray(toolArgsArray);
        //System.out.println("array\n"+Arrays.toString(toolArgsArray));

        Tool tool = new Tool(toolArgsArray);
        tool.processGrammarsOnCommandLine();
    }


    private void writeFile(Path path, String content){
        try {
            Files.createDirectories(path.getParent());
            Files.createFile(path);
            Files.writeString(path, content, StandardCharsets.UTF_8);
        } 
        catch (FileAlreadyExistsException e){
            System.err.println(e);
        }
        catch (IOException e){
            System.err.println(e);
        }

    }

    private void copyFile(Path source, Path dest){

        try {
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
}

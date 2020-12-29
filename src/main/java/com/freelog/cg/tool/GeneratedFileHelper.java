package com.freelog.cg.tool;

import com.freelog.cg.CompilerGenerator;
import com.freelog.cg.CompilerGeneratorBuilder;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class GeneratedFileHelper {

    private static final Logger logger = LoggerFactory.getLogger(GeneratedFileHelper.class);

    public static void generateAndClean(CompilerGeneratorBuilder cg_builder, CompilerGenerator cg) throws Exception {
        Path sourceDir = Paths.get(cg.tmpDir);
        Path outputDir = Paths.get(cg_builder.outputDir);
        if (!Files.isDirectory(outputDir)) {
            Files.createDirectory(outputDir);
        }

        // 目标语言文件输出
        transfer(sourceDir.toString(), outputDir.toString(), cg_builder.targetLang, cg_builder.packageName);

        // 语法书输出
        if (!cg_builder.noGrammar) {
            Path grammarDir = Paths.get(cg_builder.outputDir, cg_builder.grammarDir);
            if (!Files.isDirectory(grammarDir)) {
                Files.createDirectory(grammarDir);
            }
            Files.walkFileTree(sourceDir, new SimpleFileVisitor<>() {
                PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.g4");

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Files.copy(file, Paths.get(grammarDir.toString(), file.getFileName().toString()), StandardCopyOption.REPLACE_EXISTING);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }

        // 其他文件输出
        if (!cg_builder.noOthers) {
            Files.walkFileTree(sourceDir, new SimpleFileVisitor<>() {
                PathMatcher matcher = FileSystems.getDefault().getPathMatcher("regex:.*?\\.(tokens|interp)");

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Files.copy(file, Paths.get(outputDir.toString(), file.getFileName().toString()), StandardCopyOption.REPLACE_EXISTING);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }

        // 清理输入目录
        FileUtils.deleteDirectory(new File(sourceDir.toString()));
    }

    public static void transfer(String sourceDir, String targetDir, String targetLang, String packageName) {
        String matchStr = null;
        switch (targetLang.toLowerCase()) {
            case "java":
                matchStr = "glob:**.java";
                break;
            case "javascript":
                matchStr = "glob:**.js";
                break;
        }
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(matchStr);

        try {
            Files.walkFileTree(Paths.get(sourceDir), new SimpleFileVisitor<>() {
                private Path targetDirPath;

                {
                    if (packageName != null && packageName.matches("[a-z]+(\\.[a-z]+)*")) {
                        String[] sonDirs = packageName.split("\\.");
                        targetDirPath = Paths.get(targetDir, sonDirs);
                    } else {
                        targetDirPath = Paths.get(targetDir);
                    }
                    Files.createDirectories(targetDirPath);
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Path targetFilePath = Paths.get(targetDirPath.toString(), file.getFileName().toString());

                        logger.info(targetFilePath.toString());

                        Files.copy(file, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

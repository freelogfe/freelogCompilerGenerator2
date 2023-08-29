package com.freelog.cg.tool;

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

    private CompilerGeneratorBuilder cg_builder;

    public Boolean noGrammar = false; // 不保留语法书
    public Boolean noOthers = false; // 不保留其他文件
    public Boolean deleteSource = false;

    public GeneratedFileHelper(CompilerGeneratorBuilder cg_builder) {
        this.cg_builder = cg_builder;
    }

    public void generateAndClean(String dist) throws Exception {
        // 源路径
        Path sourceDir = Paths.get(cg_builder.outputDir);
        // 目标路径
        Path outputDir = Paths.get(dist);
        if (!Files.isDirectory(outputDir)) {
            Files.createDirectory(outputDir);
        }

        // 目标语言文件输出
        transfer(sourceDir.toString(), outputDir.toString(), cg_builder.targetLang, cg_builder.packageName);

        // 语法书输出
        if (!noGrammar) {
            Path grammarDir = Paths.get(cg_builder.grammarDir);
            Files.walkFileTree(grammarDir, new SimpleFileVisitor<>() {
                PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.g4");

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Path target = Paths.get(dist, file.getFileName().toString());
                        Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);
                        logger.info("copyGrammar {} to {}", file, target);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }

        // 其他文件输出
        if (!noOthers) {
            Files.walkFileTree(sourceDir, new SimpleFileVisitor<>() {
                PathMatcher matcher = FileSystems.getDefault().getPathMatcher("regex:.*?\\.(tokens|interp)");

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Path target = Paths.get(dist, file.getFileName().toString());
                        Files.copy(file, target, StandardCopyOption.REPLACE_EXISTING);
                        logger.info("copyOthers {} to {}", file, target);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        }

        // 清理输入目录
        if (deleteSource) {
            FileUtils.deleteDirectory(new File(sourceDir.toString()));
        }
    }

    public void transfer(String sourceDir, String targetDir, String targetLang, String packageName) {
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
                        Files.createDirectories(targetDirPath);
                    } else {
                        targetDirPath = Paths.get(targetDir);
                    }
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (matcher.matches(file)) {
                        Path targetFilePath = Paths.get(targetDirPath.toString(), file.getFileName().toString());
                        Files.copy(file, targetFilePath, StandardCopyOption.REPLACE_EXISTING);
                        logger.info("transfer {} to {}", file, targetFilePath);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

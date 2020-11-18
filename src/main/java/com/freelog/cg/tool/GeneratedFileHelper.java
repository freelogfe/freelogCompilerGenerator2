package com.freelog.cg.tool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class GeneratedFileHelper {

    private static final Logger logger = LoggerFactory.getLogger(GeneratedFileHelper.class);

    public static void transfer4Java(String sourceDir, String targetDir, String packageName) {
        logger.info("sourceDir: {}", sourceDir);
        logger.info("targetDir: {}", targetDir);
        logger.info("packageName: {}", packageName);

        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**.java");
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

    public static void main(String[] args) {
        System.out.println(Paths.get("").toAbsolutePath().getParent().toString());
    }
}

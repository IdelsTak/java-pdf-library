/*
 Copyright (c) 2019, Hiram K.
 All rights reserved.

 */
package com.github.lib.pdf.api;

import com.github.lib.pdf.spi.FileProcessor;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**

 @author Hiram K.
 */
public class Configuration {

    /**
     Points to temporary directory if needed.
     */
    private final Path pathToTempDir;
    /**
     Points to directory where newly created PDF file will be saved.
     */
    private final Path destinationDir;
    private final Collection<FileProcessor> fileProcessors;

    public Configuration(Path pathToTempDir, Path destinationDir) {
        this.pathToTempDir = pathToTempDir;
        this.destinationDir = destinationDir;
        this.fileProcessors = new ArrayList<>();
    }

    public Path getPathToTempDir() {
        return pathToTempDir;
    }

    public Path getDestinationDir() {
        return destinationDir;
    }

    public Collection<FileProcessor> getFileProcessors() {
        return Collections.unmodifiableCollection(fileProcessors);
    }

}

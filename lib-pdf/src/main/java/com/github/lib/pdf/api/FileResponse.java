/*
 Copyright (c) 2019, Hiram K.
 All rights reserved.

 */
package com.github.lib.pdf.api;

import java.nio.file.Path;

/**

 @author Hiram K.
 */
public class FileResponse {

    /**
     Path to newly created PDF file (from supplied file in {@link FileData}
     class).
     */
    private final Path path;
    /**
     Shows how many pages newly created PDF file has.
     */
    private final Integer numberOfPages;

    public FileResponse(Path path, Integer numberOfPages) {
        this.path = path;
        this.numberOfPages = numberOfPages;
    }

}

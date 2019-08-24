/*
 Copyright (c) 2019, Hiram K.
 All rights reserved.

 */
package com.github.lib.pdf.api;

import java.nio.file.Path;

/**

 @author Hiram K.
 */
public class FileData {

    /**
     Points to file on filesystem. File may be of the following type: pdf,
     doc(x), xls(x), ppt(x), txt, jp(e)g, tiff, xps, png and also zip file
     containing any of those files
     */
    private final Path path;
    /**
     Shows printing size (in percentage) of the supplied file – print scaling.
     */
    private final double scale;
    /**
     Shows on what paper size file should be printed.
     */
    private final Format format;

    public FileData(Path path, double scale, Format format) {
        this.path = path;
        this.scale = scale;
        this.format = format;
    }

}

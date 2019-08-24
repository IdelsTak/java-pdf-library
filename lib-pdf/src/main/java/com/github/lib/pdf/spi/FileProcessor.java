/*
 Copyright (c) 2019, Hiram K.
 All rights reserved.

 */
package com.github.lib.pdf.spi;

import java.nio.file.Path;

/**

 @author Hiram K.
 */
public interface FileProcessor {

    void process(Path path);

    int getPriority();
}

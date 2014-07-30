/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.io.File;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuKernelOption extends AbstractQEmuOption {

    private final File kernel;
    private File initrd;
    private String append;

    public QEmuKernelOption(File kernel) {
        this.kernel = kernel;
    }

    @Nonnull
    public QEmuKernelOption withInitrd(@Nonnull File initrd) {
        this.initrd = initrd;
        return this;
    }

    @Nonnull
    public QEmuKernelOption withAppend(@Nonnull String append) {
        this.append = append;
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        add(line, "-kernel", kernel.getAbsolutePath());
        if (initrd != null)
            add(line, "-initrd", initrd.getAbsolutePath());
        if (append != null)
            add(line, "-append", append);
    }
}
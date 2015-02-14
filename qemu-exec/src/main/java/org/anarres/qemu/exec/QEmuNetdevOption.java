/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.anarres.qemu.exec;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nonnull;

/**
 *
 * @author shevek
 */
public class QEmuNetdevOption extends AbstractQEmuOption {

    public static enum Model {

        virtio, i82551, i82557b, i82559er, ne2k_pci, ne2k_isa, pcnet, rtl8139, e1000, smc91c111, lance, mcf_fec;
    }
    // tap,fd=29,id=hostnet1,vhost=on,vhostfd=30
    private final String name;
    public String id;
    private final Map<String, String> properties = new HashMap<String, String>();

    public QEmuNetdevOption(@Nonnull String name) {
        this.name = name;
    }

    @Nonnull
    public QEmuNetdevOption withId(@Nonnull String id) {
        this.id = id;
        return this;
    }

    @Nonnull
    public QEmuNetdevOption withProperties(@Nonnull Map<String, String> properties) {
        this.properties.putAll(properties);
        return this;
    }

    @Nonnull
    public QEmuNetdevOption withProperty(@Nonnull String key, @Nonnull String value) {
        properties.put(key, value);
        return this;
    }

    @Nonnull
    public QEmuNetdevOption withProperty(@Nonnull String key) {
        properties.put(key, null);
        return this;
    }

    @Override
    public void appendTo(List<? super String> line) {
        StringBuilder buf = new StringBuilder(name);
        appendTo(buf, properties);
        add(line, "-netdev", buf);
    }

    public static class Nic extends QEmuNetdevOption {

        public Nic() {
            super("nic");
        }
    }

    public static class User extends QEmuNetdevOption {

        public User() {
            super("user");
        }
    }

    public static class Tap extends QEmuNetdevOption {

        public Tap() {
            super("tap");
        }
    }

    public static class Bridge extends QEmuNetdevOption {

        public Bridge() {
            super("bridge");
        }
    }

    public static class Socket extends QEmuNetdevOption {

        public Socket() {
            super("socket");
        }
    }

    public static class Hubport extends QEmuNetdevOption {

        public Hubport() {
            super("hubport");
        }
    }

    public static class Dump extends QEmuNetdevOption {

        public Dump() {
            super("dump");
        }
    }

    public static class None extends QEmuNetdevOption {

        public None() {
            super("none");
        }
    }

}
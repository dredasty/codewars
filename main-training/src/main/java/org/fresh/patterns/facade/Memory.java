package org.fresh.patterns.facade;

public class Memory {
    public void load(long position, String data) {
        System.out.println("load " + position + " " + data);
    }
}

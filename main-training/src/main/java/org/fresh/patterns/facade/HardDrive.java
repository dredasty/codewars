package org.fresh.patterns.facade;

public class HardDrive {
    private long lba;
    private int size;

    public void read(long lba, int size) {
        System.out.println("Read " + lba + " " + size);
    }
}

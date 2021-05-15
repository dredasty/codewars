package org.fresh.patterns.proxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFile();
    }

    @Override
    public void displayImage() {
        System.out.println("Display " + fileName);
    }

    private void loadFile() {
        System.out.println("Load " + fileName);
    }
}

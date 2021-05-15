package org.fresh.patterns.proxy;

/**
 * What problems can the Proxy design pattern solve? [2]
 * <p>
 * The access to an object should be controlled.
 * Additional functionality should be provided when accessing an object.
 * <p>
 * When accessing sensitive objects, for example, it should be possible to check that clients have the needed access rights.
 */
public class MainClass {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        image1.displayImage();
        image1.displayImage();
        image2.displayImage();
        image2.displayImage();
        image1.displayImage();
    }
}

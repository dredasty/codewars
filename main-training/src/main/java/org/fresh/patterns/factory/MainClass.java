package org.fresh.patterns.factory;

public class MainClass {
    public static void main(String[] args) {
       createApp("win").paint();
       createApp("mac").paint();
    }

    private static Application createApp(String os) {
        if (os.equals("win")) {
            return new Application(new WinFactory());
        } else {
            return new Application(new MacFactory());
        }
    }
}

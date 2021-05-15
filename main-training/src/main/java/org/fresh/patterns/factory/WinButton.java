package org.fresh.patterns.factory;

public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println(this.getClass().getName());
    }
}

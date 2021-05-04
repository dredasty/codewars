package org.fresh.patterns.factory;

public class WinCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println(this.getClass().getName());
    }
}

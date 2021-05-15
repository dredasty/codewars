package org.fresh.patterns.factory;

public class MacCheckBox implements CheckBox {
    @Override
    public void paint() {
        System.out.println(this.getClass().getName());
    }
}

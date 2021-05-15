package org.fresh.patterns.factory;

class Application {
    private final Button button;
    private final CheckBox checkBox;

    public Application(GuiFactory factory) {
        this.button = factory.createButton();
        this.checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}

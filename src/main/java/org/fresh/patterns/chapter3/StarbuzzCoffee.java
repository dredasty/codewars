package org.fresh.patterns.chapter3;

import lombok.extern.java.Log;

@Log
public class StarbuzzCoffee {
    public static void main(String[] args) {
        Espresso e = new Espresso();
        Mocha mocha = new Mocha(e);
        log.info(mocha.getDescription());
        log.info(Double.valueOf(mocha.cost()).toString());
    }
}

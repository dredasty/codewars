package org.fresh.patterns.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MainClass {
    public static void main(String[] args) {
        Person person = Person.builder().firstName("First Name").lastName("Last Name").age(22).build();
        log.debug("Person is: {}", person);
    }
}

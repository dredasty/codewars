package org.fresh.patterns.builder;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
class Person {
    private String firstName;
    private String lastname;
    private int age;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    static class PersonBuilder {
        private String firstName;
        private String lastName;
        private int age;

        PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        PersonBuilder age(int age) {
            this.age = age;
            return this;
        }

        Person build() {
            return new Person(this.firstName, this.lastName, this.age);
        }
    }
}

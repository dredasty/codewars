package org.fresh.kyu6.meeting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Meeting {

    public static String meeting(String s) {
        List<FullName> persons = Arrays.stream(s.toUpperCase().split(";")).map(p -> p.split(":")).
                map(c -> new Meeting().new FullName(c[0], c[1])).collect(Collectors.toList());
        Collections.sort(persons, (fn1, fn2) -> {
            if (fn1.lastName.compareTo(fn2.lastName) == 0) {
                return fn1.firstName.compareTo(fn2.firstName);
            } else {
                return fn1.lastName.compareTo(fn2.lastName);
            }
        });

        StringBuilder sb = new StringBuilder();
        persons.forEach(sb::append);
        return sb.toString();

    }

    private class FullName {

        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String firstName;

        public String lastName;

        @Override
        public String toString() {
            return "(" + lastName + ", " + firstName + ")";
        }
    }

    private class FullNamesComparator implements Comparator<FullName> {

        @Override
        public int compare(FullName fn1, FullName fn2) {
            if (fn1.lastName.compareTo(fn2.lastName) == 0) {
                return fn1.firstName.compareTo(fn2.firstName);
            } else {
                return fn1.lastName.compareTo(fn2.lastName);
            }
        }
    }
}

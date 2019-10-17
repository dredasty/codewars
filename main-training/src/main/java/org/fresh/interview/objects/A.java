package org.fresh.interview.objects;

public class A extends B {
    static int counter = 100;
    private int hash;

    A() {
        System.out.println("A");
        hash = counter;
        counter++;
    }

    public static void doSomething() {
        System.out.println("AA");

    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof A) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return hash;
    }
}

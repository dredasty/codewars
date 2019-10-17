package org.fresh.interview.objects;

import java.util.HashMap;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        Map<A, String> map = new HashMap<>();
        A a1 = new A();
        A a2 = new A();
        map.put(a1, "a1");
        map.put(a2, "a2");

        System.out.println(map.get(a1));
        System.out.println(a1);
        System.out.println(map.get(a2));
        System.out.println(a2);
        System.out.println(a1.equals(a2));
        A.doSomething();
        B.doSomething();
    }
}

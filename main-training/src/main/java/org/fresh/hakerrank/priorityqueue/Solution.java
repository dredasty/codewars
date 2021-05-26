package org.fresh.hakerrank.priorityqueue;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        List<String> events = new ArrayList<>(){{
            add("ENTER John 3.75 50");
            add("ENTER Mark 3.8 24");
            add("ENTER Shafaet 3.7 35");
            add("SERVED");
            add("SERVED");
            add("ENTER Samiha 3.85 36");
            add("SERVED");
            add("ENTER Ashley 3.9 42");
            add("ENTER Maria 3.6 46");
            add("ENTER Anik 3.95 49");
            add("ENTER Dan 3.95 50");
            add("SERVED");
        }};

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}

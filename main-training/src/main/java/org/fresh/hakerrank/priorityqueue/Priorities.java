package org.fresh.hakerrank.priorityqueue;

import java.util.*;

class Priorities {
    List<Student> getStudents(List<String> events) {
        Comparator<Student> comparator = Comparator.comparing(Student::getCGPA).reversed()
                .thenComparing(Student::getName)
                .thenComparing(Student::getID);

        PriorityQueue<Student> queue = new PriorityQueue<>(events.size(), comparator);

        // ENTER John 3.75 50
        for (String event : events) {
            String[] str = event.split(" ");
            if (str[0].equals("ENTER")) {
                queue.add(new Student(Integer.parseInt(str[3]), str[1], Double.parseDouble(str[2])));
            } else if (str[0].equals("SERVED")) {
                queue.poll();
            }
        }

        List<Student> result = new ArrayList<>();
        final int size = queue.size();
        for (int i = 0; i < size; i ++) {
            result.add(queue.poll());
        }
        return result;
    }
}
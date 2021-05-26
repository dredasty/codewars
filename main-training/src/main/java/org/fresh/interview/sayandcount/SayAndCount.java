package org.fresh.interview.sayandcount;

public class SayAndCount {
    public static void main(String[] args) {
        String input = "11222333311111";

        for (int i = 0; i < 50; i++) {
            input = sayAndCount(input);
            System.out.println((i + 1) + ": " + input.length());
        }
    }

    private static String sayAndCount(String input) {
        char[] processed = input.toCharArray();
        StringBuilder result = new StringBuilder();

        int count = 0;
        char current = processed[0];
        for (char c : processed) {
            if (current == c) {
                count++;
            } else {
                result.append(count).append(current);
                count = 1;
            }
            current = c;
        }

        return result.append(count).append(current).toString();
    }
}

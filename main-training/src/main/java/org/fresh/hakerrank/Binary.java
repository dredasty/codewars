package org.fresh.hakerrank;


public class Binary {

    public static void main(String[] args) {
        int n = 951;
        System.out.println(Integer.toBinaryString(n));

        StringBuilder binary = new StringBuilder();
        while (n != 0) {
            binary.append(n % 2);
            n /= 2;
        }

        char[] array = binary.reverse().toString().toCharArray();

        int max = 0;
        int counter = 0;
        for (char c : array) {
            if (c == '1') {
                counter++;
            } else {
                if (counter >= max) {
                    max = counter;
                }
                counter = 0;
            }
        }

        System.out.println(Math.max(max, counter));
    }
}

package org.fresh.hakerrank;

public class CountingValleys {
    public static void main(String[] args) {
        int valleys = countingValleys(8, "DDUUDDUDUUUD");
        System.out.println(valleys);
    }

    public static int countingValleys(int steps, String path) {
        int valleys = 0;
        int elevation = 0;
        boolean isBelow;

        for(char c : path.toCharArray()) {
            isBelow = elevation < 0;

            if (c == 'D') {
                elevation--;
            } else {
                elevation++;
            }
            if (isBelow && elevation == 0) {
                valleys++;
            }
        }

        return valleys;
    }
}

package org.fresh.hakerrank.medium;

import java.util.Arrays;
import java.util.List;

public class FraudulentActivityNotifications {
    public static void main(String[] args) {
        System.out.println(activityNotifications(List.of(10, 20, 30, 40, 50), 3));
        System.out.println(activityNotifications(List.of(1, 2, 3, 4, 4), 4));
        System.out.println(activityNotifications(List.of(2, 3, 4, 2, 3, 6, 8, 4, 5), 5));
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
        int notices = 0;

        for (int i = d; i < expenditure.size(); i++) {
            int[] subArray = getSubArray(expenditure, i - 1, d);
            double median = getMedian(subArray, d);
            if (expenditure.get(i) >= median * 2) {
                notices++;
            }
        }

        return notices;
    }

    private static int[] getSubArray(List<Integer> array, int current, int numberBackward) {
        int[] subArray = new int[numberBackward];
        for (int i = 0; i < numberBackward; i++) {
            subArray[i] = array.get(current - i);
        }
        return subArray;
    }

    private static double getMedian(int[] array, int number) {
        Arrays.sort(array);
        return number % 2 == 1
                ? array[(number + 1) / 2 - 1]
                : (array[number / 2 - 1] + array[number / 2]) / 2d;
    }
}

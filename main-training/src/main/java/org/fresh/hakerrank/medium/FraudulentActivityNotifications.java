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
        int[] subArray = new int[d];

        for (int i = d; i < expenditure.size(); i++) {
            for (int j = 0; j < d; j++) {
                subArray[j] = expenditure.get(i - j - 1);
            }

            Arrays.sort(subArray);

            if (d % 2 == 1) {
                if (expenditure.get(i) >= subArray[(d + 1) / 2 - 1] * 2) {
                    notices++;
                }
            } else {
                if (expenditure.get(i) >= (subArray[d / 2 - 1] + subArray[d / 2])) {
                    notices++;
                }
            }
        }

        return notices;
    }
}

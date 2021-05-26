package org.fresh.hakerrank.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkAndToys {
    public static void main(String[] args) {
        System.out.println(maximumToys(new ArrayList<>(){{add(1);add(2);add(3);add(4);}}, 7));
    }

    public static int maximumToys(List<Integer> prices, int k) {
        int remainder = k;
        int amount = 0;
        Collections.sort(prices);
        while (remainder > 0 && prices.size() > 0) {
            int currentToyPrice = prices.remove(0);
            if (currentToyPrice <= remainder) {
                amount++;
                remainder -= currentToyPrice;
            } else {
              break;
            }
        }
        return amount;
    }
}

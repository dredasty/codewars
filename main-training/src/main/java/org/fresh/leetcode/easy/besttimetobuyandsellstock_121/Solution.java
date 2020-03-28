package org.fresh.leetcode.easy.besttimetobuyandsellstock_121;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int min = prices[0];
        int max;
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > min) {
                max = prices[i];
            } else {
                min = prices[i];
                max = 0;
            }

            if (max - min > profit) {
                profit = max - min;
            }
        }
        return profit;
    }
}

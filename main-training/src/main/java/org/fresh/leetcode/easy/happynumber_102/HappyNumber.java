package org.fresh.leetcode.easy.happynumber_102;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/happy-number/
 */
@Slf4j
public class HappyNumber {
    private Set<Integer> numbers = new HashSet();

    public boolean isHappy(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0) {
            return false;
        }

        log.debug("Number is {}", n);
        final char[] chars = String.valueOf(n).toCharArray();
        int sum = 0;
        for (char c : chars) {
            sum += Math.pow(Double.parseDouble(String.valueOf(c)), 2);
        }
        log.debug("Sum is {}", sum);
        if (sum == 1) {
            return true;
        } else {
            if (numbers.add(sum)) {
                return isHappy(sum);
            }
        }
        return false;
    }
}

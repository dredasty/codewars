package org.fresh.leetcode.easy.countripes_204;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/count-primes/
 */
@Slf4j
public class CountPrimes {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                counter++;
            }
        }
        return counter;
    }
}

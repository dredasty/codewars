package org.fresh.leetcode.easy.countprimes_204;

import org.fresh.leetcode.easy.countripes_204.CountPrimes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimesTest {
    @Test
    public void testCountPrimes() {
        CountPrimes cp = new CountPrimes();

        Assertions.assertEquals(cp.countPrimes(0), 0);
        Assertions.assertEquals(cp.countPrimes(-1), 0);
        Assertions.assertEquals(cp.countPrimes(1), 0);
        Assertions.assertEquals(4, cp.countPrimes(10));
        Assertions.assertEquals(8, cp.countPrimes(20));
        Assertions.assertEquals(30, cp.countPrimes(120) );
    }
}

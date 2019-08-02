package org.fresh.codewars.kata.kyu6.cryptographynumber1vivacesare;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void encodeBasicTest() {
        assertEquals("Hw wx, Euxwh?", CaesarCrypto.encode("Et tu, Brute?", 3));
    }

    @Test
    public void encodeBasicInverselyTest() {
        assertEquals("Et tu, Brute?", CaesarCrypto.encode("Hw wx, Euxwh?", -3));
    }

    @Test
    public void encodeBasicTestEdgeCase() {
        assertEquals("zZ", CaesarCrypto.encode("aA", -1));
    }

    @Test
    public void encodeBasicTestEdgeCaseInvert() {
        assertEquals("aA", CaesarCrypto.encode("zZ", 1));
    }
}

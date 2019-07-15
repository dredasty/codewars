package org.fresh.codewars.kata.kyu6.matricesiaformofdatastorage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import javax.sound.midi.Soundbank;

import org.junit.jupiter.api.Test;

public class MatrixTest {

    @Test
    public void testInteger() {
        Matrix<Integer> m = new Matrix<>(3, 3);

        assertNull(m.get(1, 2));

        m.setRow(1, new Integer[] { 2, 9, 5 });
        m.setRow(2, new Integer[] { 3, 0, 8 });
        m.setRow(3, new Integer[] { 6, 1, 7 });

        assertEquals(8, m.get(2, 3).intValue());
        assertEquals(6, m.get(3, 1).intValue());
        assertEquals(9, m.get(1, 2).intValue());

        m.set(2, 3, -4);
        m.set(1, 1, m.get(1, 2) * m.get(2, 1));
        m.set(3, 2, m.get(3, 2) + m.get(3, 3) / 3);

        assertEquals(-4, m.get(2, 3).intValue());
        assertEquals(27, m.get(1, 1).intValue());
        assertEquals(3, m.get(3, 2).intValue());
    }
}
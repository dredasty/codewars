package org.fresh.codewars.kata.kyu6.cryptographynumber1vivacesare;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;

public class CaesarCrypto {
    private static final int a = 97;
    private static final int z = 122;
    private static final int A = 65;
    private static final int Z = 90;

    public static String encode(String text, int shift) {
        if (StringUtils.isBlank(text)) {
            return "";
        }
        return text.chars()
                .mapToObj(c -> shift(c, shift))
                .collect(Collectors.joining());
    }

    private static String shift(int c, int shift) {
        if (c >= a && c <= z) {
            return shiftLowerCase(c, shift);
        } else if (c >= A && c <= Z) {
            return shiftUppercase(c, shift);
        } else {
            return Character.toString(c);
        }
    }
    public static char nextCharacterInAlphabet(char character , int step) {
        boolean isLower = Character.isLowerCase(character);
        char c = Character.toLowerCase(character);
        if (c < 'a' || c > 'z')
            return character;
        char nextC = (char)((c - 'a' + step) % 26 + 'a');
        return isLower ? nextC : Character.toUpperCase(nextC);
    }

    private static String shiftLowerCase(int c, int shift) {

        return Character.toString((c + shift - (int)'a') % 26 + (int)'a');
        if (c + shift > z) {
            return shiftLowerCase(a, shift - (z - c + 1));
        } else if (c + shift < a) {
            return shiftLowerCase(z, (c - a + 1) - Math.abs(shift));
        }
        return Character.toString(c + shift);
    }

    private static String shiftUppercase(int c, int shift) {
        if (c + shift > Z) {
            return shiftLowerCase(A, shift - (Z - c + 1));
        } else if (c + shift < A) {
            return shiftLowerCase(Z, (c - A + 1) - Math.abs(shift));
        }
        return Character.toString(c + shift);
    }
}

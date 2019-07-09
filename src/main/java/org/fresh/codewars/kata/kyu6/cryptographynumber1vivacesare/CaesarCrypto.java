package org.fresh.codewars.kata.kyu6.cryptographynumber1vivacesare;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Collectors;

public class CaesarCrypto {

    public static String encode(String text, int shift) {
        if (StringUtils.isBlank(text)) {
            return "";
        }
        return text.chars().mapToObj(c -> shift(c, shift)).collect(Collectors.joining());
    }

    private static String shift(int c, int shift) {
        return Character.toString((c + shift - (int) 'a') % 26 + (int) 'a');
    }
}

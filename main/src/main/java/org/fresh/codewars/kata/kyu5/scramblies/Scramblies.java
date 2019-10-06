package org.fresh.codewars.kata.kyu5.scramblies;

import java.util.HashMap;
import java.util.Map;

/**
 * https://www.codewars.com/kata/scramblies/train/java
 */
public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }

        Map<Character, Integer> chars = calculateSymbols(str1.toLowerCase().toCharArray());
        char[] c2 = str2.toLowerCase().toCharArray();
        for (char c : c2) {
            Integer integer = chars.get(c);
            if (integer == null) {
                return false;
            } else if (integer <= 0) {
                return false;
            } else {
                chars.put(c, --integer);
            }
        }
        return true;
    }

    private static Map<Character, Integer> calculateSymbols(char[] chars) {
        Map<Character, Integer> characters = new HashMap<>();
        for (char c : chars) {
            Integer integer = characters.get(c);
            if (integer == null) {
                characters.put(c, 1);
            } else {
                characters.put(c, ++integer);
            }
        }

        return characters;
    }
}

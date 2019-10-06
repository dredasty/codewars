package org.fresh.codewars.kata.kyu7.disemvoweltrolls;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Troll {
    public static String disemvowel(String str) {
        return str.chars()
                .filter(c -> !Arrays.asList(65, 69, 73, 79, 85, 97, 101, 105, 111, 117).contains(c))
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }
}

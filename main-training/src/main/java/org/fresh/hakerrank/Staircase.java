package org.fresh.hakerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Staircase {
    public static void main(String[] args) {
        Staircase.staircase(6);
    }

    public static void staircase(int n) {
        List<String> string = new ArrayList<>();
        int spaces = n - 1;
        for (int i = 0; i < n; i++) {
            String spacesString = multiplyCharacter(' ', spaces - i);
            String hashesString = multiplyCharacter('#', i + 1);
            string.add(spacesString + hashesString);
        }
        System.out.println(string.stream().collect(Collectors.joining("\n")));
    }

    private static String multiplyCharacter(char c, int amount) {
        String result = "";
        for (int i = 0; i < amount; i++) {
            result += c;
        }
        return result;
    }
}

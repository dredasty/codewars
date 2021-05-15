package org.fresh.hakerrank;

import java.util.ArrayList;
import java.util.List;

public class FormingMagicSquare {
    private static List<List<Integer>> square1 = new ArrayList<>() {{
        add(List.of(5, 3, 4));
        add(List.of(1, 5, 8));
        add(List.of(6, 4, 2));
    }};
    private static List<List<Integer>> square2 = new ArrayList<>() {{
        add(List.of(4, 9, 2));
        add(List.of(3, 5, 7));
        add(List.of(8, 1, 5));
    }};

    public static void main(String[] args) {
        System.out.println(formingMagicSquare(square1));
        System.out.println(formingMagicSquare(square2));
    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        return 0;
    }
/*
    4 9 2 | 2 9 4
    3 5 7 | 7 5 3
    8 1 6 | 6 1 8
    -------------
    8 1 6 | 6 1 8
    3 5 7 | 7 5 3
    4 9 2 | 2 9 4


    8 3 4 | 4 3 8
    1 5 9 | 9 5 1
    6 7 2 | 2 7 6
    -------------
    6 7 2 | 2 7 6
    1 5 9 | 9 5 1
    8 3 4 | 4 3 8
*/
}

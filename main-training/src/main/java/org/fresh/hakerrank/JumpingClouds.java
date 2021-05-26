package org.fresh.hakerrank;

import java.util.List;

public class JumpingClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(List.of(0, 0, 0, 1, 0, 0)));
        System.out.println(jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)));
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int hops = 0;
        int i = 0;

        while (i < c.size() - 2) {
            if (c.get(i + 2) == 0) {
                i = i + 2;
            } else {
                i = i + 1;
            }
            hops += 1;
        }
        if (i <= c.size() - 2) {
            hops += 1;
        }
        return hops;
    }
}

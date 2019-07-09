package org.fresh.codewars.kata.kyu7.mummbling;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Accumul {
    public static String accum(String s) {
        AtomicInteger i = new AtomicInteger(1);
        return Arrays.stream(s.split("")).map(c -> StringUtils.capitalize(c.toLowerCase().repeat(i.getAndIncrement()))).collect(Collectors.joining("-"));
    }
}

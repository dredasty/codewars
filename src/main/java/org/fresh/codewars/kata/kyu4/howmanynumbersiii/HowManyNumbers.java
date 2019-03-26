package org.fresh.codewars.kata.kyu4.howmanynumbersiii;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

class HowManyNumbers {
    public static List<Long> findAll(final int sumDigits, final int numDigits) {
        long min = Float.valueOf("1e+" + (numDigits - 1)).longValue();
        long max = Float.valueOf("1e+" + numDigits).longValue();
        List<Long> collection = LongStream.range(min, max).parallel()
                .filter(item -> {
                    String[] split = String.valueOf(item).split("");
                    for (int i = 0; i < split.length - 1; i++) {
                        if (Long.valueOf(split[i]) > Long.valueOf(split[i + 1])) {
                            return false;
                        }
                    }
                    return sumDigits(item) == sumDigits;
                }).boxed().collect(Collectors.toList());
        List<Long> result = new ArrayList<>();
        if (collection.size() == 0) {
            return result;
        }
        result.add(Long.valueOf(collection.size()));
        result.add(collection.get(0));
        result.add(collection.get(collection.size() - 1));
        return result;
    }

    public static long sumDigits(long i) {
        return i == 0 ? 0 : i % 10 + sumDigits(i / 10);
    }
}
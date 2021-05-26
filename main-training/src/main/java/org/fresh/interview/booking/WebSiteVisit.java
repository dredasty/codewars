package org.fresh.interview.booking;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class WebSiteVisit {
    Map<String, Integer> counter = new HashMap<>();

    @SneakyThrows
    public String analyze(String pattern) {
        VisitLog[] log = new ObjectMapper().readValue(pattern, VisitLog[].class);

        Map<String, List<Character>> visits = new HashMap<>();

        for (VisitLog v : log) {
            List<Character> pages = visits.getOrDefault(v.getUser(), new ArrayList<>());
            if (pages.isEmpty()) {
                countSequences(visits, v, pages);
            }

            if (pages.get(pages.size() - 1) != v.getPage().charAt(0)) {
                countSequences(visits, v, pages);
            }
        }


        return counter.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .get()
                .getKey();
    }

    private void countSequences(Map<String, List<Character>> visits, VisitLog v, List<Character> pages) {
        pages.add(v.getPage().charAt(0));
        visits.put(v.getUser(), pages);

        final List<Character> characters = visits.get(v.getUser());
        final int size = characters.size();

        if (size > 2) {
            String sequence = Stream.of(characters.get(size - 3), characters.get(size - 2), characters.get(size - 1))
                    .collect(Collector.of(
                            StringBuilder::new,
                            StringBuilder::append,
                            StringBuilder::append,
                            StringBuilder::toString));
            final Integer count = counter.getOrDefault(sequence, 0);
            counter.put(sequence, count + 1);
        }
    }
}


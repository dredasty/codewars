package org.fresh.leetcode.medium.wordladder_127;

import java.util.*;

/**
 * https://leetcode.com/problems/word-ladder/
 */
public class WordLadderSolution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if (beginWord == null || endWord == null || wordList == null || wordList.isEmpty() || beginWord == endWord) {
            return 0;
        }

        int length = beginWord.length();

        Map<String, List<String>> preprocessedWords = preprocessWords(wordList);

        Queue<Pair<String, Integer>> queue = new ArrayDeque<>();
        queue.add(Pair.of(beginWord, 1));

        Map<String, Boolean> visited = new HashMap<>();
        visited.put(beginWord, true);

        while (!queue.isEmpty()) {
            Pair<String, Integer> node = queue.remove();
            String word = node.getKey();
            int level = node.getValue();

            for (int i = 0; i < length; i++) {
                String newWord = word.substring(0, i) + '*' + word.substring(i + 1, length);
                for (String adjacentWord : preprocessedWords.getOrDefault(newWord, new ArrayList<>())) {
                    if (adjacentWord.equals(endWord)) {
                        return level + 1;
                    }

                    if (!visited.containsKey(adjacentWord)) {
                        visited.put(adjacentWord, true);
                        queue.add(Pair.of(adjacentWord, level + 1));
                    }
                }
            }
        }

        return 0;
    }

    private Map<String, List<String>> preprocessWords(List<String> wordList) {
        Map<String, List<String>> preprocessor = new HashMap<>();
        for (String word : wordList) {
            final int length = word.length();
            for (int i = 0; i < length; i++) {
                String tempWord = word.substring(0, i) + '*' + word.substring(i + 1, length);
                List<String> strings = preprocessor.getOrDefault(tempWord, new ArrayList<>());
                strings.add(word);
                preprocessor.put(tempWord, strings);
            }
        }
        return preprocessor;
    }

    private static class Pair<L, R> {
        private L left;
        private R right;

        private Pair(L l, R r) {
            left = l;
            right = r;
        }

        public static <L, R> Pair<L, R> of(L key, R value) {
            return new Pair<>(key, value);
        }

        public L getKey() {
            return left;
        }

        public R getValue() {
            return right;
        }
    }
}

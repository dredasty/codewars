package org.fresh.codewars.kata.kyu4.rankingpokerhands;

import java.util.*;
import java.util.stream.Collectors;

/**
 * https://www.codewars.com/kata/ranking-poker-hands
 */
public class PokerHand {

    public Value highestCard;

    public enum Result {TIE, WIN, LOSS}

    public enum Suite {SPADES, HEARTS, DIAMONDS, CLUBS}

    public enum Value {
        TWO(1), THREE(2), FOUR(3), FIVE(5), SIX(8), SEVEN(13), EIGHT(21), NINE(34), TEN(55), JACK(89), QUEEN(144), KING(233), ACE(377);
        private int value;

        Value(int value) {
            this.value = value;
        }
    }

    public enum HandValue {
        HIGHCARD(0), PAIR(10000), TWO_PAIRS(20000), THREE_OF_A_KIND(30000), STRAIGHT(40000), FLUSH(50000), FULL_HOUSE(60000), FOUR_OF_A_KIND(70000), STRAIGHT_FLUSH(80000), ROYAL_FLUSH(90000);
        private int value;

        HandValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    private List<Card> hand;

    PokerHand(String hand) {
        this.hand = parseHand(hand);
    }

    Result compareWith(PokerHand hand) {
        if (this.calculateHandValue(this.hand).getValue() > hand.calculateHandValue(hand.hand).getValue()) {
            return Result.WIN;
        } else if (this.calculateHandValue(this.hand).getValue() < hand.calculateHandValue(hand.hand).getValue()) {
            return Result.LOSS;
        } else {
            if (this.highestCard.value > hand.highestCard.value) {
                return Result.WIN;
            } else if (this.highestCard.value < hand.highestCard.value) {
                return Result.LOSS;
            }
        }

        if (this.sumOfCards(this.hand) > hand.sumOfCards(hand.hand)) {
            return Result.WIN;
        } else if (this.sumOfCards(this.hand) < hand.sumOfCards(hand.hand)) {
            return Result.LOSS;
        }
        return Result.TIE;
    }

    int sumOfCards(List<Card> hand) {
        return hand.stream().mapToInt(h -> h.value.value).sum();
    }

    HandValue calculateHandValue(List<Card> hand) {
        HandValue flush = HandValue.HIGHCARD;
        Map<Suite, Integer> suites = new HashMap<>();
        Map<Value, Integer> values = new HashMap<>();
        for (Card card : hand) {
            if (suites.get(card.suite) != null) {
                suites.put(card.suite, suites.get(card.suite) + 1);
            } else {
                suites.put(card.suite, 1);
            }

            if (values.get(card.value) != null) {
                values.put(card.value, values.get(card.value) + 1);
            } else {
                values.put(card.value, 1);
            }
        }
        for (Suite key : suites.keySet()) {
            if (suites.get(key) == 5) {
                flush = HandValue.FLUSH;
            }
        }

        List<Value> sortedKeys = new ArrayList<>();
        sortedKeys.addAll(values.keySet());

        Collections.sort(sortedKeys, Comparator.comparingInt(o -> o.value));
        highestCard = sortedKeys.get(sortedKeys.size() - 1);
        HandValue value2 = HandValue.HIGHCARD;
        for (int i = 2; i < values.size(); i++) {
            if (sortedKeys.get(i).value != sortedKeys.get(i - 1).value + sortedKeys.get(i - 2).value) {
                value2 = HandValue.HIGHCARD;
                break;
            } else {
                value2 = HandValue.STRAIGHT;
            }
        }
        for (Value key : values.keySet()) {
            if (values.get(key) == 2) {
                if (value2.equals(HandValue.PAIR)) {
                    value2 = HandValue.TWO_PAIRS;
                } else if (value2.equals(HandValue.THREE_OF_A_KIND)) {
                    value2 = HandValue.FULL_HOUSE;
                } else {
                    value2 = HandValue.PAIR;
                }
                highestCard = key;
            } else if (values.get(key) == 3) {
                if (value2.equals(HandValue.PAIR)) {
                    value2 = HandValue.FULL_HOUSE;
                } else {
                    value2 = HandValue.THREE_OF_A_KIND;
                }
                highestCard = key;
            } else if (values.get(key) == 4) {
                value2 = HandValue.FOUR_OF_A_KIND;
                highestCard = key;
            }
        }

        if (flush.equals(HandValue.FLUSH) && value2.equals(HandValue.STRAIGHT)) {
            if (values.containsKey(Value.ACE)) {
                return HandValue.ROYAL_FLUSH;
            }
            return HandValue.STRAIGHT_FLUSH;
        } else if (flush.getValue() > value2.getValue()) {
            return flush;
        }

        return value2;
    }

    private List<Card> parseHand(String hand) {
        return Arrays.stream(hand.split(" ")).map(c -> new Card(c.substring(0, 1), c.substring(1, 2))).collect(Collectors.toList());
    }

    public class Card {
        Value value;
        Suite suite;

        Card(String value, String suite) {
            this.value = parseValue(value);
            this.suite = parseSuite(suite);
        }

        private Value parseValue(String value) {
            switch (value.toUpperCase()) {
                case "2":
                    return Value.TWO;
                case "3":
                    return Value.THREE;
                case "4":
                    return Value.FOUR;
                case "5":
                    return Value.FIVE;
                case "6":
                    return Value.SIX;
                case "7":
                    return Value.SEVEN;
                case "8":
                    return Value.EIGHT;
                case "9":
                    return Value.NINE;
                case "T":
                    return Value.TEN;
                case "J":
                    return Value.JACK;
                case "Q":
                    return Value.QUEEN;
                case "K":
                    return Value.KING;
                case "A":
                    return Value.ACE;
                default:
                    return null;
            }
        }

        public Suite parseSuite(String suite) {
            switch (suite.toUpperCase()) {
                case "S":
                    return Suite.SPADES;
                case "H":
                    return Suite.HEARTS;
                case "D":
                    return Suite.DIAMONDS;
                case "C":
                    return Suite.CLUBS;
                default:
                    return null;
            }
        }
    }
}

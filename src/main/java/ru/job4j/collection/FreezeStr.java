package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] charsOfLeft = left.toCharArray();
        char[] charsOfRight = right.toCharArray();
        Map<Character, Integer> mapOfLeft = new HashMap<>();
        Map<Character, Integer> mapOfRight = new HashMap<>();
        for (char value: charsOfLeft) {
            if (!mapOfLeft.containsKey(value)) {
                mapOfLeft.put(value, 1);
            } else {
                mapOfLeft.computeIfPresent(value, (k, v) -> v + 1);
            }
        }
        for (char value: charsOfRight) {
            if (!mapOfRight.containsKey(value)) {
                mapOfRight.put(value, 1);
            } else {
                mapOfRight.computeIfPresent(value, (k, v) -> v + 1);
            }
        }
        return mapOfLeft.equals(mapOfRight);
    }
}

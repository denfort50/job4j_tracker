package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        boolean result = false;
        char[] charsOfLeft = left.toCharArray();
        char[] charsOfRight = right.toCharArray();
        Map<Character, Integer> mapOfLeft = new HashMap<>();
        for (char value: charsOfLeft) {
            if (!mapOfLeft.containsKey(value)) {
                mapOfLeft.put(value, 1);
            } else {
                mapOfLeft.computeIfPresent(value, (k, v) -> v + 1);
            }
        }
        for (char value: charsOfRight) {
            if (!mapOfLeft.containsKey(value)) {
                break;
            } else if (mapOfLeft.containsKey(value) && mapOfLeft.get(value) == 1) {
                mapOfLeft.remove(value);
            } else if (mapOfLeft.containsKey(value) && mapOfLeft.get(value) > 1) {
                mapOfLeft.computeIfPresent(value, (k, v) -> v - 1);
            }
        }
        if (mapOfLeft.isEmpty()) {
            result = true;
        }
        return result;
    }
}

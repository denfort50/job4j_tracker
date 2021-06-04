package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean result = true;
        String[] wordsOfOrigin = origin.replaceAll("\\p{P}", "").split(" ");
        String[] wordsOfLine = line.split(" ");
        Set<String> uniqueOfOrigin = new HashSet<>();
        Collections.addAll(uniqueOfOrigin, wordsOfOrigin);
        for (String value: wordsOfLine) {
            if (!uniqueOfOrigin.contains(value)) {
                result = false;
                break;
            }
        }
        return result;
    }
}

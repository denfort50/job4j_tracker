package ru.job4j.function;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        String[] numbers = {
                "1. Task",
                "2. Task",
                "11. Task"
        };
        Comparator<String> comparator = (left, right) -> {
                        System.out.println("compare - " + right.length() + " : " + left.length());
            return right.length() - left.length();
        };
        System.out.println("Отладочная информция: ");
        Arrays.sort(numbers, comparator);
    }
}

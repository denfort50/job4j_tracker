package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static List<Integer> filtration(List<Integer> data) {
        return data.stream().filter(x -> x > 0).collect(Collectors.toList());
    }
}

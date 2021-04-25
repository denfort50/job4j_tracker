package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            int index = 0;
            for (int cell : row) {
                if (index == row.length) {
                    break;
                }
                list.add(row[index++]);
            }
        }
        return list;
    }
}

package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;

import static org.junit.Assert.*;

public class StreamUsageTest {
    @Test
    public void whenCorrect() {
        List<Integer> data = new ArrayList<>(Arrays.asList(-1, 2, 3, 4, -5, -6, -7, -8));
        List<Integer> result = StreamUsage.filtration(data);
        List<Integer> expect = new ArrayList<>(Arrays.asList(2, 3, 4));
        assertThat(result, is(expect));
    }
}
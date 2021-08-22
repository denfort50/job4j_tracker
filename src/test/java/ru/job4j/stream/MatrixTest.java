package ru.job4j.stream;

import org.junit.Test;

import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MatrixTest {

    @Test
    public void matrixToListTest() {
        Integer[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> expect = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> result = Matrix.matrixToList(data);
        assertThat(result, is(expect));
    }
}
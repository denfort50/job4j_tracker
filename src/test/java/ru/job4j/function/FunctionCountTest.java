package ru.job4j.function;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FunctionCountTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionCount.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSqrFunctionThenSqrResults() {
        List<Double> result = FunctionCount.diapason(2, 5, x -> x * x);
        List<Double> expected = Arrays.asList(4D, 9D, 16D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = FunctionCount.diapason(2, 5, x -> Math.pow(3.0, x));
        List<Double> expected = Arrays.asList(9D, 27D, 81D);
        assertThat(result, is(expected));
    }
}
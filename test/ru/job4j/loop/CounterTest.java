package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int expected = 30;
        int result = Counter.sumByEven(start, finish);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom5To24Then150() {
        int start = 5;
        int finish = 24;
        int expected = 150;
        int result = Counter.sumByEven(start, finish);

        Assert.assertEquals(expected, result);
    }
}
package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int expected = 0;
        int result = FindLoop.indexOf(data, el);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas7Then2() {
        int[] data = {2, 5, 7, 8, 1};
        int el = 7;
        int expected = 2;
        int result = FindLoop.indexOf(data, el);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas0ThenNotFound() {
        int[] data = {1, 4, 5, 7, 9};
        int el = 0;
        int expected = -1;
        int result = FindLoop.indexOf(data, el);

        Assert.assertEquals(expected, result);
    }
}
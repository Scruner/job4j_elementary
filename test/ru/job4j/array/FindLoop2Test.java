package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoop2Test {
    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int expected = 0;
        int result = FindLoop2.indexOf(data, el);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int expected = 3;
        int result = FindLoop2.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind2() {
        int[] data = new int[]{3, 5, 1, 8, 9, 3};
        int el = 1;
        int start = 1;
        int finish = 4;
        int expected = 2;
        int result = FindLoop2.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFindNotFound() {
        int[] data = new int[]{1, 5, 4, 8, 2, 3, 9};
        int el = 7;
        int start = 0;
        int finish = 5;
        int expected = -1;
        int result = FindLoop2.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, result);
    }
}
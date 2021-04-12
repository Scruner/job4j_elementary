package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] expected = {4, 2, 3, 1};
        int[] result = SwitchArray.swap(input, source, dest);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to4() {
        int[] input = {3, 4, 5, 7, 9};
        int source = 2;
        int dest = 4;
        int[] expected = {3, 4, 9, 7, 5};
        int[] result = SwitchArray.swap(input, source, dest);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap4to0() {
        int[] input = {3, 4, 5, 7, 9};
        int source = input.length - 1;
        int dest = 0;
        int[] expected = {9, 4, 5, 7, 3};
        int[] result = SwitchArray.swap(input, source, dest);

        Assert.assertArrayEquals(expected, result);
    }
}
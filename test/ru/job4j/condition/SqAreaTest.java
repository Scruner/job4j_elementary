package ru.job4j.condition;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;

        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void whenP2K4Square0() {
        int p = 2;
        double k = 4;

        double expected = 0.16;

        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K3Square1() {
        int p = 5;
        double k = 3;

        double expected = 1.17;

        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}
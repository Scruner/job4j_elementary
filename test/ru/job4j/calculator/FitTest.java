package ru.job4j.calculator;

import junit.framework.Assert;
import org.junit.Test;

public class FitTest {
    @Test
    void whenMan180THen92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    void whenWoman170THen69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}
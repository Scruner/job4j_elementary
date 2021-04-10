package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivideBySixTest {

    @Test
    public void whenNumberDivideBy6() {
        int in = 24;
        String expected = "Исходное число делится на 6.";
        String result = DivideBySix.checkNumber(in);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberDivideBy3AndNotEven() {
        int in = 9;
        String expected = "Исходное число делится на 3, но не является четным.";
        String result = DivideBySix.checkNumber(in);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndEven() {
        int in = 14;
        String expected = "Исходное число не делится на 3, но является четным.";
        String result = DivideBySix.checkNumber(in);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNumberNoDivideBy3AndNotEven() {
        int in = 25;
        String expected = "Исходное число не делится на 3 и не является четным.";
        String result = DivideBySix.checkNumber(in);

        Assert.assertEquals(expected, result);
    }
}
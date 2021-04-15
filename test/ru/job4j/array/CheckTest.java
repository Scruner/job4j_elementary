package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.Matchers.is;

public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        boolean[] data = new boolean[]{true, true, true};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        boolean[] data = new boolean[]{true, false, true};
        boolean result = Check.mono(data);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataMonoByFalseThenTrue() {
        boolean[] data = new boolean[]{false, false, false};
        boolean result = Check.mono(data);
        Assert.assertTrue(result);
    }

    @Test
    public void whenAllElementsByFalseThenTrue() {
        boolean[] data = new boolean[]{false, false, false};
        boolean expected = true;
        boolean result = Check.mono(data);

        Assert.assertThat(result, is(expected));
    }

    @Test
    public void whenElementsNotSameThenFalse() {
        boolean[] data = new boolean[]{false, true, false};
        boolean expected = false;
        boolean result = Check.mono(data);

        Assert.assertThat(result, is(expected));
    }
}
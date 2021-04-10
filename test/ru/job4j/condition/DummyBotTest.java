package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreetBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String result = DummyBot.answer(in);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenByBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String result = DummyBot.answer(in);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenEnyFrase() {
        String in = "Здарова";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String result = DummyBot.answer(in);

        Assert.assertEquals(expected, result);
    }
}
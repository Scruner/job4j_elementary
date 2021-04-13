package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double debt = (amount + (amount * (percent / 100)));
        while (debt > 0) {
            debt = (debt - salary) + ((debt - salary) * (percent / 100));
            year++;
        }
        return year;
    }
}



//while ((amount + (amount * (percent / 100))) > 0) {
//        amount + (amount * (percent / 100)) = (((amount + (amount * (percent / 100))) - salary)
//        + (((amount + (amount * (percent / 100))) - salary) * (percent / 100)));
//        year++;
//        }
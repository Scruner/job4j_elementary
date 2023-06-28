package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int c = Max.max(3, 4);
        System.out.println(c);
    }
}

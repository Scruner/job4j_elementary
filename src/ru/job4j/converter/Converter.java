package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;

    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollar.");

        //rubleToEuro method test
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        //rubleToDollar method test
        int inRtD = 180;
        int expectedRtD = 3;
        int outRtD = Converter.rubleToDollar(inRtD);
        boolean passedRtD = expectedRtD == outRtD;
        System.out.println("180 rubles are 3. Test result : " + passedRtD);
    }
}

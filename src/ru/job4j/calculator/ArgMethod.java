package ru.job4j.calculator;

//Variant_1
public class ArgMethod {
    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        ArgMethod.hello(name);
    }
}

//Variant_2
//public class ArgMethod {
//    public static void hello(String name, int age) {
//        System.out.println("Hello, " + name + " " + age);
//    }
//
//    public static void main(String[] args) {
//        String name = "Petr Arsentev";
//        int age = 33;
//
//        ArgMethod.hello(name, age);
//    }
//}
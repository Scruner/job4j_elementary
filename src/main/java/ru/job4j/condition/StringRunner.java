package ru.job4j.condition;

public class StringRunner {

  public static void main(String[] args) {
    String idea = "I like Java!";
    System.out.println(idea);
    idea = idea + " But I am a newbie. ";
    int year = 2022;
    idea += year;
    System.out.println(idea);

    char c1 = '\u0035';
    char c2 = '\u004D';
    char c3 = '\u006E';
    System.out.println(c1);
    System.out.println(c2);
    System.out.println(c3);

    System.out.println("\u0031\u0032\u0033");

    char a = 'A';
    char b = 'B';
    System.out.println(a + b);

    int a1 = 'A';
    int b1 = 'B';
    System.out.println("A: " + a1);
    System.out.println("B: " + b1);
    System.out.println("A + B: " + (a1 + b1));

    char a2 = 'A';
    System.out.println(++a2);
    char d = 'D';
    System.out.println(--d);
  }
}
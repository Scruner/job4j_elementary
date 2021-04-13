package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int shortestLength = word.length <= post.length ? word.length : post.length;
        for (int i = 0; i < shortestLength; i++) {
            if (word[word.length - 1] != post[post.length - 1]) {
                result = false;
            }
        }
        return result;
    }
}

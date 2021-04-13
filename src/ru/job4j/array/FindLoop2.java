package ru.job4j.array;

public class FindLoop2 {
    public static int indexOf(int[] data, int el) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1; /* если элемента нет в массиве, то возвращаем -1. */
        int indexEl = 0;
        for (int index = start + 1; index < finish; index++) {
            if (data[index] == el) {
                indexEl = index;
            }
            if (index == indexEl) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}

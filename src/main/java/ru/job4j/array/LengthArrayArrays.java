package ru.job4j.array;

public class LengthArrayArrays {

  public static void main(String[] args) {
    int[][] numbers = {{2}, {5, 6}, {7, 8, 9}, {1, 4, 5, 7}};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(
          "Размер вложенного массива равен: " + numbers[i].length
      );
    }
  }
}

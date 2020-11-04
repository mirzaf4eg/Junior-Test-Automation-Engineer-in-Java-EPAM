package JavaFund.MainTask;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Fundamentals
 * Main Task
 * Task third: Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
 */

public class TaskThird {
  private static final int FROM = 10;
  private static final int TO = 42;
  private static Integer[] arrayRandomNum;
  private static int randomNum;

  private static boolean randomNumRange(int range) {
    return range >= FROM && range <= TO;
  }

  private static void getRandomNum() {
    Scanner in = new Scanner(System.in);
    while (true) {
      randomNum = in.nextInt();
      if (randomNumRange(randomNum)) {
        System.out.println("You are the best!");
        return;
      }
      System.out.println("Not bad, but try again: ");
    }
  }

  private static void getArrayRandomNum() {
    Random random = new Random();
    arrayRandomNum = new Integer[randomNum];
    for (int j = 0; j < arrayRandomNum.length; ++j) {
      arrayRandomNum[j] = random.nextInt(100);
    }
  }

  private static void outArrayRandomNumWithoutNewLine() {
    for (Integer j : arrayRandomNum) {
      System.out.print(j + " ");
    }
  }

  private static void outArrayRandomNumWithNewLine() {
    for (Integer j : arrayRandomNum) {
      System.out.println(j);
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter the number of random numbers (10-42): ");
    getRandomNum();
    getArrayRandomNum();
    System.out.println("\nHere are " + randomNum + " random numbers without a newline: ");
    outArrayRandomNumWithoutNewLine();
    System.out.println("\nHere are " + randomNum + " random numbers with a newline: ");
    outArrayRandomNumWithNewLine();
  }
}

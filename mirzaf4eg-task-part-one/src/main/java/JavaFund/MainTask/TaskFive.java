package JavaFund.MainTask;

import java.util.Scanner;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Fundamentals
 * Main Task
 * Task five: Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
 */

public class TaskFive {
  static final int FROM = 1;
  static final int TO = 12;
  static final String[] month = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
  static String monthOut;

  private static boolean isInRange(int value) {
    return value >= FROM && value <= TO;
  }

  private static boolean isNumber(String str) {
    return str.matches("-?\\d+");
  }

  private static void getNumberMonth() {
    Scanner in = new Scanner(System.in);
    int numberMonth;
    while (true) {
      String line = in.nextLine();
      if (isNumber(line)) {
        numberMonth = Integer.parseInt(line);
        if (isInRange(numberMonth)) {
          monthOut = month[numberMonth-1];
          return;
        }
      }
      System.out.println("Not bad, but try again: ");
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter the number of month: " + "(" + FROM + "-" + TO + "): ");
    getNumberMonth();
    System.out.println("You winn! It's " + monthOut + "!");
  }
}

package JavaFund.MainTask;

import java.util.Scanner;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Fundamentals
 * Main Task
 * Task fourth: Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
 */

public class TaskFourth {
  private static int sum = 0;
  private static int multiplication = 1;

  private static void mathFunction() {
    Scanner in = new Scanner(System.in);
    for (int j = 1; j < 3; j++) {
      System.out.println("Enter " + j + "/2" + " integers: ");
      int digit = in.nextInt();
      sum = sum + digit;
      multiplication *= digit;
    }
  }

  public static void main(String[] args) {
    mathFunction();
    System.out.println("The sum of the entered integers: " + sum);
    System.out.println("The multiplication of entered integers: " + multiplication);
  }
}

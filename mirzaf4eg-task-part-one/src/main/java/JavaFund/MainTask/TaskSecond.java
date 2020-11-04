package JavaFund.MainTask;

import java.util.Scanner;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Fundamentals
 * Main Task
 * Task second: Отобразить в окне консоли аргументы командной строки в обратном порядке.
 */

public class TaskSecond {
  private static String[] argsCommandLine;

  private static void getArgsCommandLine() {
    Scanner in = new Scanner(System.in);
    argsCommandLine = new String[3];
    for (int j = 0; j < 3; j++) {
      System.out.println("Enter " + (j + 1) + "/3" + " argument: ");
      argsCommandLine[j] = in.nextLine();
    }
  }

  private static void outputArgsCommandLineRevers() {
    for (int j = 0; j < argsCommandLine.length; j++) {
      System.out.println("Argument " + (3 - j) + " -> " + argsCommandLine[2 - j]);
    }
  }

  public static void main(String[] args) {
    getArgsCommandLine();
    outputArgsCommandLineRevers();
  }
}

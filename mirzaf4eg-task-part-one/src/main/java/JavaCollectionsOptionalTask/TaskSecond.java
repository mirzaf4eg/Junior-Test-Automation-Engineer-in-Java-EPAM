package JavaCollectionsOptionalTask;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task second: Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.
 */

public class TaskSecond {
  static Stack<Integer> stack = new Stack<>();

  private static boolean isNumber(String str) {
    return str.matches("\\d+");
  }

  private static void dataInput() {
    String str;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter integer: ");
    while (true) {
      str = in.nextLine();
      if (isNumber(str)) {
        for (int j = 0; j < str.length(); j++) {
          stack.push(Integer.parseInt(String.valueOf(str.charAt(j))));
        }
        return;
      }
      System.out.println("Try again: ");
    }
  }

  private static void dataOutput() {
    while (!stack.isEmpty()) {
      System.out.print(stack.pop());
    }
  }

  public static void main(String[] args) {
    dataInput();
    dataOutput();
  }
}
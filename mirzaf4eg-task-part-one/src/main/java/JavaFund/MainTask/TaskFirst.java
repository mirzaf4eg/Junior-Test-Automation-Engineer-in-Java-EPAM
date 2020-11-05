package JavaFund.MainTask;

import java.util.Scanner;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Fundamentals
 * Main Task
 * Task first: Приветствовать любого пользователя при вводе его имени через командную строку.
 */

public class TaskFirst {
  private static String user;

  private static void inputName() {
    Scanner in = new Scanner(System.in);
    user = in.nextLine();
  }

  public static void main(String[] args) {
    System.out.println("Hello, my name is mirzaf4eg! And You? ");
    inputName();
    System.out.println("Hello, " + user + "! " + "Tell us your story.");
  }
}

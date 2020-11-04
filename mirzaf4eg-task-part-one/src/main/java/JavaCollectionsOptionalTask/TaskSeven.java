package JavaCollectionsOptionalTask;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task seven: Задана строка, состоящая из символов «(», «)», «[», «]», «{», «}». Проверить правильность расстановки скобок. Использовать стек.
 */

public class TaskSeven {
  private static boolean openBracket(char bracket) {
    return "({[".indexOf(bracket) != -1;
  }

  private static boolean closeBracket(char bracket) {
    return ")}]".indexOf(bracket) != -1;
  }

  private static boolean equallyBracket(char open, char close) {
    return open == '(' && close == ')'
          || open == '{' && close == '}'
          || open == '[' && close == ']';
  }

  public static boolean compare(String str) {
    Stack<Character> stack = new Stack<>();
    for (char c : str.toCharArray()) {
      if (closeBracket(c) && stack.isEmpty()) {
        return false;
      }
      if (openBracket(c)) {
        stack.push(c);
      }
      if (closeBracket(c)) {
        if (equallyBracket(stack.peek(), c)) {
          stack.pop();
        } else {
            return false;
        }
      }
    }
    return stack.isEmpty();
  }

  private static void dataInput(String path) {
    try {
      Scanner in = new Scanner(new File(path));
      while (in.hasNextLine()) {
        String s = in.nextLine();
        if (compare(s)) {
            System.out.println(s + " It's good!");
        } else {
            System.out.println(s + " It's bad!");
        }
      }
    } catch (IOException e) {
        e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String pathToInput = "src/main/resources/JavaCollectionsSevenTaskInput.txt";
    dataInput(pathToInput);
  }
}
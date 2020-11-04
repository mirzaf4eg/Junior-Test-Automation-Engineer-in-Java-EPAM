package JavaCollectionsOptionalTask;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task first: Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.
 */

public class TaskFirst {
  private static void dataInOutFile(String pathToInput, String pathToOutput) {
    Stack<String> stack = new Stack<>();
    try (Scanner in = new Scanner(new File(pathToInput));
      FileWriter writer = new FileWriter(new File(pathToOutput))) {
      while (in.hasNextLine()) {
        stack.push(in.nextLine());
      }
      while (!stack.isEmpty()) {
        writer.write(stack.pop() + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String pathToInput = "src/main/resources/JavaCollectionsFistTaskInput.txt";
    String pathToOutput = "src/main/out/JavaCollectionsFistTaskOutput.txt";
    dataInOutFile(pathToInput, pathToOutput);
  }
}
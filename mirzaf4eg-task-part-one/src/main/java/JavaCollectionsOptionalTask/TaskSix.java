package JavaCollectionsOptionalTask;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task six: Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
 */

public class TaskSix {
  static List<String> verse = new ArrayList<>();
  private static final Comparator<String> LINE_LENGTH_COMPARATOR = (o1, o2) -> o1.length() - o2.length();

  private static void dataInput(String path) {
    try {
      Scanner in = new Scanner(new File(path));
      while (in.hasNextLine()) {
        verse.add(in.nextLine());
      }
    } catch (IOException e) {
        e.printStackTrace();
    }
  }

  private static void print(List<String> collection) {
    for (String str : collection) {
      System.out.println(str);
    }
  }

  public static void main(String[] args) {
    String pathToInput = "src/main/resources/JavaCollectionsSixTaskInput.txt";
    dataInput(pathToInput);
    System.out.println("Verse: ");
    print(verse);
    System.out.println("\nSorted verse: ");
    verse.sort(LINE_LENGTH_COMPARATOR);
    print(verse);
    }
}

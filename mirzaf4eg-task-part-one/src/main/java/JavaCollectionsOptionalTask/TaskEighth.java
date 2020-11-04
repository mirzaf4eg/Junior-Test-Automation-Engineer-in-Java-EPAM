package JavaCollectionsOptionalTask;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task eighth: Задан файл с текстом на английском языке. Выделить все различные слова. Слова, отличающиеся только регистром букв, считать одинаковыми. Использовать класс HashSet.
 */

public class TaskEighth {
  private static List<String> dataInput(String pathToInput) {
    List<String> text = new ArrayList<>();
    try {
      Scanner in = new Scanner(new File(pathToInput));
      while (in.hasNextLine()) {
        text.add(in.nextLine());
      }
    } catch (IOException e) {
        e.printStackTrace();
    }
    System.out.println(text);
    return text;
  }

  private static Set<String> toSet(List<String> list) {
    Set<String> set = new HashSet<>();
    list.forEach(line -> {
      String[] words = line.split(" ");
      for (String word : words) {
        set.add(word.toLowerCase());
      }
    });
  return set;
  }

  public static void main(String[] args) {
    String pathToInput = "src/main/resources/JavaCollectionsEighthTaskInput.txt";
    System.out.println(toSet(dataInput(pathToInput)));
  }
}

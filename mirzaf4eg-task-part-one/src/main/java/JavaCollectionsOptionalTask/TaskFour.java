package JavaCollectionsOptionalTask;

import java.util.*;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task four: Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
 */

public class TaskFour {
  private static final Comparator<String> LINE_LENGTH_COMPARATOR = (o1, o2) -> o1.length() - o2.length();
  private static final String PRAYER =
            "God, give us grace to accept with serenity\n"+
                    "the things that cannot be changed,\n"+
                    "Courage to change the things\n"+
                    "which should be changed,\n"+
                    "and the Wisdom to distinguish\n"+
                    "the one from the other.\n";

  private static void print(List<String> collection) {
    for (String str : collection) {
      System.out.println(str);
    }
  }

  public static void main(String[] args) {
    List<String> prayer = Arrays.asList(PRAYER.split("\n"));
    System.out.println("Serenity Prayer: ");
    print(prayer);
    prayer.sort(LINE_LENGTH_COMPARATOR);
    System.out.println("\nSerenity Prayer (after sort): ");
    print(prayer);
  }
}



package JavaCollectionsOptionalTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task five: Не используя вспомогательных объектов, переставить отрицательные элементы данного списка в конец, а положительные — в начало списка.
 */

public class TaskFive {
  private static final int COUNT_NUM = 12;
  private static final List<Integer> list = new ArrayList<>(COUNT_NUM);

  private static void fillingList() {
    Random random = new Random(System.currentTimeMillis());

    for (int i = 0; i < COUNT_NUM; i++) {
      int element = -1 * COUNT_NUM + random.nextInt(COUNT_NUM * 2);
      list.add(element);
    }
  }

  private static void permutationElements () {
    int i = 0;
    int index = 0;

    while (i < list.size() - index) {
      if (list.get(i) < 0) {
        list.add(list.get(i));
        list.remove(list.get(i));
        index++;
      } else {
          i++;
      }
    }
  }

  public static void main(String[] args) {
    fillingList();
    System.out.println("\nSource list of random integers: ");
    System.out.println(list);
    System.out.println("\nList after the permutation of the negative elements of the list: ");
    permutationElements();
    System.out.println(list);
  }
}
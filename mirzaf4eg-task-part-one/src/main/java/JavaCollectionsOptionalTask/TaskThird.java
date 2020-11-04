package JavaCollectionsOptionalTask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mirzaf4eg in okt 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Collections
 * Optional Task
 * Task third: Создать список из элементов каталога и его подкаталогов.
 */

public class TaskThird {
  static List<File> directory = new ArrayList<>();

  private static List<File> listElementsDirectory(File currentDir) {
    File[] directoryContent = currentDir.listFiles();
    for (File file : directoryContent) {
      if (file.isDirectory()) {
        directory.add(file);
        listElementsDirectory(file);
      } else {
          directory.add(file);
      }
    }
    return directory;
  }

  private static void contentsDirectory(String pathToDirectory, String pathToOutputList) {
    File currentDir = new File(pathToDirectory);
    Path dir = Paths.get(pathToDirectory);
    directory = listElementsDirectory(currentDir);
    try {
      FileWriter writer = new FileWriter(new File(pathToOutputList));
      BufferedWriter bw =  new BufferedWriter(writer);
      System.out.printf("%nThe file tree for directory: %s%n", dir.toAbsolutePath());
      bw.write("The file tree for directory: " + dir.toAbsolutePath());
      bw.newLine();
      for (File element : directory) {
        System.out.println(element);
        bw.write(String.valueOf(element));
        bw.newLine();
      }
      bw.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String pathToDirectory = "src/main/resources/JavaCollectionsThirdTaskDir";
    String pathToOutputList = "src/main/out/JavaCollectionsThirdTaskListElement.txt";
    contentsDirectory(pathToDirectory, pathToOutputList);
  }
}
package JavaFund.OptionalTaskSecond;

import java.util.Arrays;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Fundamentals
 * Optional Task second
 * Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random):
 * 1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
 * 2. Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.
 * 3. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.
 * 4. Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие.
 */

public class Main {
  static int[][] matrix;

  public static void main(String[] args) {
    System.out.println("__________Ввести с консоли n - размерность матрицы a [n] [n]. Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random): ");
    OptionalTaskSecond optionalTaskSecond = new OptionalTaskSecond();
    matrix = OptionalTaskSecond.getMatrix(optionalTaskSecond.getRangeOfMatrixN(), optionalTaskSecond.getIntervalValueOfMatrixM());
    System.out.println("Your matrix: ");
    optionalTaskSecond.printMatrix(matrix);

    System.out.println("\n____1_____Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).");
    TaskFirst taskFirst = new TaskFirst();
    int k = optionalTaskSecond.getSortValueOfMatrixK(optionalTaskSecond.rangeOfMatrixN);
    System.out.println("\nSort array in ascending order by " + (k + 1) + " column: ");
    optionalTaskSecond.printMatrix(taskFirst.sortMatrixColumn(matrix, k));
    System.out.println("\nSort array in ascending order by " + (k + 1) + " row: ");
    optionalTaskSecond.printMatrix(taskFirst.sortMatrixRow(matrix, k));

    System.out.println("\n____2_____Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.");
    TaskSecond taskSecond = new TaskSecond();
    System.out.println();
    optionalTaskSecond.printMatrix(matrix);
    System.out.println("\nMaximal sequence of increasing of element: ");
    taskSecond.findLargestINCREASINGSequenceOfMatrixElements(matrix);
    System.out.println(Arrays.toString(taskSecond.increasingSequence) + " With capacity: " + (taskSecond.maxIncreasingValue+1));
    System.out.println("\nMaximal sequence of decreasing of element: ");
    taskSecond.findLargestDECREASINGSequenceOfMatrixElements(matrix);
    System.out.println(Arrays.toString(taskSecond.decreasingSequence) + " With capacity: " + (taskSecond.maxDecreasingValue+1));

    System.out.println("\n____3_____Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки.\n");
    TaskThird taskThird = new TaskThird();
    optionalTaskSecond.printMatrix(matrix);
    System.out.println();
    taskThird.findSumBetweenFirstAndSecondPositiveElements(matrix);

    System.out.println("\n____4_____Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие.\n");
    TaskFour taskFour = new TaskFour();
    System.out.println("Contents of the matrix after deleting: ");
    optionalTaskSecond.printMatrix(taskFour.killAllRowsAndColumnsWithMaxElementValue(matrix));
  }
}

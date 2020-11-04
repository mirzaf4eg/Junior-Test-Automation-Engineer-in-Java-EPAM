package JavaFund.OptionalTaskSecond;

import java.util.Random;
import java.util.Scanner;

import static java.util.Arrays.stream;

public class OptionalTaskSecond extends Main {
  public int rangeOfMatrixN;
  public int intervalValueOfMatrixM;
  public int sortValueOfMatrixK;
  Scanner in = new Scanner(System.in);

  public static boolean rangeOfMatrix(int value) {
    int FROM = 3;
    int TO = 12;
    return value >= FROM && value <= TO;
  }

  public static boolean intervalValueOfMatrix (int value) {
    int FROM = 1;
    int TO = 100;
    return value >= FROM && value <= TO;
  }

  public static boolean isNumber(String str) {
    return str.matches("-?\\d+");
  }

  public int getRangeOfMatrixN() {
    System.out.println("Enter the range of matrix (from 3 to 12): ");
    while (true) {
      String line = in.nextLine();
      if (isNumber(line)) {
        rangeOfMatrixN = Integer.parseInt(line);
        if (rangeOfMatrix(rangeOfMatrixN)) {
          return rangeOfMatrixN;
        }
      }
      System.out.println("Not bad, but try again: ");
    }
  }

  public int getIntervalValueOfMatrixM() {
    System.out.println("Enter the interval of matrix values (from 1 to 100): ");
    while (true) {
      String line = in.nextLine();
      if (isNumber(line)) {
        intervalValueOfMatrixM = Integer.parseInt(line);
        if (intervalValueOfMatrix(intervalValueOfMatrixM)) {
          return intervalValueOfMatrixM;
        }
      }
      System.out.println("Not bad, but try again: ");
    }
  }

  public int getSortValueOfMatrixK(int n) {
    System.out.println("\nEntered value `k` (from 1 to " + n + "): ");
    while (true) {
      String line = in.nextLine();
      if (isNumber(line)) {
        sortValueOfMatrixK = Integer.parseInt(line) - 1;
        if (sortValueOfMatrixK < n && sortValueOfMatrixK >= 0) {
          return sortValueOfMatrixK;
        }
      }
      System.out.println("Not bad, but try again: ");
    }
  }

  public static int[][] getMatrix(int n, int M) {
    final Random random = new Random();
    int[][] result = new int[n][n];
    for (int j = 0; j < result.length; ++j) {
      for (int i = 0; i < result.length; ++i) {
        result[j][i] = random.nextInt(2 * M + 1) - M;
      }
    }
    return result;
  }

  public int[] transformFrom2DTo1D(int[][] workMatrix) {
    int[] result = new int[workMatrix.length * workMatrix.length];
    for (int i = 0; i < workMatrix.length; i++) {
      System.arraycopy(workMatrix[i], 0, result, (i * workMatrix.length), workMatrix.length);
    }
    return result;
  }

  public static int[][] transpose(int[][] workMatrix) {
    int[][] result = new int[workMatrix[0].length][workMatrix.length];
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        result[i][j] = workMatrix[j][i];
      }
    }
    return result;
  }

  public int[][] copyMatrix(int[][] workMatrix) {
    return stream(workMatrix).map(int[]::clone).toArray($ -> workMatrix.clone());
  }

  public void printMatrix(int[][] workMatrix) {
    for (int[] j : workMatrix) {
      for (int i : j) {
        System.out.format("%5d\t", i);
      }
      System.out.println();
    }
  }
}
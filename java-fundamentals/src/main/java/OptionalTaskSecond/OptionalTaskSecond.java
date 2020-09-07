package OptionalTaskSecond;

import java.util.Random;
import java.util.Scanner;

public class OptionalTaskSecond {
    private static int M;
    int range;
    int k;
    int temp;
    int[][] matrix;
    Scanner in = new Scanner(System.in);

    private static boolean matrixRange(int value) {
        int FROM = 3;
        int TO = 10;
        return value >= FROM && value <= TO;
    }

    private static boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    private static int getRandom() {
        Random random = new Random();
        return random.ints(-M, (M + 1)).limit(1).findFirst().getAsInt();
    }

    public void SetMatrixN() {
        System.out.println("Dear friend, enter the number of random numbers (3-10): ");
        while (true) {
            String line = in.nextLine();
            if (isNumber(line)) {
                range = Integer.parseInt(line);
                matrix = new int[range][range];
                if (matrixRange(range)) {
                    return;
                }
            }
            System.out.println("Not bad, but something went wrong. Try again: ");
        }
    }

    public void SetMatrixM() {
        System.out.println("Dear friend, enter the M (from -M to M): ");
        String line = in.nextLine();
        if (isNumber(line)) {
            M = Integer.parseInt(line);
            System.out.println("Ok! And look this: ");
        }
    }

    public void SetMatrix() {
        for (int j = 0; j < matrix.length; ++j) {
            for (int i = 0; i < matrix.length; ++i) {
                matrix[j][i] = getRandom();
            }
        }
    }

    public void printMatrix() {
        for (int[] j : matrix) {
            for (int i : j) {
                System.out.format("%5d\t", i);
            }
            System.out.println();
        }
    }

    public void setMatrixK() {
        System.out.println("\nEntered value `k` (1 - " + range + "): ");
        k = in.nextInt() - 1;
    }

    public void SortMatrixColumn() {
        System.out.println("\nArray elements in ascending order of the values of the " + (k + 1) + " elements of the column: ");
        for (int j = 0; j < matrix.length; j++) {
            for (int i = j + 1; i < matrix.length; i++) {
                if (matrix[j][k] > matrix[i][k]) {
                    for (int v = 0; v < matrix.length; v++) {
                        temp = matrix[j][v];
                        matrix[j][v] = matrix[i][v];
                        matrix[i][v] = temp;
                    }
                }
            }
        }
    }

    public void SortMatrixRow() {
        System.out.println("\nArray elements in ascending order of the values of the " + (k +1) + " elements of the row: ");
        for (int j = 0; j < matrix.length; j++) {
            for (int i = j + 1; i < matrix.length; i++) {
                if (matrix[k][j] > matrix[k][i]) {
                    for (int v = 0; v < matrix.length; v++) {
                        temp = matrix[v][j];
                        matrix[v][j] = matrix[v][i];
                        matrix[v][i] = temp;
                    }
                }
            }
        }
    }
}

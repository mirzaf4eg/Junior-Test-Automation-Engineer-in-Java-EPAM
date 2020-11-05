package JavaFund.OptionalTaskSecond;

import java.util.Arrays;

public class TaskThird extends OptionalTaskSecond {
  public void findSumBetweenFirstAndSecondPositiveElements(int[][] workMatrix) {
    int[][] transpose = transpose(workMatrix);
    for (int j = 0; j < transpose.length; j++) {
      int[] matrixRow = workMatrix[j];
      int[] sequenceElements;
      int count = 0;
      int RowNumber = j + 1;
      int fistIndex = 0;
      int secondIndex = 0;
      int sumElements = 0;
      for (int k : matrixRow) {
        if (k >= 0) {
          count++;
        }
      }
      if (count >= 2) {
        for (int i = 0; i < matrixRow.length; i++) {
          if (matrixRow[i] >= 0) {
            fistIndex = i;
            break;
          }
        }
        for (int i = fistIndex + 1; i < matrixRow.length; i++) {
          if (matrixRow[i] >= 0) {
            secondIndex = i;
            break;
          }
        }
        for (int i = fistIndex + 1; i < secondIndex; i++) {
          sumElements += matrixRow[i];
        }
        sequenceElements = new int[(secondIndex - (fistIndex + 1))];
        System.arraycopy(matrixRow, (fistIndex + 1), sequenceElements, 0, (secondIndex - (fistIndex + 1)));
        System.out.println("Row number: " + RowNumber + ". " + "SUM: " + sumElements + ". " + "Sequence: " + Arrays.toString(sequenceElements));
      } else {
        System.out.println("Game Over!");
      }
    }
  }
}



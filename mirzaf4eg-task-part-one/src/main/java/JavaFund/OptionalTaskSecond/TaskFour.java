package JavaFund.OptionalTaskSecond;

public class TaskFour extends OptionalTaskSecond {
  int rowIndex;
  int columnIndex;

  public int getMaxElement(int[][] workMatrix) {
    int maxElement = 0;
    for (int[] temp : workMatrix) {
      for (int i = 0; i < workMatrix.length; i++) {
        if (maxElement < temp[i]) {
          maxElement = temp[i];
        }
      }
    }
    return maxElement;
  }

  public boolean getElement(int[][] workMatrix, int maxElement) {
    for (int j = 0; j < workMatrix.length; j++) {
      for (int i = 0; i < workMatrix[0].length; i++) {
        if (workMatrix[j][i] == maxElement) {
          rowIndex = j;
          columnIndex = i;
          return true;
        }
      }
    }
    return false;
  }

  public static int[][] killerRowAndColumn(int[][] workMatrix, int row, int col) {
    final int n = workMatrix.length - 1;
    final int m = workMatrix[0].length - 1;
    int[][] result = new int[n][m];
    for (int i = 0; i < workMatrix.length; i++) {
      int newRowIndex = row < i ? i - 1 : i;
      for (int j = 0; j < workMatrix[i].length; j++) {
        int newColumnIndex = col < j ? j - 1 : j;
        if (row != i && col != j)
          result[newRowIndex][newColumnIndex] = workMatrix[i][j];
      }
    }
    return result;
  }

  public int[][] killAllRowsAndColumnsWithMaxElementValue(int[][] workMatrix) {
    int maxElement = getMaxElement(workMatrix);
    System.out.println("Maximum value of elements in the matrix: " + maxElement);
    while (getElement(workMatrix, maxElement)) {
      workMatrix = killerRowAndColumn(workMatrix, rowIndex, columnIndex);
    }
    return workMatrix;
  }

//  public static int[][] killerRow(int[][] workMatrix, int kill) {
//    int[][] result = new int[workMatrix.length - 1][];
//    int[][] left = Arrays.copyOfRange(workMatrix, 0, kill);
//    int[][] right = Arrays.copyOfRange(workMatrix, kill + 1, workMatrix.length);
//    System.arraycopy(left, 0, result, 0, left.length);
//    System.arraycopy(right, 0, result, left.length, right.length);
//    return result;
//  }
//
//  public int[][] killAllRowsAndColumnsWithMaxElementValue2 (int[][] workMatrix) {
//    int maxElement = getMaxElement(workMatrix);
//    System.out.println("Maximum value of elements in the matrix: " + maxElement);
//    while (getElement(workMatrix, maxElement)) {
//      workMatrix = killerRow(workMatrix, rowIndex);
//      workMatrix = transpose(workMatrix);
//      workMatrix = killerRow(workMatrix, columnIndex);
//      workMatrix = transpose(workMatrix);
//    }
//    return workMatrix;
//  }
}





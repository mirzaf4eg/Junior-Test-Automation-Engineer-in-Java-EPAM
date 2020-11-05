package JavaFund.OptionalTaskSecond;

public class TaskFirst extends OptionalTaskSecond {

  public int[][] sortMatrixColumn(int[][] workMatrix, int k) {
    int[][] sortMatrixColumn = copyMatrix(workMatrix);
    int temp;
    for (int j = 0; j < sortMatrixColumn.length; j++) {
      for (int i = j + 1; i < sortMatrixColumn.length; i++) {
        if (sortMatrixColumn[j][k] > sortMatrixColumn[i][k]) {
          for (int v = 0; v < sortMatrixColumn.length; v++) {
            temp = sortMatrixColumn[j][v];
            sortMatrixColumn[j][v] = sortMatrixColumn[i][v];
            sortMatrixColumn[i][v] = temp;
          }
        }
      }
    }
    return sortMatrixColumn;
  }

  public int[][] sortMatrixRow(int[][] workMatrix, int k) {
    int[][] sortMatrixRow = copyMatrix(workMatrix);
    int temp;
    for (int j = 0; j < sortMatrixRow.length; j++) {
      for (int i = j + 1; i < sortMatrixRow.length; i++) {
        if (sortMatrixRow[k][j] > sortMatrixRow[k][i]) {
          for (int v = 0; v < sortMatrixRow.length; v++) {
            temp = sortMatrixRow[v][j];
            sortMatrixRow[v][j] = sortMatrixRow[v][i];
            sortMatrixRow[v][i] = temp;
          }
        }
      }
    }
    return sortMatrixRow;
  }
}


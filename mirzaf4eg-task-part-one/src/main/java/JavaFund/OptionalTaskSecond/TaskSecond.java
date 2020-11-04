package JavaFund.OptionalTaskSecond;

public class TaskSecond extends OptionalTaskSecond {
  int[] increasingSequence;
  int[] decreasingSequence;
  int maxIncreasingValue;
  int maxDecreasingValue;

  public void findLargestINCREASINGSequenceOfMatrixElements(int[][] workMatrix) {
    int[] transform = transformFrom2DTo1D(workMatrix);
    int count = 0;
    int indexLast = 0;
    for (int j = 0; j < transform.length - 1; j++) {
      if (transform[j] < transform[j + 1]) {
        count++;
        if (count > maxIncreasingValue) {
          maxIncreasingValue = count;
          indexLast = j + 1;
        }
      } else {
          count = 0;
      }
    }
    increasingSequence = new int[maxIncreasingValue + 1];
    System.arraycopy(transform, (indexLast - maxIncreasingValue), increasingSequence, 0, (maxIncreasingValue + 1));
  }

  public void findLargestDECREASINGSequenceOfMatrixElements(int[][] workMatrix) {
    int[] transform = transformFrom2DTo1D(workMatrix);
    int count = 0;
    int indexLast = 0;
    for (int j = 0; j < transform.length - 1; j++) {
      if (transform[j] > transform[j + 1]) {
        count++;
        if (count > maxDecreasingValue) {
          maxDecreasingValue = count;
          indexLast = j + 1;
        }
      } else {
          count = 0;
      }
    }
    decreasingSequence = new int[maxDecreasingValue + 1];
    System.arraycopy(transform, (indexLast - maxDecreasingValue), decreasingSequence, 0, (maxDecreasingValue + 1));
  }
}

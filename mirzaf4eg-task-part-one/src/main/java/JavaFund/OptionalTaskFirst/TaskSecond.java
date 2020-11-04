package JavaFund.OptionalTaskFirst;

public class TaskSecond extends OptionalTaskFirst {
  public int[] sortArrayByLengthOfNumbersUP(int[] workArray) {
    for (int j = workArray.length - 1; j > 0; j--) {
      for (int i = 0; i < j; i++) {
        if ((getLengthOfNumber(workArray[i]) + 1) > (getLengthOfNumber(workArray[i + 1]) + 1)) {
          int tmp = workArray[i];
          workArray[i] = workArray[i + 1];
          workArray[i + 1] = tmp;
          }
        }
      }
      return workArray;
    }

  public int[] sortArrayByLengthOfNumbersDOWN(int[] workArray) {
    for (int j = workArray.length - 1; j > 0; j--) {
      for (int i = 0; i < j; i++) {
        if ((getLengthOfNumber(workArray[i]) + 1) < (getLengthOfNumber(workArray[i + 1]) + 1)) {
          int tmp = workArray[i];
          workArray[i] = workArray[i + 1];
          workArray[i + 1] = tmp;
        }
      }
    }
    return workArray;
  }
}
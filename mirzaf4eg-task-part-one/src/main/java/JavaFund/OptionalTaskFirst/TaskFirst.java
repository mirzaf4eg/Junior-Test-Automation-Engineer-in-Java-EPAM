package JavaFund.OptionalTaskFirst;

public class TaskFirst extends OptionalTaskFirst {
  int maxNumberLength = 0;
  int minNumberLength = arrayNumbers[0];
  int maxLength = 0;
  int minLength = String.valueOf(arrayNumbers[0]).length();

  public void findLongestAndShortestNumber(int[] workArray, int[] workArrayLength) {
    for (int j = 0; j < workArray.length; j++) {
      if (workArrayLength[j] > maxLength) {
        maxLength = workArrayLength[j];
        maxNumberLength = workArray[j];
      } else {
        if (workArrayLength[j] < minLength) {
          minLength = workArrayLength[j];
          minNumberLength = workArray[j];
        }
      }
    }
  }
}
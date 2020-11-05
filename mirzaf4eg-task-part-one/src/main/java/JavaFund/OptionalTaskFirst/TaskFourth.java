package JavaFund.OptionalTaskFirst;

public class TaskFourth extends OptionalTaskFirst {
  public int findNumberConsistMinOfDifferentDigits(int[] workArray) {
    int[] countArray = new int[workArray.length];
    int maxIndexDifDig = 0;
    int maxValueDifDig = 0;

    for (int j = 0; j < workArray.length; j++) {
      int count = 0;
      int[] differentElement = getDifferentElement(workArray[j]);
      for (int i = 0; i < differentElement.length; i++) {
        for (int k = i + 1; k < differentElement.length; k++) {
          if (differentElement[i] == differentElement[k]) {
            count++;
          }
        }
      }
      countArray[j] = count;
    }
    for (int j = 0; j < countArray.length; j++) {
      if (countArray[j] > maxValueDifDig) {
        maxIndexDifDig = j;
        maxValueDifDig = countArray[j];
      }
    }
    return workArray[maxIndexDifDig];
  }
}
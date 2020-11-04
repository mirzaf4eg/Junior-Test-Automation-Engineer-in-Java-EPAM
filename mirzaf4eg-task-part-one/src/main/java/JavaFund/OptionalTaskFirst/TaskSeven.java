package JavaFund.OptionalTaskFirst;

public class TaskSeven extends OptionalTaskFirst {
  int onlyDifferent;

  public void findNumberConsistOnlyOfDifferentDigits(int[] workArray) {
    for (int i : workArray) {
      int[] differentElement = getDifferentElement(i);
      for (int j = differentElement.length - 1; j > 0; j--) {
        int count = 1;
        for (int k = 0; k < j; k++) {
          if (((differentElement[k]) + 1) != ((differentElement[k + 1]) + 1)) {
            count++;
            if (count == differentElement.length) {
              onlyDifferent = i;
              break;
            }
          }
        }
      }
    }
  }
}

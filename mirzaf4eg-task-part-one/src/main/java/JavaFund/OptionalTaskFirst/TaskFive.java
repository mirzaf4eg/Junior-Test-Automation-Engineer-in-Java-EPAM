package JavaFund.OptionalTaskFirst;

public class TaskFive extends OptionalTaskFirst {
  public int even;
  public int even_odd;

  public void findNumbersContainOnlyEvenDigitsAndEqualEvenOdd(int[] workArray) {
    for (int j : workArray) {
      int countEven = 0;
      int countOdd = 0;
      int[] differentElement = getDifferentElement(j);

      for (int k : differentElement) {
        if (k % 2 == 0) {
          countEven++;
        } else {
            countOdd++;
        }
      }
      if (countEven == differentElement.length) {
        even++;
      } else {
        if (countEven == countOdd) {
              even_odd++;
        }
      }
    }
  }
}


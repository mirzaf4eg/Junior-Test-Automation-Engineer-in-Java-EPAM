package JavaFund.OptionalTaskFirst;

public class TaskThird extends OptionalTaskFirst{

  public void getNumbersLengthIsLessThanAverage(int[] workArray, double aver) {
    for (int j : workArray) {
      if ((getLengthOfNumber(j) + 1) < aver) {
        System.out.println(j + "\t" + "His length: " + getLengthOfNumber(j));
      }
    }
  }

  public void getNumbersLengthIsMoreThanAverage(int[] workArray, double aver) {
    for (int j : workArray) {
      if ((getLengthOfNumber(j) + 1) > aver) {
        System.out.println(j + "\t" + "His length: " + getLengthOfNumber(j));
      }
    }
  }
}

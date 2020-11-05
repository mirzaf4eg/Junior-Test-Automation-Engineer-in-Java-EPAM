package JavaFund.OptionalTaskFirst;

import java.util.Scanner;

public class OptionalTaskFirst extends Main{
  public int numberOfDigits;
  Scanner in = new Scanner(System.in);

  public int getNumberOfDigits() {
    numberOfDigits = in.nextInt();
    return numberOfDigits;
  }

  public int getLengthOfNumber(int n) {
    int count = (n == 0) ? 1 : 0;
        while (n != 0) {
          count++;
          n /= 10;
        }
        return count;
  }

  public int[] getDifferentElement(int n) {
    int[] diffElementArray = new int[getLengthOfNumber(n)];
    for (int j = 0; j < diffElementArray.length; j++) {
      diffElementArray[diffElementArray.length - j - 1] = n % 10;
      n /= 10;
    }
    return diffElementArray;
  }

  public double getAverLengthOfNumber(int[] workArrayLengths) {
    double aver = 0.0D;
    for (int j : workArrayLengths) {
      aver += j;
    }
    return aver / numberOfDigits;
  }

  public int[] getArrayNumbers(int n) {
    arrayNumbers = new int[n];
    for (int j = 0; j < arrayNumbers.length; j++) {
      System.out.println("Enter " + (j + 1) + " digit: ");
      arrayNumbers[j] = in.nextInt();
    }
    return arrayNumbers;
  }

  public int[] getArrayNumbersLengths() {
    int[] workArray = new int[numberOfDigits];
    for (int j = 0; j < workArray.length; j++) {
      workArray[j] = getLengthOfNumber(arrayNumbers[j]);
    }
    return workArray;
  }

  public void printArray(int[] array) {
    for (int j : array) {
      System.out.print(j + " ");
    }
    System.out.println();
  }
}

package OptionalTaskFirst;

import java.util.HashSet;
import java.util.Scanner;

public class OptionalTaskFirst {
    int[] numberArray;
    int[] numberLengthArray;
    int numberDigits;

    private static int getNumberLength (int numLength) {
        numLength = (int) (Math.log10(Math.abs(numLength)));
        return numLength;
    }
    private static int HashUniqueNumber (int x) {
        HashSet<Integer> h;
        for (h = new HashSet<>(); x > 0; x /= 10) {
            h.add(x % 10);
        }
        return h.size();
    }

    public void numberArraySet() {
        Scanner in = new Scanner(System.in);
        System.out.println("Dear friend, enter `n` (array length): ");
        numberDigits = in.nextInt();
        numberArray = new int[numberDigits];
        for (int j = 0; j < numberArray.length; j++) {
            System.out.println("Dear friend, enter " + (j + 1) + " integers: ");
            numberArray[j] = in.nextInt();
        }
    }

    public void numberLengthArraySet() {
        numberLengthArray = new int[numberDigits];
        for (int j = 0; j < numberLengthArray.length; j++) {
            numberLengthArray[j] = getNumberLength(numberArray[j]) + 1;
        }
        for (int j = 0; j < numberLengthArray.length; j++) {
            System.out.println("The your number: " + numberArray[j] + ", its length: " + numberLengthArray[j]);
        }
        System.out.println();
    }

    public void MinMaxLength() {

        int maxNumberLength = 0;
        int minNumberLength = 0;
        int maxLength = 0;
        int minLength = String.valueOf(numberArray[0]).length();

        for (int j = 0; j < numberArray.length; j++) {
            if (numberLengthArray[j] > maxLength) {
                maxLength = numberLengthArray[j];
                maxNumberLength = numberArray[j];
            } else {
                if (numberLengthArray[j] < minLength) {
                    minLength = numberLengthArray[j];
                    minNumberLength = numberArray[j];
                }
            }
        }
        System.out.println("The long number: " + maxNumberLength + ", its length: " + maxLength);
        System.out.println("The shortest number: " + minNumberLength + ", its length: " + minLength);
    }

    public void sortNumberArrayUP() {
        for (int j = numberArray.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if ((getNumberLength(numberArray[i]) + 1) > (getNumberLength(numberArray[i + 1]) + 1)) {
                    int tmp = numberArray[i];
                    numberArray[i] = numberArray[i + 1];
                    numberArray[i + 1] = tmp;
                }
            }
        }
        System.out.println("\nYour numbers in ascending order of their length: ");
        for (int j : numberArray) {
            System.out.println(j + " ");
        }
    }

    public void sortNumberArrayDOWN() {
        for (int j = numberArray.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if ((getNumberLength(numberArray[i]) + 1) < (getNumberLength(numberArray[i+1]) + 1)) {
                    int tmp = numberArray[i];
                    numberArray[i] = numberArray[i + 1];
                    numberArray[i + 1] = tmp;
                }
            }
        }
        System.out.println("\nYour numbers are in descending order of their length: ");
        for (int j : numberArray) {
            System.out.println(j + " ");
        }
    }

    // Нахожу среднюю длину чисел, и вывожу в консоль числа, длинна которых меньше (больше) средней и их значения
    public void MoLessAver() {
        // Нахожу среднюю длину чисел (строк) (из массива длин чисел)
        double aver = 0.0D;

        for (int j : numberLengthArray) {
            aver += j;
        }
        aver /= numberDigits;
        System.out.println("\nAverage length of numbers: " + aver);
        System.out.println("\nNumbers whose length is less than the average: ");
        for (int j : numberArray) {
            if ((getNumberLength(j) + 1) < aver) {
                System.out.println(j + "\t" + "His length: " + (getNumberLength(j) + 1));
            }
        }
        System.out.println("\nNumbers that are longer than the average length: ");
        for (int j : numberArray) {
            if ((getNumberLength(j) + 1) > aver) {
                System.out.println(j + "\t" + "His length: " + (getNumberLength(j) + 1));
            }
        }
    }

    public void UniqueNumber() {

        int uniqueDigit = HashUniqueNumber(numberArray[0]);
        int uniqueElement = numberArray[0];

        for (int j : numberArray) {
            if (HashUniqueNumber(j) < uniqueDigit) {
                uniqueDigit = HashUniqueNumber(j);
                uniqueElement = j;
            }
        }
        System.out.println("\nThe first number in which the number of different digits is minimal: " + uniqueElement);
    }
}

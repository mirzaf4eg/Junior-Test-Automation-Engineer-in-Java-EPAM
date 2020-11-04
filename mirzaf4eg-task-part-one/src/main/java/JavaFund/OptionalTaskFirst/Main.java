package JavaFund.OptionalTaskFirst;

/**
 * Created by mirzaf4eg in sep 2020
 * Course EPAM: Junior Test Automation Engineer in Java
 * ELearn: Java. Fundamentals
 * Optional Task first
 * Ввести n чисел с консоли:
 * 1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
 * 2. Вывести числа в порядке возрастания (убывания) значений их длины.
 * 3. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
 * 4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
 * 5. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
 * 6. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
 * 7. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
 */

public class Main {
  static int[] arrayNumbers;
  static int[] arrayNumbersLengths;

  public static void main(String[] args) {
    System.out.println("\n_________Ввести n чисел с консоли.");
    OptionalTaskFirst optionalTaskFirst = new OptionalTaskFirst();
    System.out.println("Enter `n` (array length): ");
    arrayNumbers = optionalTaskFirst.getArrayNumbers(optionalTaskFirst.getNumberOfDigits());
    arrayNumbersLengths = optionalTaskFirst.getArrayNumbersLengths();
    optionalTaskFirst.printArray(arrayNumbers);
    optionalTaskFirst.printArray(arrayNumbersLengths);

    System.out.println("\n____1____Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.\n");
    TaskFirst taskFirst = new TaskFirst();
    taskFirst.findLongestAndShortestNumber(arrayNumbers, arrayNumbersLengths);
    System.out.println("The long number: " + taskFirst.maxNumberLength + ", its length: " + taskFirst.maxLength);
    System.out.println("The shortest number: " + taskFirst.minNumberLength + ", its length: " + taskFirst.minLength);

    System.out.println("\n____2____Вывести числа в порядке возрастания (убывания) значений их длины.\n");
    TaskSecond taskSecond = new TaskSecond();
    optionalTaskFirst.printArray(taskSecond.sortArrayByLengthOfNumbersUP(arrayNumbers));
    optionalTaskFirst.printArray(taskSecond.sortArrayByLengthOfNumbersDOWN(arrayNumbers));

    System.out.println("\n____3____Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.");
    TaskThird taskThird = new TaskThird();
    double aver = optionalTaskFirst.getAverLengthOfNumber(arrayNumbersLengths);
    System.out.println("\nAverage length of numbers: " + aver);
    System.out.println("\nNumbers whose length is less than the average: ");
    taskThird.getNumbersLengthIsLessThanAverage(arrayNumbers, aver);
    System.out.println("\nNumbers that are longer than the average length: ");
    taskThird.getNumbersLengthIsMoreThanAverage(arrayNumbers, aver);

    System.out.println("\n____4____Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.");
    TaskFourth taskFourth = new TaskFourth();
    System.out.println("\nThe first number consisting of minimal number different digits: " + taskFourth.findNumberConsistMinOfDifferentDigits(arrayNumbers));

    System.out.println("\n____5____Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.\n");
    TaskFive taskFive = new TaskFive();
    taskFive.findNumbersContainOnlyEvenDigitsAndEqualEvenOdd(arrayNumbers);
    System.out.println("The number of numbers containing only even digits: " + taskFive.even);
    System.out.println("The number of numbers containing an equal even and odd digits: " + taskFive.even_odd);

    System.out.println("\n____6____Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.\n");
    TaskSix taskSix = new TaskSix();
    taskSix.findNumberWhoseDigitsAreStrictAscendingOrder(arrayNumbers);
    System.out.println("The first number whose digits are in strict ascending order: " + taskSix.ascendingOrder);

    System.out.println("\n____7____Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.\n");
    TaskSeven taskSeven = new TaskSeven();
    taskSeven.findNumberConsistOnlyOfDifferentDigits(arrayNumbers);
    System.out.println("The first number consisting only of different digits: " + taskSeven.onlyDifferent);
  }
}

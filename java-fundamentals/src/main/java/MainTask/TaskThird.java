package MainTask;

import java.util.Random;
import java.util.Scanner;

public class TaskThird {
    int FROM = 10;
    int TO = 42;
    int randomNum;
    Integer[] arrayRandomNum;
    Random random = new Random();
    Scanner in = new Scanner(System.in);

    boolean randomNumRange(int range) {
        return range >= FROM && range <= TO;
    }

    public void randomNum() {
        System.out.println("Dear friend, enter the number of random numbers and I will show them to you (10-42): ");
        while (true) {
            randomNum = in.nextInt();
                if (randomNumRange(randomNum)) {
                    System.out.println("You are the best. Look what happened!");
                    return;
                }
            System.out.println("Not bad, but something went wrong. Try again: ");
        }
    }

    public void arrayRandomNum() {
        arrayRandomNum = new Integer[randomNum];
        for (int j = 0; j < arrayRandomNum.length; ++j) {
            arrayRandomNum[j] = random.nextInt(100);
        }
    }

    public void printArrayRandomNum() {
        System.out.println("Here are " + randomNum + " random numbers without a newline: ");
        for (Integer j : arrayRandomNum) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println("Here are " + randomNum + " random numbers with a newline: ");
        for (Integer j : arrayRandomNum) {
            System.out.println(j);
        }
    }
}
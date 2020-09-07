package MainTask;

import java.util.Scanner;

public class TaskFive {
    int FROM = 1;
    int TO = 12;
    int numberMonth;
    String[] month = new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    Scanner in = new Scanner(System.in);
    boolean isInRange(int value) {
        return value >= FROM && value <= TO;
    }

    boolean isNumber(String str) {
        return str.matches("-?\\d+");
    }

    public void numberMonth() {
        System.out.println("Dear friend, enter the number of month and I will show them to you " + "(" + FROM + "-" + TO + "): ");
        while (true) {
            String line = in.nextLine();
            if (isNumber(line)) {
                numberMonth = Integer.parseInt(line);
                if (isInRange(numberMonth)) {
                    System.out.println("Ohh!");
                    return;
                }
            }
            System.out.println("Not bad, but something went wrong. Try again: ");
        }
    }
    public void showMouth() {
        System.out.println("You winn! This is " + month[numberMonth-1] + "!");
    }
}

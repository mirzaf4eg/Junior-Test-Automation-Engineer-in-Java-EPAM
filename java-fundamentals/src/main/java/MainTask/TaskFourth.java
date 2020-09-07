package MainTask;

import java.util.Scanner;

public class TaskFourth {
    int sum = 0;
    int multiplication = 1;
    int numberDigit;
    Scanner in = new Scanner(System.in);

    public void numberDigit() {
        for (int j = 1; j < 3; j++) {
            System.out.println("Dear friend, enter " + j + " integers: ");
            numberDigit = in.nextInt();
            sum = sum + numberDigit;
            multiplication *= numberDigit;
        }
        System.out.println("The sum of the entered numbers: " + sum);
        System.out.println("The multiplication of entered numbers: " + multiplication);
    }
}


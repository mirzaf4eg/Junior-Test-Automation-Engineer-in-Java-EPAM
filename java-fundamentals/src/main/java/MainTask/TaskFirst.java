package MainTask;

import java.util.Scanner;

public class TaskFirst {
    public String user;
    Scanner in = new Scanner(System.in);

    public TaskFirst() {
        System.out.println("Hello, my name is mirzaf4eg! And You? ");
        this.user = in.nextLine();
    }
}

package MainTask;

import java.util.Scanner;

public class TaskSecond {
    String[] argsCommandLine;
    Scanner in = new Scanner(System.in);

    public void argsCommandLine() {
        argsCommandLine = new String[3];
        for (int j = 0; j < 3; j++) {
            System.out.println("Dear friend, enter " + (j + 1) + " argument: ");
            argsCommandLine[j] = in.nextLine();
        }
    }
    public void printArgsCommandLineRevers(){
        for (int j = 0; j < argsCommandLine.length; j++) {
            System.out.println("Argument " + (3 - j) + " -> " + argsCommandLine[2 - j]);
        }
    }
}

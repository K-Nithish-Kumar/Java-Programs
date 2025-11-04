import java.util.Scanner;

public class GreetingProgram {
    public static void main(String args[]) {
          Scanner input = new Scanner(System.in);
          String name = input.nextLine();
          System.out.println("Good Morning " + name + " How's your day? " + name);
    }
} 
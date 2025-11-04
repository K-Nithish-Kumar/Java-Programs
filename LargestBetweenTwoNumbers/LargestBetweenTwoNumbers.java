import java.util.Scanner;

public class LargestBetweenTwoNumbers {
      public static void main(String args[]) {
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            if (a > b) {
                System.out.println(a + " is Greater than " + b);
            } else {
                System.out.println(b + " is Greater than " + a);
            }
       }
} 
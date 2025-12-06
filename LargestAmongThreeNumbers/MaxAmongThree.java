// Largest among three numbers

import java.util.Scanner;

public class MaxAmongThree {
    public static void main(String args[]) {
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a :" );
         int a = in.nextInt();
	 System.out.print("Enter b :" );
         int b = in.nextInt();
         System.out.print("Enter c :" );
         int c = in.nextInt();
         
         int max = a;
         if(b > max) {
	    max = b;
	    System.out.println("Greater is :" + max);
	 }
         if(c > max) {
            max = c;
         }
         System.out.println("Greater is :" + max);
    }
}
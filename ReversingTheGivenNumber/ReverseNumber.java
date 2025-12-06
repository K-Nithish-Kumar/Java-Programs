// Reversing the given number 

import java.util.Scanner;
 
public class ReverseNumber {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
	System.out.print("Enter a number to reverse: " );
        int n = in.nextInt();
	int ans = 0;
        while(n > 0) {
          int rem = n % 10;
          n = n / 10;
	  ans = ans * 10 + rem;
        }
        System.out.println("The reversed form of given number is: " +ans);
    }
}
          
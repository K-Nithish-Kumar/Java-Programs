//Naive approach for Dice Problem

public class DiceProblem01 {
    public static int oppositeFinding(int n) {
         int ans;
         if(n == 1) {
             ans = 6;
         } else if (n == 2) {
             ans = 5;
         } else if (n == 3) {
             ans = 4;
         } else if ( n == 4) {
             ans = 3;
         } else if ( n == 5) {
             ans = 2;
         } else {
             ans = 1;
         }
         return ans;
    }
    public static void main(String args[]) {
         int n = 1;
         System.out.println(oppositeFinding(n));
    }
}
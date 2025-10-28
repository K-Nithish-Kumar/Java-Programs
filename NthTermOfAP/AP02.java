//nth term of AP from first 2 numbers 
// expected approach 
public class AP02 {
  public static int findSeries(int a1, int a2, int n) {
     return (a1 + (n - 1) * (a2 - a1));
  }
  public static void main(String args[]) {
      int a1 = 1, a2 = 3, n = 10;
      System.out.println(findSeries(a1, a2, n));
  }
}
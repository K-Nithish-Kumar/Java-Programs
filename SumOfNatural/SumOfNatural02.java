class SumOfNatural02  {
   public static int sum(int n) {
      n *= n+1/2;
      return n;
   }
   public static void main(String args[]) {
      SumOfNatural02 sn = new SumOfNatural02();
      int n = 5;
      System.out.println("The sum of n " + n + " Natural number is " + sn.sum(n));

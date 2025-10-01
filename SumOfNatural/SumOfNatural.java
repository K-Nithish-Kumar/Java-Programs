class SumOfNatural {
  public static int sum(int n) {
     int sum = 0;
     for(int i = 1; i <= n; i++) {
        sum += i;
     }
     return sum;
  }
  public static void main(String args[]) {
     SumOfNatural sn = new SumOfNatural();
     int n = 5;
     System.out.println("The sum of " +  n  + " natural number is:" + sn.sum(n));
  }
}


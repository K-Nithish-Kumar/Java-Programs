//nth term of AP from first 2 numbers 
//naive approach 

public class AP01 {
   public static int findSeries(int a1, int a2, int n) {
        int nthTerm = a1;
        int d = a2-a1;
        for(int i = 1; i < n; i++) {
            nthTerm += d;
        }
        return nthTerm;
   }
   public static void main(String args[]) {
       int a1 = 1, a2 = 3, n = 10;
       System.out.println(findSeries(a1,a2,n));
   }
}
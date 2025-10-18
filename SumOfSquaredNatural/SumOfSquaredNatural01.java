// Sum of squared natural numbers using mathematical formula


public class SumOfSquaredNatural01 {
    static int findSum(int n) {
        int result = (n * (n + 1)*(2 * n + 1)) / 6;
        return result;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(findSum(n));
    }
}


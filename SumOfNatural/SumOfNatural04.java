//Sum of naturals using mathematical logic

public class SumOfNatural04 {
    static int findSum(int n) {
        int result = n * (n + 1) / 2;
        return result;
    }
    public static void main(String args[]) {
        int n = 5;
        System.out.println(findSum(n));
    }
}
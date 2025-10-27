//Expected Approach

public class DiceProblem02 {
    public static int oppositeFaceOfDice(int n) {
        int ans = 7 - n;
        return ans;
    }
    public static void main(String args[]) {
        int n = 6;
        System.out.println(oppositeFaceOfDice(n));
    }
}
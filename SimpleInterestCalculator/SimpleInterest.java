import java.util.Scanner;

public class SimpleInterest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float P = sc.nextFloat();
        float T = sc.nextFloat();
        float R = sc.nextFloat();
        float result = P * T * R / 100;
        System.out.println("The simple interest for the given value is: " + result);
    }
}
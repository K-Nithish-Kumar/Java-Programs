import java.util.Scanner;

public class Operator {
  public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the number a: ");
     int a = input.nextInt();
     System.out.println("Enter the number b: ");
     int b = input.nextInt();
     System.out.println("Enter the operator +, -, *, / : ");
     char operator = input.next().charAt(0);
     double result;
     
     if(operator == '+') {
        result = a + b;
     } else if(operator == '-') {
        result = a - b;
     } else if(operator == '*') {
        result = a * b;
     } else if(operator == '/') {
         result = a / b;
     } else {
        System.out.println("Entered operator is invalid");
        input.close();
        return;
     }
     
     System.out.println("a : " + a + " " + operator + " b : " + b  + " = " + result);
     input.close();
  }
}
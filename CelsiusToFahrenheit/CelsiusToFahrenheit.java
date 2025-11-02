import java.util.Scanner;

class CelsiusToFahrenheit {
    public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter Temperature in Celsius: ");
          float Celsius = sc.nextFloat();
          float Fahrenheit = (Celsius * 9/5) + 32;
          System.out.println("Temperature in Fahrenheit For given Temperature in Celsius: " + Fahrenheit);
    }
}
           
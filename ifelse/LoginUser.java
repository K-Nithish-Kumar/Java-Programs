import java.util.Scanner;

class LoginUser {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Login");
     System.out.print("Enter your name: ");
     String name = sc.nextLine();
     System.out.println();
     System.out.print("Enter your password: ");
     String password = sc.nextLine();
     if(name.isEmpty() || password.isEmpty()) {
        System.out.println("Login Failed.");
     } else {
        System.out.println("Login Successfull!");
     }
     sc.close();
  }
}
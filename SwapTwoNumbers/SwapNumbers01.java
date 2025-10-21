//[naive approach] using third variable
public class SwapNumbers01 {
    public static void main(String args[]) {
       int a = 2;
       int b = 3;
       System.out.println("Before Swapping :" + "a" + "=" + a + " b" + "=" + b);
       int temp = a;
       a = b;
       b = temp;
       System.out.println("After Swapping :" + "a" + "=" + a + " b" + "=" + b);
    }
}
              
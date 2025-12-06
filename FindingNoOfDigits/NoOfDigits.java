//how many 3 are present for the given number n = 13839


public class NoOfDigits {
	public static void main(String args[]) {
		int n = 13839;
		int count = 0;
                while(n > 0) {
                    int rem = n % 10;
		    if(rem == 9) {
			count++;
		    }
		    n = n / 10;
                }
		System.out.println(count);
         }
}
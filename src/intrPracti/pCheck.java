package intrPracti;

import java.util.Scanner;

public class pCheck {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int n = s.nextInt();
		
		int OriginalNum = n;
		
		int rev =0;
		
		while(n!=0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n/10;
		}
		
		if(OriginalNum==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}

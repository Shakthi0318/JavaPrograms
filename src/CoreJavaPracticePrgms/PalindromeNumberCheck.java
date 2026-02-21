package CoreJavaPracticePrgms;

import java.util.Scanner;

public class PalindromeNumberCheck {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = s.nextInt();
		
		int OriginalNum = num;
		int rev = 0;
		
		while(num != 0)
		{
			
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		if(OriginalNum == rev)
		System.out.println("Palindrome number:"+ rev);
		else
			System.out.println("Not Palindrome number:"+ rev );
	}

}

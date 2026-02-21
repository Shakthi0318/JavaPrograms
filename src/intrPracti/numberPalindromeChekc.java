package intrPracti;

import java.util.Scanner;

public class numberPalindromeChekc {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int num = s.nextInt();
		
		int original_num = num;
		
		int rev = 0;
		
		while(num!=0)
		{
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
		}
		System.out.println(rev);
		
		if(original_num == rev) {
			System.out.println(rev+":Palindrome");
		}else
		{
			System.out.println("Not palindrome");
		}
	}

}

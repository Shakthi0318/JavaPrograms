package CoreJavaPracticePrgms;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the palindrome word");
		
		String str = s.nextLine();
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev = rev + str.charAt(i);
		}	
			if(str.equalsIgnoreCase(rev))
			System.out.println("Palindrom:"+rev);
			else 
				System.out.println("Not Palindrom:"+rev);
		}
			
			
	}



package intrPracti;

import java.util.Scanner;

public class palindromeCheck {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String s1=s.nextLine();
		
		
		
		String rev="";
		
		String Original_str = s1;
		
		for(int i=s1.length()-1; i>=0; i--) {
			rev = rev + s1.charAt(i);
		}
		System.out.println(rev);
		
		if(Original_str.equalsIgnoreCase(rev)) 
			System.out.println(s1+":Palindrome");
		else 
			System.out.println(s1+"not a palindrome");
		}
	

}

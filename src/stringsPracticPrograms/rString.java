package stringsPracticPrograms;

import java.util.Scanner;

public class rString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str=s.nextLine();
		s.close();
		
		String rev = " ";
		
		
		for(int i=str.length()-1;i>=2; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.println("reversed string is:"+rev);

	}

}

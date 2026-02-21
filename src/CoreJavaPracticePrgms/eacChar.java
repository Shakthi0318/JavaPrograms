package CoreJavaPracticePrgms;

import java.util.Scanner;

public class eacChar {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = s.next();

		
		int count = 0;
		
		for(int i=0; i<str.length(); i++)
		{
				System.out.println(str.charAt(i));
				if(str.charAt(i)== 'a' || str.charAt(i)=='A') {
					count++;
				}
				
				
		}
		System.out.println(str+ "  "+" count is"+ " "+count);
		

	}

}

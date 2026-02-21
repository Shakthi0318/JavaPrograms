package CoreJavaPracticePrgms;

import java.util.Scanner;

public class removSpcalternativ {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = s.nextLine();
		s.close();
		
		String space= str.replace(" ","");
		System.out.println(space);
				
				
	}

}

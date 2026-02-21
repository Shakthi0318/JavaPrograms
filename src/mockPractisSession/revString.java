package mockPractisSession;

import java.util.Scanner;

public class revString {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = s.nextLine();
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev +str.charAt(i);
		}
		System.out.println("Reverse String is:"+rev);
	}

}

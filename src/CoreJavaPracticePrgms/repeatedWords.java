package CoreJavaPracticePrgms;

import java.util.Scanner;

public class repeatedWords {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Repeated String");
		
		String str = s.nextLine();
		
	
		
		for(int i=0; i<str.length();i++) {
			
			char ch = str.charAt(i);
			
			
			int count = 0;
			for(int j=0; j<i;j++) {
				if(str.charAt(j)==ch) {
					count++;
				}
			}
			
			if(count >1) {
				System.out.print(count);
			}
		}
		

	}

}

package stringsPracticPrograms;

import java.util.Scanner;

public class repeatedCharacter {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = s.nextLine();
		s.close();
		
		int [] f = new int [256];
		
		for(int i=0; i<str.length(); i++) {
			f[str.charAt(i)]++;
		}
		
		for(int i=0;i<256; i++) {
			if(f[i]>1) {
				System.out.print((char)i);
			
			}
			
		}
	
	}

}

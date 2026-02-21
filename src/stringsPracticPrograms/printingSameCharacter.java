package stringsPracticPrograms;

import java.util.Scanner;

public class printingSameCharacter {

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String s1 = s.nextLine();
		
		int [] f = new int [256];
		
		for(int i=0; i<s1.length(); i++) {
			f[s1.charAt(i)]++;
		}
		
		for(int j=0; j<256; j++) {
			if(f[j]==1) {
				System.out.println((char)j);
			}
		}
	}

}

package stringsPracticPrograms;

import java.util.Scanner;

public class countCharacterPrgrm {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String");
		
		String str = s.nextLine();
		
		int [] fre = new int [256];
		
		for(int i=0; i<str.length(); i++) {
			fre[str.charAt(i)]++;
		}
		
			for(int j=0; j<256; j++) 
			{
				if(fre[j]==1) {
					System.out.println((char)j);
				}
			}
			
		}

	}



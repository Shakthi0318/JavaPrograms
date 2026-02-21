package mockPractisSession;

import java.util.Scanner;

public class vandC {

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		System.out.println("Enter the string");
		String s = str.nextLine();
		
		s=s.toLowerCase();
		int v =0, c=0;
	
		
		for(int ch:s.toCharArray()) {
			if(ch>='a'&& ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}else {
					c++;
				}
			}
		}
		System.out.println("Vowels are:"+v);
		System.out.println("Consonants are:"+c);
	}

}

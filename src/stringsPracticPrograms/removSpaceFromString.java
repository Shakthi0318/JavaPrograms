package stringsPracticPrograms;

import java.util.Scanner;

public class removSpaceFromString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = s.nextLine();
		s.close();
		
		String space=" ";
		
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				space = space + str.charAt(i);
			}
		}
		System.out.println(space);
	}

}

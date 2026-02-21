package CoreJavaPracticePrgms;

import java.util.Scanner;

public class anagramWithoutUsingSortingAndASCII {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String str1 = s.nextLine();
		
		System.out.println("Enter the second string");
		String str2 = s.nextLine();
		
		s.close();
		
		str1 = str1.replace(" ", "").toLowerCase();
		str2= str2.replace(" ", "").toLowerCase();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Not anagram");
		}
		
		boolean isAnagram = true;
		
		for(int i=0; i<str1.length();i++) {
			char ch = str1.charAt(i);
			
			int count1=0, count2=0;
			
			for(int j=0; j<str2.length();j++) {
				if(str1.charAt(i)==ch)count1++;
				if(str2.charAt(j)==ch)count2++;
			}
			
			if(count1!=count2) {
				isAnagram = false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("Anagram");
			
		}
		else
			System.out.println("Not Anagram");
	}

}

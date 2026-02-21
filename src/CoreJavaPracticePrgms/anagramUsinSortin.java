package CoreJavaPracticePrgms;

import java.util.Arrays;
import java.util.Scanner;

public class anagramUsinSortin {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the first string");
		String str = s.nextLine();
		
		System.out.println("Enter the second string");
		String str2 =s.nextLine();
		
		s.close();
		
		str = str.replace(" ","").toLowerCase();
		str2= str2.replace(" ", "").toLowerCase();
		
		if(str.length()!=str2.length()) {
			System.out.println("Not Anagram");
		}
		
		//char array
		char [] arr1 = str.toCharArray();
		char [] arr2 = str2.toCharArray();
	
		//sorting
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}

	}

}

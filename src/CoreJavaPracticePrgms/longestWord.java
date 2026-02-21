package CoreJavaPracticePrgms;

import java.util.Scanner;

public class longestWord {

	public static void main(String[] args) {
			
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		String str = s.nextLine();
		
	   String [] words =str.split(" ");
	   
	   String longestWord = words[0];
	   
	   for(int i=0; i<words.length; i++)
	   {
		   if(words[i].length()>longestWord.length()) {
			   longestWord = words[i];
		   }
	   }
	   System.out.println(longestWord);
	}

}

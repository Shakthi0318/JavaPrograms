package CoreJavaPracticePrgms;

import java.util.Scanner;

public class vc {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String s1 = s.next().toLowerCase();
		
		int v = 0, c=0;
		
		for(char ch:s1.toCharArray())
		{
			if( ch >= 'a' && ch <='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}else
					c++;
			}
		}
		
		System.out.println(v+" "+ s1.charAt(v));
		System.out.println(c+" "+ s1.charAt(c));
		
	}

}

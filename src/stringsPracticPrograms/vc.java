package stringsPracticPrograms;

import java.util.Scanner;

public class vc {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string");
		
		String s1 = s.nextLine();
		
		s1=s1.toLowerCase();
	
		int v =0; int c=0;
		
		for(char ch:s1.toCharArray())
		{
			if(ch >= 'a'& ch<='z') {
				if(ch== 'a'||ch =='e'||ch=='i'||ch=='u') {
					v++;
				}else
				{
					c++;
				}
			}
		}
		System.out.println(v);
		System.out.println(c);
	}

}

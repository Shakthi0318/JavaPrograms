package CoreJavaPracticePrgms;

import java.util.Scanner;

public class nonRepeated {

	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		String str = s.nextLine();
		
		s.close();
		
		int [] r = new int [256];
		
		for(int i=0; i<str.length();i++)
		{
			r[str.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
			if(r[i]==1)
			{
				System.out.print((char)i);
			}
		}

	}

}

package CoreJavaPracticePrgms;

import java.util.Scanner;

public class Deepa {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int a =  s.nextInt();
		
		if(a <= 25)
			System.out.println(a+" "+"-Deepa likes this number");
		else
			System.out.println(a+" "+ "-Deepa hates this number");
		
		

	}

}

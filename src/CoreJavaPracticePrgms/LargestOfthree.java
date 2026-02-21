package CoreJavaPracticePrgms;

import java.util.Scanner;

public class LargestOfthree {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number");
		int a = s.nextInt();
		
		System.out.println("Enter the second number");
		int b = s.nextInt();
		
		System.out.println("Enter the third number");
		int c = s.nextInt();
		
		if(a>b && a>c)
			System.out.println(a+ " "+ "largest number");
		else if( b > c)
			System.out.println(b+ " "+"largest number");
		else
			System.out.println(c+ " "+ "largest number");
	}

}

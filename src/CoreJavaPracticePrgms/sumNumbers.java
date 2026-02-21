package CoreJavaPracticePrgms;

import java.util.Scanner;

public class sumNumbers {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int sum = s.nextInt();
		
		
		for(int i=1; i<=100; i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}

}

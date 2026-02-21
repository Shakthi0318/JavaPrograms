package CoreJavaPracticePrgms;

import java.util.Scanner;

public class factCheck {

	public static void main(String[] args) {

	//	int n = 5, fact = 1;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the fact number");
		
		int n = s.nextInt();
		
		int fact = 1;
	
		for(int i=1; i<=n; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("factorial is"+fact);

	}

}

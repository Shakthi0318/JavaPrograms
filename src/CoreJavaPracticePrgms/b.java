package CoreJavaPracticePrgms;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int a = s.nextInt();
		
		System.out.println("Enter the second number");
		
		int b = s.nextInt();
		
		if(a>b)
			System.out.println(a+ " Is biggest number");
		else
			System.out.println(b+ " Is biggest bumber");

	}

}

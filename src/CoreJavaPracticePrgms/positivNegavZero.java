package CoreJavaPracticePrgms;

import java.util.Scanner;

public class positivNegavZero {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		if(num > 0)
			System.out.println("postive");
		else if(num < 0)
			System.out.println("negative");
		else
			System.out.println("zero");

	}

}

package numberSeries;

import java.util.Scanner;

public class evnNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		s.close();
		
		if(num % 2 ==0) {
			System.out.println("Even number");
		}else {
			System.out.println("not even number");
		}

	}

}

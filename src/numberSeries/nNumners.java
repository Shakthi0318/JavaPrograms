package numberSeries;

import java.util.Scanner;

public class nNumners {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = s.nextInt();
		
		s.close();

		for(int i=1; i<=n; i++) {
			System.out.print(" "+i);
			
		}

	}

}

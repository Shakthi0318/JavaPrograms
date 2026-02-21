package numberSeries;

import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the Fact number");
		
		int n= s.nextInt();
		
		BigInteger fact= BigInteger.ONE;
		
		for(int i=1; i<=n; i++) {
			//fact = fact * i;
			
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}

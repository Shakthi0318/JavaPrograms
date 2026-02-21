package CoreJavaPracticePrgms;

import java.util.Scanner;

public class binaryConvertion {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the decimal number");
		int num = s.nextInt();
		
		int[] b = new int[40];
		
		int index = 0;
		
		
		
		while(num > 0) {
			b[index] = num % 2;
			num = num/2;
			index++;
		}
		
		System.out.print("Binary num: " );
		
		for(int i=index-1; i>=0; i--) {
			System.out.println(b[i]);
		}
	}

}

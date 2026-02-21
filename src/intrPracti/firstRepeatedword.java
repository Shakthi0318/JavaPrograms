package intrPracti;

import java.util.Scanner;

public class firstRepeatedword {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String str = s.nextLine();
		
		int [] f = new int[256];
		
		for(int i=0; i<str.length();i++) {
			f[str.charAt(i)]++;
		}
			for(int j=0; j<256;j++) {
				if(f[str.charAt(j)]>1) {
					System.out.println(str.charAt(j));
					return;
				}
			}
		}

	}


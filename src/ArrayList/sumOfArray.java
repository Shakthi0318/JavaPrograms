package ArrayList;

public class sumOfArray {

	public static void main(String[] args) {

		int a [] = new int [] {2, 3, 5, 6, 7};
		
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sum);
	}

}

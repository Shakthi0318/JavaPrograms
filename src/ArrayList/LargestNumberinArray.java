package ArrayList;

public class LargestNumberinArray {

	public static void main(String[] args) {

		int [] a = {10, 80, 30, 90, 49};
		
		int LargestNumber = a[0];
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>LargestNumber) {
				LargestNumber=a[i];
			}
		}
		System.out.println("LargestNumber is:"+LargestNumber);
	}

}

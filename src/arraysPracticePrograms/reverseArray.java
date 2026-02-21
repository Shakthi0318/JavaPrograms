package arraysPracticePrograms;

public class reverseArray {

	public static void main(String[] args) {
		
		int a [] = {5, 4, 3, 2, 1};
		
		int start = 0;
		int end = a.length-1;
		
		while(start < end) {
			int temp = a[start];
			a[start]= a[end];
			a[end]= temp;
			
			start++;
			end--;
		}
		
		for(int reverseArr: a) {
			System.out.print(reverseArr);
		}
		
		
		
	}
		
		
}

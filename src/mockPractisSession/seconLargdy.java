package mockPractisSession;

public class seconLargdy {

	public static void main(String[] args) {
		
		int a [] = {10, 5,15,  20, 8};
		
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]>largest) {
			secLargest = largest;
			largest=a[i];
			}
			else if(a[i]>secLargest && a[i]!=largest) {
				secLargest = a[i];
			}
		
		}
		System.out.println("SecondLargest Element:"+secLargest);

	}

}

package arraysPracticePrograms;

public class largestElementIntheArray {

	public static void main(String[] args) {

		int [] arr = {4,7,1,9,2};
		
		int n = arr[0];
		
		int min = arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>n) {
				n=arr[i];
			}
		}
System.out.println(n);

for(int i=0; i<arr.length;i++) {
	if(arr[i]<min) {
		min = arr[i];
	}
}

System.out.println("smallest values is :"+min);
	}

}

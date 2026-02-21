package intrPracti;

public class duplicateArray {

	public static void main(String[] args) {

		int [] arr = new int [] {2, 4,2, 6, 4, 8, 6, 9};
		
	
		
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
		
					for(int j=i+1; j<arr.length;j++) {
						if(arr[j] == arr[i]) {
							System.out.println(arr[j]);
							
							
						}
			
					}
					
					
		}
		
	}
}

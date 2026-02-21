package ArrayList;

public class evenAndOddCount {

	public static void main(String[] args) {
		
		int[] a = {10, 20, 7, 9, 8};
		
		int even=0;
		int odd=0;
		
		for(int num:a) {
			if(num%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);
	}

}

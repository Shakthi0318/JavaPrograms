package intrPracti;

public class duplicatewithuniqueArray {

	public static void main(String[] args) {
		
		int [] a = new int [] {2, 4, 2, 6, 8, 4, 6, 9};
		
		
		
		for(int i=0; i<a.length; i++) {
			
			boolean isDuplicate = false;
			
			for(int j=0; j<i;j++)
			{
				if(a[i]==a[j]) {
					isDuplicate = true;
					
					break;
					
				}
			}
			
			if(!isDuplicate) {
				System.out.print(a[i]+" ");
			}
		}

	}

}

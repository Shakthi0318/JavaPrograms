package arraysPracticePrograms;

public class d1Array {

	public static void main(String[] args) {

		int [] a = new int [] {3, 4, 5, 1, 1, 3, 5, 6, 6};
		
		for(int i=0; i<a.length; i++) {
			boolean isDuplicate= false;
			
			for(int j=0; j<i; j++) {
				if(a[j]==a[i]) {
					isDuplicate= true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print(a[i]+" ");
			}
			
			
		}
		

	}

}

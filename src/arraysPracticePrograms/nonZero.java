package arraysPracticePrograms;

public class nonZero {

	public static void main(String[] args) {
			
		int [] a = new int [] {10, 0, 20, 30, 50, 0,1, 0, 9, 0};
		
		int count =0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]!=0) {
				a[count]=a[i];
				count++;
			}
		}
		
		while(count < a.length) {
			a[count]=0;
			count++;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+ " ");
		}
	}

}

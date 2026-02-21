package arraysPracticePrograms;

public class dArray {

	public static void main(String[] args) {

		int [] a = new int [] {2, 4, 2, 6, 4, 8, 9, 9};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[j]==a[i]) {
					System.out.println(a[j]);
				}
			}
		}

	}

}

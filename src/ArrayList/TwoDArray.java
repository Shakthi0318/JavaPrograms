package ArrayList;

public class TwoDArray {

	public static void main(String[] args) {
		
		int [] [] a = new int [] [] {{1, 2, 3}, {5, 6, 7}, {10, 9, 8}};
		
		int max = a[0][0];
		
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[i].length; j++) {
				if(a[i][j]>max)
				{
					max=a[i][j];
				}
			}
		}
		
		System.out.println(max);
		
	}

}

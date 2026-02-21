package collectionsPac;

public class sortingBubble {

	public static void main(String[] args) {
		
		int [] a = new int [] {9, 4, 2, 5, 3, 1, 0};
		
		for(int i=0; i<a.length-1;i++) {
			for(int j=0; j<a.length-1;j++) {
				
				if(a[j]>a[j+1]) {
			
				int temp = a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
		}
		}
		for(int num: a)
		{
			System.out.print(num);
		}
	}

}

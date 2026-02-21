package collectionsPac;

public class sortingWithoutUsinginbuiltfunc {

	public static void main(String[] args) {
	
		
		int [] a = new int [] {2,3,6,9,1,4};
		
		for(int i=0; i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int x:a) {
			System.out.print(x+" ");
		}
	}

}

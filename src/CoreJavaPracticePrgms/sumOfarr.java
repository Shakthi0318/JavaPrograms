package CoreJavaPracticePrgms;

public class sumOfarr {
	
	

	public static void main(String[] args) {

	//	int arr[] = {1, 4, 5, 6};
	//	int [] arr = new int[4];
	//	arr[0]=1;arr[1]=10;arr[2]=20;
		int [] arr = new int[] {1, 10, 20, 30};
		sumOfarr a = new sumOfarr();
		a.sum(arr);

	}
	
	public void sum(int [] arr)
	{
		int sum =0;
		for(int i=0; i<arr.length;i++)
		sum = sum+arr[i];
		
		System.out.println("Sum of array"+ " "+sum);
		
	}

}

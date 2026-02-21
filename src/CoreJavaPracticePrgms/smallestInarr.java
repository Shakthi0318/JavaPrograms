package CoreJavaPracticePrgms;

public class smallestInarr {

	public static void main(String[] args) {

		int arr[] = {10, 3, 6, 2, 15};
		
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
			
		}
		System.out.println("smallest number is:"+ min);
	}

}

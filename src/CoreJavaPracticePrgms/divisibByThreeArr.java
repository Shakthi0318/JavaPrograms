package CoreJavaPracticePrgms;

public class divisibByThreeArr {

	public static void main(String[] args) {

		int [] arr = new int[] {3, 4, 9, 10, 12, 14};
		
		int count = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] % 3 == 0)
			{
				count++;
				System.out.println(arr[i]+"  "+"divisible by 3");
				
			}
			
			
		}
		System.out.println(count+":are divisible");
	}

}

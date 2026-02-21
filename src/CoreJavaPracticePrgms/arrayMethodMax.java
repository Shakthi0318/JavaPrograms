package CoreJavaPracticePrgms;

public class arrayMethodMax {

	public static void main(String[] args) {
		
		int [] mark = {110, 120, 100, 140};
		
		int max = mark[0];
		
		for(int i=0; i<mark.length; i++)
		{
			if(mark[i] > max) {
				max = mark[i];
			}
		}
		System.out.println(max);
	
	}
	
	

}

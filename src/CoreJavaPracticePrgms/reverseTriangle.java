package CoreJavaPracticePrgms;

public class reverseTriangle {

	public static void main(String[] args) {
		
		String s = "*";
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i;j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}

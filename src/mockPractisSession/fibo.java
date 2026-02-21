package mockPractisSession;

public class fibo {

	public static void main(String[] args) {

			int sum=0;
			int n1=0, n2=1;
			
			for(int i=2; i<=10; i++) {
				sum = n1+n2;
				n1=n2;
				n2=sum;
				
				System.out.print(" "+sum);
				
			}

	}

}

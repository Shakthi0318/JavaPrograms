package intrPracti;

public class PalindromeNumberCheck {

	public static void main(String[] args) {

		int num = 1221;
		
		int Original_num = num;
		
		int rev=0;
		
		while(num!=0)
		{
			int digit = num%10;
			rev = rev * 10 + digit;
			num = num/10;
		}
		System.out.println(rev);
		
		if(Original_num == rev) {
			System.out.println("palindromeNumber:"+rev);
		}else {
			System.out.println("Not palindromeNumber");
		}
	}

}

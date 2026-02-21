package tCS;

public class palindromeString {

	public static void main(String[] args) {
			
			String s = "MADAM";
			
			String rev = "";
			
			String s1 = s;
			
			for(int i=s.length()-1; i>=0; i--) {
				rev = rev + s.charAt(i);
			}
			
			if(rev.equals(s1)) {
				System.out.println("This is palindrome:" +rev);
			}else
			{
				System.out.println("not palindrome");
			}
	}

}

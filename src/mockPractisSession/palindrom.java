package mockPractisSession;

public class palindrom {

	public static void main(String[] args) {

		String s = "madam";
		String rev = "";
		String OriginalString = s;
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(OriginalString.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}

}

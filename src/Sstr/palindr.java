package Sstr;

public class palindr {

	public static void main(String[] args) {

		String s = "Madame";
		
		String rev = "";
		
		String Original_S = s;
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		
		System.out.println(rev);
		
		if(Original_S.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}

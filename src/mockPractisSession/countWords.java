package mockPractisSession;

public class countWords {

	public static void main(String[] args) {

		String s = "My name is Billa";
		
		String [] words = s.split(" ");
		String longest = words[0];
		int count = words.length;
	
	
		System.out.println(count);
	}

}

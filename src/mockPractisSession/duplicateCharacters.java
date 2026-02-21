package mockPractisSession;

public class duplicateCharacters {

	public static void main(String[] args) {

		String s = "Programming";
		
		char [] a = s.toCharArray();
		
		String result = "";
		
		for(int i=0; i<a.length; i++) {
			boolean found = false;
			
			for(int j=0; j<result.length(); j++) {
				if(a[i]==result.charAt(j)) {
					found = true;
					break;
				}
			}
			
			if(!found) {
				result = result+a[i];
			}
		}
		
		System.out.print(result);
		
	}

}

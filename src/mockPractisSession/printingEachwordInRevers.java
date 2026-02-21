package mockPractisSession;

public class printingEachwordInRevers {

	public static void main(String[] args) {
		
		String s = "My name is shakthi";
		
		String [] word = s.split(" ");
		
		String rev1 = "";
		
		for(String words:word) {
			String rev2 = " ";
			
			for(int i=words.length()-1; i>=0; i--) {
				rev2=rev2+words.charAt(i);
			}
			rev1= rev1+rev2+"";
		
		}

System.out.println(rev1);
	}

}

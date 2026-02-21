package stringsPracticPrograms;

public class eachWordReverse {

	public static void main(String[] args) {

		String s = "My name is Rishav";
		
		String[] word = s.split(" ");
		String revWr = "";
		
		for(String words:word) {
			String newRev=" ";
			
			for(int i=words.length()-1;i>=0; i--) {
				newRev = newRev+words.charAt(i);
			}
			
			revWr = revWr +newRev+" ";
		}
		System.out.println(revWr);
		

	}

}

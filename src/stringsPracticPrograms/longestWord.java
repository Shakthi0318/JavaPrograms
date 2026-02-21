package stringsPracticPrograms;

public class longestWord {
	
	public static void main(String[] args) {
		
		String word = "My name is ShakthiG";
		
		String [] words = word.split(" ");
		String longest = words[0];
		
		for(int i=0; i<words.length;i++) {
			if(words[i].length()>longest.length())
			{
				longest = words[i];
			}
			
		}
		System.out.println(longest);
	}
	

}

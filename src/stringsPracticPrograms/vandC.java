package stringsPracticPrograms;

public class vandC {

	public static void main(String[] args) {
			
		String s = "Shakthi";
		int v=0,c=0;
		
		s= s.toLowerCase();
		
		for(char ch:s.toCharArray()) {
		
	
			if(ch>='a'&& ch<='z') {
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
					v++;
				}else {
					c++;
				}
			}
		}
		System.out.println(v);
		System.out.println(c);

	}

}

package collectionsPac;

public class reveStringWithoutRemovingSpaces {

	public static void main(String[] args) {

		String s = "My name is shakthi";
		char [] result = new char[s.length()];
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ')
			{
				result[i]=' ';
			}
		} 
		
		int j = s.length()-1;
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				while(result[j]==' ') {
					j--;
				}
				
				result[j] =s.charAt(i);
				j--;
			}
		}
		System.out.println(new String(result));
	}

}

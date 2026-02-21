package tCS;

public class nonRepeatedCharacter {

	public static void main(String[] args) {

		String s = "Aaabbbbcccdddeeexyz";
		
		int [] f = new int [256];
		
		for(int i=0; i<s.length(); i++) {
			f[s.charAt(i)]++;
		}
		
		for(int i=0; i<256; i++) {
			if(f[i]==1) {
				System.out.print((char)i);
			}
		}

	}

}

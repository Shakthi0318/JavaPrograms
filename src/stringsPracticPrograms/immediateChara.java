package stringsPracticPrograms;

public class immediateChara {

	public static void main(String[] args) {

		String s = "Shakthi G";
		
		int [] f = new int [256];
		
		for(int i=0; i<s.length(); i++) {
			f[s.charAt(i)]++;	
			}
		
		for(int j=0; j<256; j++) {
			if(f[j]>1) {
				System.out.println((char)j);
			}
		}
	}

}

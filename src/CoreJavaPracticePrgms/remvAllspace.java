package CoreJavaPracticePrgms;

public class remvAllspace {

	public static void main(String[] args) {

		String s = "My name is Shakthi";
		
		String spc = " ";
		
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)!= ' ') {
				spc = spc + s.charAt(i);
			}
		}
		System.out.println(spc);
	}

}

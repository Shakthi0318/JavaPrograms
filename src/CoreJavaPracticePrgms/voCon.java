package CoreJavaPracticePrgms;

public class voCon {

	public static void main(String[] args) {

		String s = "Rishav";
		int v = 0;
		int c=0;
		
		s = s.toLowerCase();
		
		for(char ch :s.toCharArray())
		{
			if(ch >= 'a' && ch<= 'z') {
				if(ch == 'a'|| ch== 'e' || ch=='i'||ch=='o'|| ch=='u') {
					v++;
				}else {
					c++;
				}
			}
		}

		System.out.println(v+ " "+c);
	}

}

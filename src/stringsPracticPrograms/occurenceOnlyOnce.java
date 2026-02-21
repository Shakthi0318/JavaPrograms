package stringsPracticPrograms;

public class occurenceOnlyOnce {

	public static void main(String[] args) {
			
		String s = "SWISS";
		
		for(int i=0; i<s.length();i++) {
		char ch= s.charAt(i);
			int count =0;
			
			for(int j=0; j<i; j++) {
				if(s.charAt(j)>ch) {
					count++;
				}
				
			}
			if(count ==1) {
				System.out.println(count);
			}
			
			
		}

	}

}

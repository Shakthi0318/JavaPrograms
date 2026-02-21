package stringsPracticPrograms;

public class removeDuplicatePrintWholeWord {

	public static void main(String[] args) {

			String s = "AArrnndndnshakthi";
			char [] s1 =s.toCharArray();
			
			String result = "";
			
			for(int i=0; i<s1.length; i++) {
				boolean found = false;
				
				for(int j=0; j<result.length(); j++)
				{
					if(s1[i]==result.charAt(j)) {
						found = true;
						break;
				}
				}	
					if(!found) {
						result=result+s1[i];
					}
			}
			System.out.println(result);
	}
			
	}



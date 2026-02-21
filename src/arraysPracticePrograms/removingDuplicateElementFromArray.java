package arraysPracticePrograms;

public class removingDuplicateElementFromArray {

	public static void main(String[] args) {
		
		int a [] = {1, 2, 1, 3, 3, 4, 1, 2, 6};
		
		for(int i=0; i<a.length;i++) {
			Boolean isDuplicate = false;
			
			for(int j=0; j<i;j++) {
				if(a[i]==a[j])
				{
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				System.out.print("Duplicate elments are:"+a[i]);
			}
		}
		
		
	}

}

package collectionsPac;

import java.util.ArrayList;

public class RemoveRepeatingNum {

	public static void main(String[] args) {
			
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Login");
		a.add("Search");
		a.add("Login");
		a.add("Login");
		a.add("SignUp");
		a.add("SignOut");
		a.add("SignUp");
		
		System.out.println("Original List:"+a);
		
		ArrayList<String> rem = new ArrayList<>();
		
		ArrayList<String> dupli = new ArrayList<>();
		
		for(String res:a) {
			if(rem.contains(res)) {
				System.out.println(res);
				break;
			}else {
				rem.add(res);
			}
		}
		
	}

}

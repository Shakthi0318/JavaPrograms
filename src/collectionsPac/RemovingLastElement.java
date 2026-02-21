package collectionsPac;

import java.util.ArrayList;

public class RemovingLastElement {

	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();
		
		a.add("Login");
		a.add("Search");
		a.add("Search");
		a.add("Logout");
		a.add("Search");
		a.add("SignUp");
		a.add("SignIn");
		a.add("Search");
		
		ArrayList<String> lastElement = new ArrayList<>();
		String LastRep = null;
		
		for(String res:a) {
			if(lastElement.contains(res)) {
				LastRep=res;
			}else {
				lastElement.add(res);
			}
		}
		if(LastRep!=null) {
			System.out.println(LastRep);
		}else {
			System.out.println("No repeating");
		}
	}

}

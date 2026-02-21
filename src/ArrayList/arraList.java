package ArrayList;

import java.util.ArrayList;

public class arraList {

	public static void main(String[] args) {

		ArrayList<String> s = new ArrayList<String>();
		
		s.add("Login");
		s.add("Search");
		s.add("SignUp");
		s.add("Login");
		s.add("LogOut");
		s.add("AddToCart");
		
		System.out.println(s);
		
		ArrayList<String> uniqueList = new ArrayList<>();
		
		for(String res: s) {
			if(!uniqueList.contains(res)) {
				uniqueList.add(res);
			}
		}
		System.out.println(uniqueList);

	}

}

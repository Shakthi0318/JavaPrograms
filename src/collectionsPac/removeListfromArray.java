package collectionsPac;

import java.util.ArrayList;

public class removeListfromArray {

	public static void main(String[] args) {

		ArrayList<String> l = new ArrayList<>();
		
		l.add("login");
		l.add("search");
		l.add("login");
		l.add("signUp");
		l.add("logout");
		l.add("signOut");
		l.add("login");
		l.add("search");
		
		System.out.println(l);
		
		ArrayList<String> uniqueList = new ArrayList<>();
		ArrayList<String> duplicateList = new ArrayList<>();
		
		for (String res : l) {
            if (!uniqueList.contains(res)) {
                uniqueList.add(res);
            } else {
                if (!duplicateList.contains(res)) {
                    duplicateList.add(res);
                }
            }
        }

        // Only once = unique - duplicate
        uniqueList.removeAll(duplicateList);

        System.out.println("Elements appearing only once:");
        System.out.println(uniqueList);
    }
}
		
	

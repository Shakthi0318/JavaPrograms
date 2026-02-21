package collectionsPac;

import java.util.ArrayList;

public class ArraylistToArray {

	public static void main(String[] args) {
		
			ArrayList<String> list = new ArrayList<>();
			
			list.add("10");
			list.add("90");
			list.add("23");
			
			String[] arr = list.toArray(new String[0]);
			
			for(String s: arr) {
				System.out.println(s);
			}

	}

}

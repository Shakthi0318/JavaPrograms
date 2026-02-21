package collectionsPac;

import java.util.ArrayList;

public class convertArrayListToArray {

	public static void main(String[] args) {
				
		ArrayList <String> arr = new ArrayList<>();
		
		arr.add("Shakthi");
		arr.add("Rishav");
		arr.add("Maya");
		
		String[] newArr = arr.toArray(new String[0]);
		
		for(String s:newArr)
		{
			System.out.print(s);
		}

	}

}

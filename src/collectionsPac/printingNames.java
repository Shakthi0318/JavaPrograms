package collectionsPac;

import java.util.ArrayList;

public class printingNames {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		
		names.add("Shakthi G");
		names.add("maya");
		names.add("Rishav");
		names.add("Deepa");
		
		System.out.println("ArrayList:"+names);
		
		if(names.contains("Shakthi G")){
			System.out.println("Shakthi G Present in the list");
		}else {
			System.out.println("Not present");
		}
		if(names.contains("Maya"))
		{
			System.out.println("Present");
		}else
		{
			System.out.println("Maya is Not present");
		}

	}

}

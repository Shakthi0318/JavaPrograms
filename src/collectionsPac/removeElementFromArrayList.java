package collectionsPac;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class removeElementFromArrayList {

	public static void main(String[] args) {


		ArrayList <String>names = new ArrayList<>();
		
		names.add("Shakthi G");
		names.add("Deepa");
		names.add("Rishav");
		names.add("Maya");
		names.add("Moshik");
		
		
		System.out.println(names);
		
		names.remove("Maya");
		names.remove(2);
		
		System.out.println("After sorting the:"+names);
		
		
		
	}

}

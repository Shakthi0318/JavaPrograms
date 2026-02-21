package collectionsPac;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListAddingthevalues {

	public static void main(String[] args) {
			
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Shakthi");
		list.add("Rishav");
		list.add("Deepa");
		list.add("moshik");
		list.add("Velu");
		
		System.out.println(list);
		
		for(String s:list) {
			System.out.println(s);
		}

	}

}

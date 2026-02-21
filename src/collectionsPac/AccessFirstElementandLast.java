package collectionsPac;

import java.util.LinkedList;

public class AccessFirstElementandLast {

	public static void main(String[] args) {
			
		LinkedList<String> s = new LinkedList<>();
		
		s.add("Shathi");
		s.add("Deepa");
		s.add("Rishav");
		s.add("Moshik");
		
		System.out.println(s.getFirst());
		System.out.println(s.getLast());

	}

}

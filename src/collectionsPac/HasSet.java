package collectionsPac;

import java.util.HashSet;

public class HasSet {

	public static void main(String[] args) {
		
		HashSet<Integer> number = new HashSet<>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(20);
		
		System.out.println(number.contains(30));
	}

}

package collectionsPac;

import java.util.LinkedList;

public class LinkedListSimpleArr {

	public static void main(String[] args) {
		
		LinkedList<Integer> num = new LinkedList<>();
		
		num.add(100);
		num.add(200);
		num.add(300);
		
		num.addFirst(50);
		
		
		num.removeLast();
		
		System.out.println(num);
		
		
	}

}

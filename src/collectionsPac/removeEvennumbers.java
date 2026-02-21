package collectionsPac;

import java.util.ArrayList;
import java.util.Iterator;

public class removeEvennumbers {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(40);
		number.add(5);
		number.add(8);
		number.add(3);
		number.add(9);
		
		System.out.println(number);
		
		Iterator<Integer> i = number.iterator();
		
		while(i.hasNext()) {
			int num = i.next();
			if(num % 2 == 0) {
				i.remove();
			}
		}
		System.out.println(number);
		

	}

}

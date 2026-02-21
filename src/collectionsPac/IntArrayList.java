package collectionsPac;

import java.util.ArrayList;

public class IntArrayList {

	public static void main(String[] args) {
			
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		
		System.out.println("number size is:"+num.size());
		
		System.out.println("Now will remove the number");
		
		num.remove(0);
		
		for(Integer s:num) {
			System.out.println(s);
		}
	}

}

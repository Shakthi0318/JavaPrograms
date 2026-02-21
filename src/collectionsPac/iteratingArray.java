package collectionsPac;

import java.util.ArrayList;

public class iteratingArray {

	public static void main(String[] args) {
		
	

		ArrayList<Integer> n = new ArrayList<>();
		
		n.add(90);
		n.add(90);
		n.add(10);
		n.add(40);
		n.add(60);
		
		System.out.println(n);
		
		for(int i=0; i<n.size(); i++) {
			
			System.out.println(n.get(i));
		}
		

	}

}

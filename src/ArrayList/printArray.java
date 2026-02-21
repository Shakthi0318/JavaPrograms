package ArrayList;

import java.util.ArrayList;

public class printArray {

	public static void main(String[] args) {

		//int [] a = new int [] {20, 40, 50, 90, 99, 100};
		
		ArrayList<Integer> l = new ArrayList<>();
		l.add(20);
		l.add(40);
		l.add(30);
		
		for(Integer num:l) {
			System.out.print(num+" ");
		}
	}

}

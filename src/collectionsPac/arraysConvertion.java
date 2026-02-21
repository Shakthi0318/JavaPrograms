package collectionsPac;

import java.util.ArrayList;
import java.util.Arrays;

public class arraysConvertion {

	public static void main(String[] args) {
		
		Integer [] a = {8,9,10,11};
		
		//String [] a = {"shakthi", "Maya", "Rishav"};
		
		ArrayList <Integer> arr = new ArrayList<>(Arrays.asList(a));
		
		System.out.println(arr);

	}

}

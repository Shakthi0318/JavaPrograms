package collectionsPac;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArraysToArrayList {

	public static void main(String[] args) {

		String[] arr = {"Apple", "Banana", "Mango"};
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		
		System.out.println(list);

	}

}

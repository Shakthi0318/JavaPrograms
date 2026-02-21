package collectionsPac;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortingUsingCollections {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(5,6,4,1,2);
		
		Collections.sort(l);
		
		System.out.print(l);

	}

}

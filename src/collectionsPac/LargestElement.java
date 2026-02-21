package collectionsPac;

import java.util.ArrayList;
import java.util.Collections;

public class LargestElement {

	public static void main(String[] args) {


			ArrayList<String> s = new ArrayList<>();
			
			s.add("12");
			s.add("10");
			s.add("29");
			s.add("14");
			
			String max = Collections.max(s);
			System.out.println(max);

	}

}

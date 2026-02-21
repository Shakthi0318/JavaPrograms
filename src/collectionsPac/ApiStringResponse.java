package collectionsPac;

import java.util.HashMap;
import java.util.Map;

public class ApiStringResponse {

	public static void main(String[] args) {

		String[] responses = {"200", "404", "200", "500", "200"};
		
		Map<String, Integer> countMap = new HashMap<>();
		
		for(String res:responses) {
			countMap.put(res, countMap.getOrDefault(res, 0)+1);
		}
		System.out.println(countMap);
	}

}

package collectionsPac;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		List<String> testData = Arrays.asList("Login", "SignUp", "Login", "Search", "SignUp");
		
		Set<String> uniqueData = new LinkedHashSet<>(testData);
		
		System.out.println(uniqueData);

	}

}

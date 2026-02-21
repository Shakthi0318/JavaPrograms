package PracticePrograms;

public class revEachWordString {

	public static void main(String[] args) {
		
		String s = "My Name is Shakthi";

        // Split sentence by space, not by characters
        String[] words = s.split(" ");

        String revSentence = "";

        for (String word : words) {
            String revWord = "";

            // Reverse each word correctly
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord = revWord + word.charAt(i);
            }

            // Add reversed word to sentence
            revSentence = revSentence + revWord + " ";
        }

        // Print trimmed final result
        System.out.println(revSentence.trim());
    }

}

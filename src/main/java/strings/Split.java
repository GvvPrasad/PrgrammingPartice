package strings;

public class Split {

	// It is used to extract a substring from a sentence
	// It accepts arguments in the form of a regular expression and returns a char
	// array.
	public static void main(String[] args) {
		String s1 = "java string split method by javatpoint";

		// splits the string based on whitespace
		String[] words = s1.split("\\s");

		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}

	}

}

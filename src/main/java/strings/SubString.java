package strings;

public class SubString {

	// A part of String is called substring

	public static void main(String[] args) {
		subString();
		split();
	}

	
	// Substring is created by using index values,
	// startIndex is inclusive and endIndex is exclusive
	public static void subString() {
		String s = "SachinTendulkar";
		System.out.println("Substring starting from index 6: " + s.substring(6));
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0, 6));
	}

	
	// It is used to extract a substring from a sentence
	// It accepts arguments in the form of a regular expression and returns a char
	// array.
	public static void split() {
		String s1 = "java string split method by javatpoint";

		// splits the string based on whitespace
		String[] words = s1.split("\\s");

		// using java foreach loop to print elements of string array
		for (String w : words) {
			System.out.println(w);
		}
	}

}

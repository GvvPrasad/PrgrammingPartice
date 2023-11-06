package strings;

public class Comparison {
	public static void main(String[] args) {
		Equals();
		EqualOperator();
	}

	// It compares the content of the string. It is case sensitive
	public static void Equals() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "sachin";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

	// It compares the reference object address
	private static void EqualOperator() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}

	// compares values lexicographically and returns an integer value that describes
	// if first string is less than, equal to or greater than second string
	// If both are equal it returns 0, 1st > 2nd returns positive values, 2nd > 1st returns negative value
	// lexicographically means dictionary order
	public static void CompareTo() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
	}
}

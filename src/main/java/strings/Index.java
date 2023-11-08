package strings;

public class Index {

	static String s1 = "this is index of example";

	// method returns the position of the first occurrence of the specified
	// character or string in a specified string.
	public static void main(String[] args) {
		passingSubString();
		subStringFromIndex();
		charValue();
		getLastIndex();
	}

	public static void passingSubString() {
		int index1 = s1.indexOf("is");
		int index2 = s1.indexOf("index");
		System.out.println(index1 + "  " + index2);
	}

	public static void subStringFromIndex() {
		int index3 = s1.indexOf("is", 4);
		System.out.println(index3);
	}

	public static void charValue() {
		int index4 = s1.indexOf('s');
		System.out.println(index4);
	}

	// returns the last index of the given character value or substring
	public static void getLastIndex() {
		int index5 = s1.lastIndexOf('s');
		System.out.println(index5);
	}
}

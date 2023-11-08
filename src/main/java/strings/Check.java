package strings;

public class Check {

	public static void main(String[] args) {
		contains();
		isEmpty();
		startWith();
		endWith();

	}

	// checks if the input string is empty or not. Note that here empty means the
	// number of characters contained in a string is zero
	public static void isEmpty() {
		String s1 = "";
		String s2 = "javatpoint";

		System.out.println(s1.isEmpty());
		System.out.println(s2.isEmpty());

	}

	public static void startWith() {
		String s1="java string split method by javatpoint";    
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));  
		System.out.println(s1.startsWith("Java string"));  //'j' and 'J' are different 

	}

	public static void endWith() {
		String s1="java by javatpoint";  
		System.out.println(s1.endsWith("t"));  
		System.out.println(s1.endsWith("point"));  

	}

	// searches the sequence of characters in this string. It returns true or false
	public static void contains() {
		String name = "what do you know about me";
		System.out.println(name.contains("do you know"));
		System.out.println(name.contains("about"));
		System.out.println(name.contains("hello"));
	}

}

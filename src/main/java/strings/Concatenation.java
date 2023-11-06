package strings;

public class Concatenation {

	public static void main(String[] args) {
		PlusOperator();
		Concat();
	}

	// “+” operator takes any type and converts it to a string
	public static void PlusOperator() {
		String c = "Sachin" + " Tendulkar";
		String s = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s);
	}

	// concat() method only accepts strings, It raises a NullPointerExeption on null
	// value
	public static void Concat() {
		String s1 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}

}

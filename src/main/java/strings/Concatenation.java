package strings;

public class Concatenation {

	public static void main(String[] args) {
		plusOperator();
		concat();
		join();
	}

	// “+” operator takes any type and converts it to a string
	public static void plusOperator() {
		String c = "Sachin" + " Tendulkar";
		String s = 50 + 30 + "Sachin" + 40 + 40;
		System.out.println(s);
	}

	// concat() method only accepts strings, It raises a NullPointerExeption on null
	// value
	public static void concat() {
		String s1 = "Sachin ";
		String s2 = "Tendulkar";
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}
	
	//method returns a string joined with a given delimiter.
	public static void join() {
		String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10");  
        System.out.println(" "+time);  
	}

}

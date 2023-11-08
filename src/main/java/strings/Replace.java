package strings;

public class Replace {
	
	//returns a string replacing all the old char or CharSequence to new char or CharSequence.
	public static void main(String[] args) {
		replace();
		replaceAll();

	}
	
	public static void replace() {
		String s1="javatpoint is a very good website";  
		String replaceString=s1.replace('a','e');  
		System.out.println(replaceString);  
	}
	
	public static void replaceAll() {
		String s1="My name is Khan. My name is Bob. My name is Sonoo.";  
		String replaceString=s1.replaceAll("is","was");//replaces all occurrences of "is" to "was"  
		System.out.println(replaceString);  
	}
}

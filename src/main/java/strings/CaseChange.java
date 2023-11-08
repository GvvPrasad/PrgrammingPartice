package strings;

public class CaseChange {

	public static void main(String[] args) {
		toLowerCase();
		toUpperCase();
	}
	
	public static void toLowerCase() {
		String s1="JAVATPOINT HELLO stRIng";  
		s1=s1.toLowerCase();  
		System.out.println(s1);  
	}
	
	public static void toUpperCase() {
		String s1="hello string";  
		s1=s1.toUpperCase();  
		System.out.println(s1);  
	}
}

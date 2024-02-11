package Practice_java;

public class reverse_practice {
public static void main(String[] args) {
	String s="aarU";
	String reverse="";
	System.out.println("String before reverse :-" +s);
	
	for (int i=s.length()-1;i>=0;i--) {
		reverse=reverse+s.charAt(i);


	}	System.out.println("String after reverse :-" +reverse);


}
}

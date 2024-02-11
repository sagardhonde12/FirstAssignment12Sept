package HomeWork;

public class Strings_practice {
public static void main(String[] args) {
	String a ="Velocity";
	String b ="VELOCITTY";
	String c = "Welcome to Home";
	
	//1) length
	System.out.println("length = "+ a.length());
	System.out.println("length = "+ b.length());
	System.out.println("length = "+ c.length());
	
	// 2) Uppercase
	System.out.println("uppercas = " +a.toUpperCase());
//3) Lowercase
	System.out.println("lowercae = "  +b.toLowerCase());
	//4) caharacter index?
	System.out.println("character index = "+ a.charAt(3));
	  //5) index?
	System.out.println("Index of = "+b.indexOf("T"));
	// 6)trim
	System.out.println("before triming c = "+c);
	System.out.println("after triming c= "+c.trim());
	
	//comaprision
	

	String S="Velocity";
	String S1="VELOCITY";
	String S2="Veloc";
	//1)  equals
	System.out.println("equals =" +S.equals(S2));
	
	//2) equals ignorecase
	System.out.println("Equalsignorecase= "+S.equalsIgnoreCase(S1));
	
	//3) contains
	System.out.println("contains = " + S.contains(S2));
	
	String A="abc";
	String B="xyz";
	
	//4) startswith
	System.out.println("Startswith = "+A.startsWith("ab"));
	System.out.println("Startswith = "+B.startsWith("xy"));
	
	// endswith
	System.out.println("ends with = " +A.endsWith("bc"));
System.out.println("ends with = "+ B.endsWith("z"));
	
	// 6) concats
System.out.println("concats = " + A +" ".concat(B));
	
String X= "Welcome To java";



	//7)replace
	System.out.println("replace = "+X.replace("java","C#"));
	System.out.println("Replace = "+ b.replace(b, "Sagar"));
	
	//8) substring
	
	System.out.println("Substrings = "+ a.substring(3));
	System.out.println(" Substring = "+ a.substring(3,5));
	//#)split
	
	String [] words  = X.split(" ");
			for (int i =0;i<words.length;i++)
			{System.out.println(words[i]);	
			
			// last index of
			System.out.println("Last index of= "+c.lastIndexOf("m"));
	
	
}
}}

package HomeWork;

public class String_methods_Hw {
public static void main(String[] args) {
	String s= "Velocity";
	String s1= " Velociity";
	String s2= "    welcometoHome ";
	// 1) calculate length
	System.out.println("the length is" +" " +s.length());
	System.out.println("the length is" +" " +s1.length());
	System.out.println("the length is" +" " +s2.length());
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	// 2) To convert the string in toUpperCase
System.out.println("The uppercase is  "+s.toUpperCase());
System.out.println("The uppercase is  "+s1.toUpperCase());
System.out.println("The uppercase is  "+s2.toUpperCase());

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

// 3) To convert the string in lowercase
System.out.println("The Lowerercase is  "+s.toLowerCase());
System.out.println("The Lowercase is "+ s1.toLowerCase());
System.out.println("The lowercase is " + s2.toLowerCase());	

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
// 4) Find the character at specific index
System.out.println("The character at 2nd index " + s.charAt(2));
System.out.println("The character at 7th index " + s1.charAt(7));
System.out.println("The character at 15th index " + s2.charAt(15));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

// 5)it will return index of specific character
System.out.println("The index of c is "+ s.indexOf("c"));
System.out.println("The index of l is " + s1.indexOf("l"));
System.out.println("The index of m is " + s2.indexOf("m"));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//6) last indexof

System.out.println("The last indexof i is = " +s.lastIndexOf("i"));
System.out.println("The last indexof l is " +s1.lastIndexOf ("l"));
System.out.println("The lastIndexOf m is " + s2.lastIndexOf("m"));

// 7) Trim
System.out.println("The string s2 before triming" + s2);
System.out.println(" The String s2 after triming"+ s2.trim());
System.out.println(" The String s2 after triming"+ s1.trim());

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

String S="Velocity";
String S1="VELOCITY";
String S2="Veloc";
 //1) equals   // case sensitive   // True/ False
System.out.println(S1.equals(S));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//2) equalsignorecase

System.out.println(S.equalsIgnoreCase(S1));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//3) contains
System.out.println(S.contains(S2));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//4) isempty

System.out.println("Checking the emptyness " +S2.isEmpty());

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

String S3 = "abc";
String S4 = "xyz";

// 1) concats
System.out.println("The concatinates strinng is "+ S3 +" ".concat (S4));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//2) Startswith
System.out.println("The starts with method is " + S4.startsWith("xy"));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
 
//3) Endswith

System.out.println("The ends with method is " + S3.endsWith("bc"));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

String S5 = "Welcome to JAVA";
// 4) Replace
System.out.println("Replace " +S5.replace("JAVA","PAYTHON"));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

//5)Substring

System.out.println("The Substring with start index only "+ S.substring(3));
System.out.println("The substring with start and end index " +S2.substring(1,4));

System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");


String[] words=S5.split(" ");

for (int i=0;i<words.length;i++) {
	System.out.println(words[i]);
}

}


}


package Practice_java;

public class string_char {
String s="aaru";
String a="Aaru";

//1]
public void m1() {
	System.out.println(s.concat(a));
}
	
//2]
public String m2() {
	return (s.toUpperCase());}
	
//3]
	public void m3 (String p) {
		System.out.println(p.toUpperCase());
	}
	
	
//4]
	public boolean m4(String b, String c) {
		return b.equalsIgnoreCase(c);
	}
	
}













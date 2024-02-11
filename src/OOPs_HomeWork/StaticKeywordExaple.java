package OOPs_HomeWork;

public class StaticKeywordExaple {
	int empid;
	String empname;
	 static char dept='b';
	
	public void display() {
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(dept);
	}

	public static void main(String[] args) {
		
		StaticKeywordExaple sk1 = new StaticKeywordExaple();    // object creation
		sk1.empid=100;
		sk1.empname="ABC";
		sk1.display();

System.out.println("***************************************************");

StaticKeywordExaple sk2 = new StaticKeywordExaple ();    // object creation
sk2.empid=102;
sk2.empname="XYZ";
sk2.display();
System.out.println("***************************************************");

StaticKeywordExaple sk3 = new StaticKeywordExaple ();    // object creation
sk3.empid=203;
sk3.empname="shaggy";
sk3.display();






}}
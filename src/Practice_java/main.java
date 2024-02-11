package Practice_java;

public class main {
public static void main(String[] args) {
	
	methods_int A = new methods_int();
	//1]
	A.m1();
	//2]
	float p=A.m2();
	System.out.println("Addition of a+b="+p);
	//3]
	A.m3(12, 20.3f);
	//4]
	float Q=A.m4(32, 20.49f);
	System.out.println("Addition of x+y="+Q);
}
}

package Practice_java;

public class cc_class extends Ncllass2 {

	
	public void m2(int a, int b) {
		System.out.println(+(a+b));
		
	}


	public void m1(int a, int b) {
		System.out.println(+(a*b));
		
	}
public static void main(String[] args) {
	cc_class o=new cc_class();
	o.m1(2, 3);
	o.m2(1, 5);
}
	
}

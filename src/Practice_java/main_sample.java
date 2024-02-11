package Practice_java;

public class main_sample implements sample_B, sampl_A {

	
	public void s1() {
		System.out.println(+(a+b));
	}

	
	public void s2() {
		System.out.println(+(a-b));
	}

	
	public void s3() {
		
		System.out.println(+(a*b));
	}

	
	public void s4() {
		System.out.println(+(a/b));
	}
public static void main(String[] args) {
	
	main_sample B=new main_sample();
	B.s1();
	B.s2();
	B.s3();
	B.s4();
	
	
	
	
	
}
}

package Practice_java;

public class mainIF extends class1 implements IF2,IF1{

	
	public void m2(int a, double b) {
		
		System.out.println("Substraction =" +(a-b));
	}

	
	public void m3(double a, double b) {
		
		System.out.println("Multiplication = " +(a*b));
	}

	
	public void m4(String a) {

System.out.println("Shaggy");
		
	}
	public static void main(String[] args) {
		mainIF  l= new mainIF();
		l.m1();
		l.m2(20, 30.50);
		l.m3(30.50, 20.5);
		l.m4("Shaggy");
	}
}

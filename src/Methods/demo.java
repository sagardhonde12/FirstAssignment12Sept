package Methods;

public class demo {
	int a=20;
	int b=40;
	
	//1]  Method will not accept parameter and will  not return any value.
	
	public void m1() {
		System.out.println(a+b);
	}
	
	//2] method will  not accept parameter but return the value
	
	public int m2() {
		return (a*b);
	}

	
	//3] method will accept parameter but not return the value.
	
	public void m3(int a, int b) {
		System.out.println(a*b);
	}
	
	//4]  Method will accept paarameters and return the value.
	
	public int m4 (int x, int y) {
		return x*y;
	}
	
}

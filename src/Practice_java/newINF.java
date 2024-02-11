package Practice_java;

public class newINF implements infB,infA {

	
	public void p1(int c, int d) {
		System.out.println(+(c+d));
		
	}

	
	
		



	public void p3(int p, double q) {
		
		System.out.println(+(p-q));
	}
public static void main(String[] args) {
	newINF Q= new newINF();
	Q.p1(20, 10);
	Q.p3(20, 10.90);
}
}

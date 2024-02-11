package Practice_java;

public class mainnew extends hiClass implements abc,def {


	public void m3() {
		System.out.println("this is method from def");
		
	}


	public void m2() {
		
		System.out.println("This is method from abc");
	}
	public static void main(String[] args) {
		mainnew V=new mainnew();
		V.m2();
		V.m3();
		V.m1();
	}

}

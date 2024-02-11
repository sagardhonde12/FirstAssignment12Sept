package Inherritance;

public class classC extends classB {

	
	
	public void s3(String p, long q) {
		
		System.out.println("epm address =" +p);
		System.out.println("emp mobile no ="+q);
	}
	public static void main(String[] args) {
		classC F= new classC (); // object creation
		F.s1("abc", 35000);
		F.s2("Tester", 01);
		F.s3("Mumbai" , 9172396905l);
		
		
	}
	
	
}

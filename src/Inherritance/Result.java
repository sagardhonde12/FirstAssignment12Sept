package Inherritance;

public class Result {
public static void main(String[] args) {
	
	T20_Worldcup T= new T20_Worldcup();
	T.m1();
	T.m2();
	T.m3();
	T.m4();
	System.out.println(" ");
	T.T20();
	
	System.out.println("*****************************************");
	
	OneDayWorldcup W = new OneDayWorldcup();
	
	W.m1();
	W.m2();
	W.m3();
	W.m4();
	System.out.println(" ");
	W.OneDayWorldcup();
	System.out.println("*****************************************");

	series A = new series();
	
	A.m1();
	W.m3();
	
	System.out.println(" ");
	A.Asiacup();
	
	
	
}
}

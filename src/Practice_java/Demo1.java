package Practice_java;

public class Demo1 {

	int a;
	String str;
	
	Demo1(){
		System.out.println("This is zero argument constructor");
			a=10;
			str="sagar";
	}
	Demo1(int c,String d){
		System.out.println("This is with argument constructor");
		a=c;
		str=d;
	}
	Demo1(String d, int c){
		System.out.println("This is with argument constructor");

		a=c;
		str=d;
		
		
		
	}
}

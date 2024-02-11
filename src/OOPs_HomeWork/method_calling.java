package OOPs_HomeWork;

public class method_calling {
static int a=10;// static variable
int b=20;   // non static variable  
 
public static void m1() {
	System.out.println("This a static method m1");
}
public void m2() {
	System.out.println("This a non static method m2");
}
public void m3() {
	System.out.println("This is method m3");

	System.out.println(a);
System.out.println(b);
m1();
m2();

}
public static void main(String[] args) {
	// 1] static method can access static method directly
	System.out.println(a);
     m1();
     
     
     //2] static methods can also access not static method with object only
     
     method_calling  ns = new method_calling();  // object creation
     System.out.println(ns.b);
     ns.m2();
     
     
     // non static method can access both non-static and static method directly
     method_calling  ns1 = new method_calling();  // object creation 
      ns1.m3();
      
      System.out.println();
      
}

}

package Inherritance;

 public class child extends parent_detail {
String Child_name="xyz";
long mb_no= 9541385829l;

  public void m2() {
	System.out.println("child name = "+ Child_name);
    System.out.println("Mobile no = "+mb_no);
}
  public static void main(String[] args) {
	child s=new child();// object creation
	
	s.m1();
	s.m2();
	
	
}

}

package Inherritance;

public class loanMain {
public static void main(String[] args) {

	// persoal loan
      
	  ploan p= new ploan();
	  p.m1();
	  p.m2();
	  p.m3();
	  p.m4();
	  p.tenuure();
	  System.out.println(" ");
	
	  // home loan
	  
	  Hloan h=new Hloan();
	  h.m1();
	  h.m2();
	  h.m3();
	  h.m4();
	  h.tenuure();
	  System.out.println(" ");

     // Two wheeler laon
	  
	  TwowheelerLoan  TL=new  TwowheelerLoan();
	  
	  TL.m1();
	  TL.m2();
	  TL.m3();
	  TL.m4();
	  TL.tenuure();
	  
	  

}
}



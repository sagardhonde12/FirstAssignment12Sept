package HomeWork;

public class practice {
public static void main(String[] args) {
	// 1 to 10 number in decending order
	
	for (int i=10;i>=1;i--) {
	System.out.println(i);
	}
	
	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

    //  table 3
	for (int i=3;i<=30;i=i+3) {
	System.out.println(i);
		
	};
	for (int i=1;i<=10;i++)
	{System.out.println(3+"*"+i+"="+(3*i));}

	System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
    // a to z alphabate
	
	for (char c='A';c<='Z';c++){
    System.out.println(c +"  ");
		
	}System.out.println("VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV");
	// draw even number between 1 to 20
	 for (int i=2;i<=20;i=i+2) {
     System.out.println(i);
	}System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");

	// draw odd  number between 30to 59
     for (int i=31;i<=59;i=i+2) {
    	 System.out.println(i);
     }
     
     
     int age=12;
     if (age>=18) 
          {System.out.println("elegible for licence");}
     else {System.out.println("not elegible");}
           System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");		
// number is positive or negative or zero
      int num=-10;
      if (num>0) {
    	  System.out.println("positive");
      }else if (num<0) {
    	  System.out.println("negative");
      }else{System.out.println("tne number is 0");}
           System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

   // grade
           int per=68;
           if (per>90) {
        	   System.out.println("grade a");
           }else if (per>=80 && per<90) {
        	   System.out.println("grade b");
           }else if (per>=60 && per<80) {
        	   System.out.println("grade c");
        	   
           }
           else  if (per>=35 && per<60) {
        	   System.out.println("grade d");
           }
           else {System.out.println("fail");}
           
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");	   
           // smaller equal and greater
           int a=35;
           int b=35;
           if (a>b) {
        	   System.out.println("greater");
           }else if(a<b) {
        	   System.out.println("smaller");
           }else {System.out.println("equal");}
           
}
}

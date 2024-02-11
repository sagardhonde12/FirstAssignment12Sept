package HomeWork;

public class If_else_conditions {
public  static void main(String[]args) {
	//1) check you can apply for driving licence?
	int age =52;
	           if (age>18)
		   {System.out.println("you can apply for driving licence");}
	           else {
		    System.out.println(" you can not apply for driving licence");
	}
	System.out.println("########################################"); 
	
	//2) Find out even number?
	
	int a=52;
	           if(a%2==0) {
	               	System.out.println("the number is even");}
		      else {
			        System.out.println("the number is odd");
		}
	{System.out.println("############################################");
}
int c=25;
int d=32;
              if(c>d) {
	                System.out.println("c is largest number");}
	          else {System.out.println("d is largest number");}
System.out.println("#######################################");

     //  4) Find out the number is positive or negative or zero?

 int x = 0;
            if(x>0) {
	System.out.println("The number is positive");}
            else if (x<0){System.out.println("The number is negative");
}
            else {System.out.println("The number is zero");}
  System.out.println("##########################################");

    // 5)Find out which language is easy or difficult?
String langauge="java";
             if (langauge=="java"||langauge== "python") {
	               System.out.println("The langauge is easy");}
             else {System.out.println("The langauge is difficult");}
             
System.out.println("############################################");

   // 6)check the WIFI is on or off?
String WIFI="green";
             if(WIFI=="red") 
             {System.out.println("The WIFI is on");}
             else {System.out.println("the WIFI is off");}

System.out.println("##################################");

   //7)what is the date of republic day?
String republic_day="24th jan";
             if (republic_day=="26th jan") 
             {System.out.println("the day is right");}
             else {System.out.println("the date is wrong");}

             System.out.println("##############################");
             
      //8) What is the result of student?
             double M=61.35;
             if (M>=35.00) {
            	 System.out.println("Pass");}
             else {System.out.println("fail")  ;}
             
             System.out.println("###################################") ;  
      //9) To check the oxygen level of person
             double oxygen=93.24;
             if(oxygen>=90.00) {System.out.println("oxygen level is ok");}
             else {System.out.println("oxygen level is not ok");
             
             }
            System.out.println("###############################");
      //10)find out the day of week?
             int D=5;
             if(D==1) {System.out.println("monday");}
             else if (D==2) {System.out.println("tuesday");}
             else if (D==3) {System.out.println("wednesday");}

             else if(D==4)  {System.out.println("thursday");}
             else if  (D==5){System.out.println("friday");}
             else if  (D==6){System.out.println("saturday");}
             else if  (d==7){System.out.println("sunday");}
             else  {System.out.println("entre valid input");}
             System.out.println("##################################");
       //11) find out the number is divisible by '4'.
             int No=29;
             if(No%3==0) {System.out.println("Yes the no is divisible by 3");}
             else {System.out.println("the no is not divisible by 3");}
     
             
             //12 convert hours and minutes in seconds
             int hour=2;
             int minute=15;
            
             if(hour>0&&minute>0) {
     			System.out.println("TOTAL NUMBER OF SECONDS ="+((hour*60*60)+(minute*60)+"."));
     		}else if(hour==0&&minute>0) {
     			System.out.println("TOTAL NUMBER OF SECONDS ="+(minute*60));
     		}else if(hour>0&&minute==0) {
     			System.out.println("TOTAL NUMBER OF SECONDS ="+(hour*60*60)+".");
     		}else {
     			System.out.println("ENTER VALUE MORE THAN ZERO");
     		}
             
             
             
             
}}






	



   



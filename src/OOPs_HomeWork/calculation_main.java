package OOPs_HomeWork;

public class calculation_main {
public static void main(String[] args) {
	//1]
			calculation cal=new calculation();
			cal.sum();
			
	//2] 
			calculation cal2=new calculation();
			System.out.println(cal2.sum2());
			
			
	//3]
			calculation cal3=new calculation();
             cal3.sum3(20, 10);
             
    //4]
 			calculation cal4=new calculation();
            System.out.println(cal4.sum4(20, 10));
            
            
            System.out.println("***************MULTIPLICATION*************");
 		//1]	
 		calculation multi=new calculation();
 		multi.mul();
           
 		// 2]
 		calculation multi2=new calculation();
System.out.println(multi2.mul2());
            
       //3]
	calculation multi3=new calculation();
       multi3.mul3(50, 10);
            
       //4]
		calculation multi4=new calculation();
      System.out.println(multi4.mul4(50,10));
      
      System.out.println("********************SUBSTRACTION*******************");
      
      //1]
      calculation subs=new calculation();
      subs.sub();
      
      //2]
      calculation subs2=new calculation();
      System.out.println(subs2.sub2());
      
      //3]
      
      calculation subs3=new calculation();
      subs3.sub3(20,10);
      
      //4]
      calculation subs4=new calculation();
      System.out.println(subs4.sub4(20, 10));
      
      System.out.println("***************DIVISION*********************");
      
      //1]
      calculation divi1=new calculation();
      divi1.div();
      
      //2]
      calculation divi2=new calculation();
      System.out.println(divi2.div2());
      
      //3]
      calculation divi3=new calculation();
      divi3.div3(20, 10);
      
      //4]
      calculation divi4=new calculation();
      System.out.println(divi4.div4(20, 10));
      
      
      
      
      
      
      
      
      
      
      
      
      
}
}

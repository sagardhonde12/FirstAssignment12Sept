package advancejava;

import java.util.ArrayList;

public class sagarshaggy {
public static void main(String[] args) {
	ArrayList as= new ArrayList();
	//1]
	as.add("sagar");
	as.add(12);
	as.add("may");
    as.add(1995);
    as.add("aaru");
    as.add('a');
    as.add('s');
    System.out.println(as);
     System.out.println("________________________________________");
    //2]
    as.add(1,19);
    System.out.println("add 19 at 1st index"+as);
    System.out.println("________________________________________");

    //3]
    as.set(0,"aaru");
    System.out.println("replace sagar with  aaru  from 0th index"+as);
    System.out.println("________________________________________");
    
    //4]
    as.remove(2);
    System.out.println("remove 12 from 2nd index"+as);
    System.out.println("________________________________________");
    
    //5]
    System.out.println("the size of arraylist="+as.size());
    System.out.println("________________________________________");
    
    //6]
    System.out.println(" the index of may="+as.indexOf("may"));
    System.out.println("________________________________________");
    
    //7]
    System.out.println("value presnt at 4th index="+as.get(4));
    System.out.println("________________________________________");
    
    //8]
    System.out.println("the arraylist contains dhonde or not ="+as.contains("dhonde"));
    System.out.println("________________________________________");


    //9]
    System.out.println("The arraylist is empty or not="+ as.isEmpty());
System.out.println("-------------------------------------------");
    //10]
    for (int i=0;i<as.size();i++) {
    	System.out.println(as.get(i));
    }
System.out.println("*******************************************");
    // advance loop
    for(Object Sa:as) {
    	System.out.println(Sa);
    }
    System.out.println(" ");
    
    //iterator
   // Iterato al1=as
    
    
}
}

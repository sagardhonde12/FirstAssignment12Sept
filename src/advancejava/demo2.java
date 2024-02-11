package advancejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class demo2 {
@SuppressWarnings("unchecked")
public static void main(String[] args) {
	// 1] array declaration
	
	ArrayList as=new ArrayList();
	
	System.out.println(" ");
	
	//2] adding values in arraylist
	
	as.add(1234);
	as.add("ABC");
	as.add('A');
	as.add(2.54);
	System.out.println(as);
	System.out.println(" ");
	
	//3] To add the value 24.5at index 3
	
	as.add(3,24.5);
	System.out.println(" To add the value 24.5 at index 3=" +as);
	System.out.println(" ");
	
	//4] To remove the value of 24.5 from index 3
	
	as.remove(3);
	System.out.println("To remove the value of 24.5 from index 3 ="+as);
	
	System.out.println(" ");
	
	//5] Replace 2index with value Shaggy.
	
	as.set(2, "Shaggy");
	System.out.println( "Replace 2nd index with value Shaggy."+as);
	System.out.println(" ");
	
	//6] The size of arraylist
	System.out.println("the size of arraylist  ="+(as.size()));
	System.out.println(" ");
	
	
	//7] The value present at 1st index
	
	System.out.println("The value present at 1st index = "+as.get(1));
	System.out.println(" ");
	
	//8] shaggy value is at 
	
	System.out.println("shaggy value is at  = " +(as.indexOf("Shaggy")+"nd index"));
	System.out.println(" ");
	
	//9] Sagar is contained or not in given arraylist
	
	System.out.println("Sagar is contained or not in given arraylit = " +(as.contains("Sagar")));
	System.out.println(" ");
	
	// 10] The given arraylist is empty?
	
	System.out.println("The given arraylist is empty? = "+ as.isEmpty());
	System.out.println(" ");
	
	//11] regular for loop
	System.out.println("Regular for loop ==>");
	System.out.println(" ");
	for (int i=0;i<as.size();i++) 
		
		{System.out.println(as.get(i));
	}
	System.out.println(" ");
	
	//12] advance for loop
	System.out.println("Advance for loop ==>");
	System.out.println(" ");
	for(Object aa:as) {
		System.out.println(aa);
	}
	System.out.println(" ");
	
	//13] Iterator
	// declaration
	// for any class any collection
	
	Iterator spd =as.iterator();
	while(spd.hasNext()) {
		System.out.println(spd.next());
	}
	System.out.println(" ");

	//14] listiterator
	// it is only for listiterator classes
	
	ListIterator spd1=as.listIterator();
	while(spd1.hasNext()){
		System.out.println(spd1.next());
	}
 
	// 15] reverse the arraylist
	
	System.out.println(as);
	System.out.println(" ");
	
	
	// 15] reverse the arraylist
     Collections.reverse(as);
	System.out.println(as);
	


	











}}

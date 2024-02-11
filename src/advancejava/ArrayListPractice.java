package advancejava;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		//1] declare arraylist
		ArrayList al =new ArrayList(); //common way
		
		ArrayList<String> al1=new ArrayList<String>();//  generic way
		
		//2] adding values in arraylist
		al.add(20);
		al.add("4b batch");
		al.add('S');
		al.add("Sagar");
		al.add('S');
		System.out.println(al);
		
		//3] add extra value in array
		al.add(2,"shubhangi");
		System.out.println(al);
		
		//4]replace the value at particular index
		al.set(3,"velocity");
		System.out.println(al);
		
		//5] remove value with index
		al.remove(2);
		System.out.println(al);
		
		//5b] remove value with value
		al.remove("velocity");
		
		System.out.println(al);
		
		//6]to check the arraylist is empty or not
		System.out.println(al1.isEmpty());
		System.out.println(al.isEmpty());
		
		
		//7]to chech the size of arraylist
		System.out.println(al.size());
		System.out.println(al1.size());
		
		//8] to check the value at particular index
		System.out.println(al.get(2));
		
		//9]to check the index of particular value.
		System.out.println(al.indexOf('S'));
		System.out.println(al.indexOf("Sagar"));
		
		//10]to check the particular value is contained by arraylist or not
		System.out.println(al.contains("anuja"));
		
		System.out.println(al.contains("4b batch"));
		System.out.println("============================");
		
		
		//11]read the values in arraylist
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));}
			
		   System.out.println("**************************");	
		
		//11 b]	advance way to read the value in arraylist
			for(Object value:al) {
				System.out.println(value);}
			
		}}
	


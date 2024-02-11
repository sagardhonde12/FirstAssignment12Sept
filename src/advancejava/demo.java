package advancejava;

import java.util.ArrayList;
import java.util.Collections;

public class demo {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<String>();
	
	al.add("bmw");
	al.add("Ferrari");
	al.add("Lamborghini");
	al.add("audi");
	al.add("Porsche");
	
	System.out.println(al);
	
// 1] sorting the arraylist in assending order
	Collections.sort(al);
	System.out.println(al);

// 2] sorting the arraylist in dessending order
	
	Collections.sort(al,Collections.reverseOrder());
	System.out.println(al);
	
	
	
}
}

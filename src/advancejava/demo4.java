package advancejava;

import java.util.ArrayList;
import java.util.HashSet;

public class demo4 {

	public static void main(String[] args) {
		ArrayList pqr = new ArrayList();
		pqr.add("a");
		pqr.add("b");
		pqr.add("c");
		
		HashSet abc = new HashSet();
		abc.add("a");
		abc.add("b");
		abc.add("c");
		abc.add("d");
		
		
	abc.addAll(pqr);
	System.out.println(abc);
		
		
	}
}

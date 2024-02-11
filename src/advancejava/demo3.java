package advancejava;

import java.util.Iterator;
import java.util.Vector;

public class demo3 {
public static void main(String[] args) {
	
	Vector sa=new Vector();
	sa.add("sagar");
	sa.add(12345);
	sa.add('S');
	sa.add("aaru");
	
	
	System.out.println(sa);
	System.out.println(" ");
	
	//1]
	sa.add(4,'a');
	System.out.println(sa);
	System.out.println(" ");
	//2]
	sa.set(3, "Aarti");
	System.out.println(sa);
	System.out.println(" ");
	
	//3]
	sa.remove(1);
	System.out.println(sa);
	System.out.println(" ");
	
	//4]
	System.out.println(sa.isEmpty());
	System.out.println(" ");
	
	//5]
	System.out.println(sa.contains(12345));
	System.out.println(" ");
	
	//6]
	System.out.println(sa.indexOf("Aarti"));
	System.out.println(" ");
	
	
	//7]
	System.out.println(sa.size());
	System.out.println(" ");
	
	//8]
	System.out.println(sa.get(3));
	System.out.println(" ");
	
	
	//10]
	for(int i=0;i<sa.size();i++) {
		System.out.println(sa.get(i));
	}
	System.out.println(" ");
	
	//11]
	for(Object asd:sa) {
		System.out.println(asd);
	}
	System.out.println(" *************************************");
	
	//12]
	Iterator asd=sa.iterator();
	while(asd.hasNext()) {
		System.out.println(asd.next());
	}
	
	
	
	
	
	
	
}

}

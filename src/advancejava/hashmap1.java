package advancejava;

import java.util.HashMap;
import java.util.Map;

public class hashmap1 {

	public static void main(String[] args) {
		
		HashMap <Integer, String> HM = new HashMap<Integer, String>();
		
		HM. put(101,"sagar");
		HM.put(102, "kartik");
		HM.put(103,"siddhu");
		HM.put(104,"pari");
		HM.put(105,"shruti");
		HM.put(106,"avni");
		
		System.out.println(HM);
		// add 1 more element OR MODIFY
		
		HM.put(102,"aaru");
	    HM.put(104,"pari");
		System.out.println(HM);
		
		
		// remove the element
		HM.remove(104,"pari");
		System.out.println(HM);
	
		// to read the value from hashmap
		for (Map.Entry m:HM.entrySet()) {
			System.out.println(m.getKey()+ "  "+ m.getValue());
	}
}}

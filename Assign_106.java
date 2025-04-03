package Assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Assign_106 {

	public static void main(String[] args) {
		Map<String,Integer> m1=new HashMap<String,Integer>();
		m1.put("Mouse", 50);
		m1.put("Monitors",60);
		m1.put("Keyboards", 60);
		System.out.println(m1.size());
		
		Set<String> S1=m1.keySet();
		System.out.println(S1);
		for(String S4:m1.keySet()) {
			System.out.println(S4);
		}
	    Collection<Integer> C=m1.values();
	    for(Integer i:m1.values()) {
	    	System.out.println(i);
	    }
	    
		Set<Entry<String,Integer>> s2=m1.entrySet();
		Iterator<Entry<String,Integer>> s3=s2.iterator();
		while(s3.hasNext()) {
			System.out.println(s3.next());
	}

	}
}

package Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Assign_97 {

	public static void main(String[] args) {
		Set<String> s=new HashSet<String>();
		s.add("abc");
		s.add("test");
		s.add("Sai");
		Set s1=new HashSet();
		s1.addAll(s);
		s1.add(2);
		s1.add(4);
		s1.add(1);
		s1.add(2);
		System.out.println("Before removing :"+s1);		
		Iterator i=s1.iterator();
		System.out.println("Printing using Iterator");
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

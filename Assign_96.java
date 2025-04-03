package Assignments;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Assign_96 {

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
		s1.add(3);
		System.out.println("Before removing :"+s1);
		s1.remove(1);
		boolean b=s1.containsAll(s);
		System.out.println("Do S1 contains S :"+b);
	
	
	}

}

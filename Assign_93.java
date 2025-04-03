package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Assign_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List c1=new ArrayList();
		c1.add(10);
		c1.add("Teja");
		c1.add(10.24);
		c1.add('A');
		System.out.println(c1);
		c1.remove(0);
		System.out.println("after removing 10 from c1 :"+c1);
		List c2=new ArrayList();
		c2.addAll(c1);
		c2.add(1);
		c2.add(3);
		c2.add(4);
		c2.add("Test");
		System.out.println(c2);
		System.out.println("c2 Size before removeall :"+c2.size());
		System.out.println("Does c2 contains c1 :"+c2.containsAll(c1));
		System.out.println("Does c2 contains Test :"+c2.contains("Test"));
		c2.removeAll(c1);
		System.out.println("c2 Size after removeall :"+c2.size()+" Elements are :"+c2);
		c2.clear();
		System.out.println("After Clearing all elements from c2 :"+c2);
		System.out.println("Is c2 Empty :"+c2.isEmpty());
		
		
		
		
		
		

	}

}

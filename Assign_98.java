package Assignments;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Assign_98 {

	public static void main(String[] args) {
		List<Character> l=new ArrayList<Character>();
		l.add('A');
		l.add('B');
		l.add('E');
		l.add('C');
		l.add('D');
		System.out.println(l);
		//l.sort(null);
		Collections.sort(l);
		System.out.println("After Sorting :"+l);
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(1);
		l1.add(4);
		l1.add(5);
		l1.add(3);
		l1.add(2);
	    System.out.println("Before Sort :"+l1);
	    l1.sort(null);
		System.out.println("After Sort :"+l1);
		
		

	}

}

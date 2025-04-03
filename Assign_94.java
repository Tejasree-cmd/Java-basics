package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Assign_94 {

	public static void main(String[] args) {
		List l1=new ArrayList();
		//ArrayList a1=new ArrayList(); // Creating Arraylist Class object
		l1.add("1");
		l1.add("2");
		l1.add("3");
		System.out.println(l1);
		l1.add(1,"Viswa");
		l1.add(4);
		l1.add(5);
		System.out.println(l1);
		Iterator i=l1.iterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}

	}

}

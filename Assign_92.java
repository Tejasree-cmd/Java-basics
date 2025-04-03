package Assignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Assign_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		//ArrayList a1=new ArrayList(); // Creating Arraylist Class object
		l1.add("1");
		l1.add("2");
		l1.add("3");
		System.out.println("Initial List :"+l1);
		l1.add(1,"Viswa");
		System.out.println("After adding Viswa at index 1 :"+l1);
		Iterator i1=l1.iterator();

			while(i1.hasNext()) {
				System.out.println(i1.next());
			}

	}

}

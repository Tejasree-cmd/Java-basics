package Assignments;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Assign_95 {
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
		ListIterator i=l1.listIterator();
		while(i.hasNext()) {
		System.out.println(i.next());
		}
		System.out.println("Backward Iteration Starts now ");
		while(i.hasPrevious()){
			System.out.println(i.previous());
		}
	}

}

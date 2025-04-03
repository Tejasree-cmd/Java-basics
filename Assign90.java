package Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Collection;

public class Assign90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection C1=new ArrayList();
		C1.add("Teja");
		C1.add("Viswa");
		C1.add("Sai");
		System.out.println(C1);
		boolean e=C1.isEmpty();
		System.out.println(e);
		int i=C1.size();
		System.out.println(i);
		C1.clear();
		boolean e1=C1.isEmpty();
		System.out.println(e1);
		Collection<Character> C2=new ArrayList<Character>();
		C2.add('L');
		C2.add('P');
		C2.add('J');
		System.out.println(C2);
		Collection C3=new ArrayList();
		C3.add(1);
		C3.add(2);
		System.out.println(C3);
	    C3.addAll(C2);
	    System.out.println(C3);
		//C3.clear();
	    //C3.remove(1);
	    boolean b1=C3.contains(19);
		System.out.println(b1);
		boolean b2 =C3.containsAll(C2);
		//C3.removeAll(C2);
		System.out.println(b2);

	}

}

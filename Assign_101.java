package Assignments;

import java.util.Enumeration;
import java.util.Vector;

public class Assign_101 {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement("Test");	
		v1.addElement("Test1");
		v1.addElement("Test2");
		v1.addElement("Test3");
		v1.addElement("Test");
		System.out.println(v1);
		Enumeration e=v1.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}

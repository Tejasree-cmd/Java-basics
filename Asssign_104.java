package Assignments;

import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Asssign_104 {

	public static void main(String[] args) {
		Map<String,Integer> m=new  HashMap();
		m.put("Test1", 100);
		m.put("Test2",200);
		m.put("Test3", 300);
		m.put("Test4", 400);
		System.out.println(m);
		Collection<Integer> i=m.values();
		System.out.println(i);
		
		

	}

}

package Assignments;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Assign_105 {

	public static void main(String[] args) {
		Map<String,Integer> m=new  HashMap();
		m.put("Test1", 100);
		m.put("Test2",200);
		m.put("Test3", 300);
		m.put("Test4", 400);
		//System.out.println(m);
		Set<Entry<String,Integer>> S3=m.entrySet();
		System.out.println(S3);
		for(Entry<String,Integer> S : m.entrySet()) {
			System.out.println(S);
		}

	}

}

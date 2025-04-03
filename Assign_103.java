package Assignments;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;


public class Assign_103 {

	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap();
		m.put("Test1",100);
		m.put("Test2",200);
		m.put("Test3", 300);
		m.put("Test4", 400);
		m.put("Test5", 500);
		System.out.println(m);
		Set<String> S2=m.keySet();
		System.out.println(S2);
		for(String S1:m.keySet()) {
			System.out.println(S1);
		}
		
		

	}

}

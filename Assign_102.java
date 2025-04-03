package Assignments;
import java.util.Map;
import java.util.HashMap;


public class Assign_102 {

	public static void main(String[] args) {
		Map m=new HashMap();
		m.put("Test1",100);
		m.put("Test2",200);
		m.put("Test3", 300);
		System.out.println(m);
		System.out.println(m.get("Test1"));
        boolean b=m.containsKey("Test3");
        System.out.println("Key Check :"+b);
        boolean b1=m.containsValue(300);
        System.out.println("Value Check :"+b1);
        m.putIfAbsent("Test4", 400);
        Map m1=new HashMap();
        m1.putAll(m);
        m1.put("Test5",500);
        boolean b2=m1.equals(m);
        System.out.println(b2);
        
		

	}

}

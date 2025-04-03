package Assignments;
import java.util.Map;
import java.util.HashMap;


public class Assign_100 {

	public static void main(String[] args) {
		Map m1=new HashMap();
		m1.put("India", "Rupees");
		m1.put("US", "Dollars");
		m1.put("UK", "Pounds");
		m1.put("Saudi", "Dinar");
		System.out.println("Initial map values :"+m1);
		Map m2=new HashMap();
		m2.putAll(m1);
		m2.put("AP", "Amaravathi");
		m2.put("Kar","Bangalore");
		m2.put("TN", "Chennai");
		m2.put("TG", "Hyd");
		System.out.println(m2);
		m2.remove("Saudi");
		m2.replace("TG","Hyde");
		m2.replace("TN","Chennai","Chennapatnam");
		System.out.println(m2);
		System.out.println(m2.get("Kar"));
		m2.clear();
		System.out.println(m2);
		

	}

}

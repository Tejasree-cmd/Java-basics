package Assignments;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;



public class Assign_99 {

	public static void main(String[] args) {
		Scanner S1=new Scanner(System.in);
		Map m1=new HashMap();
		System.out.println("Enter first Key value pair of m1");
		m1.put(S1.nextInt(),S1.next());
		System.out.println("Enter Second Key value pair of m1");
		m1.put(S1.nextInt(),S1.next());
		System.out.println("Enter Third Key value pair of m1");
		m1.put(S1.nextInt(),S1.next());
		System.out.println("Enter Fourth Key value pair of m1");
		m1.put(S1.nextInt(),S1.next());
		System.out.println("Enter Fifth Key value pair of m1");
		m1.put(S1.nextInt(),S1.next());
		System.out.println(m1);
		
		
		

	}

}

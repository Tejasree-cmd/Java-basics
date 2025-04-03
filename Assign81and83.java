package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assign81and83 {

	public static void main(String[] args) {
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter Strings ");
		String a=S1.next();
		String b=S1.next();
		if(a.length()==b.length()) {
			char [] c=a.toCharArray();
			char d[]=b.toCharArray();
			System.out.println("Sorting Arrays:");
			Arrays.sort(c);
			Arrays.sort(d);
			System.out.println("After Sorting :"+Arrays.toString(c) +"" +Arrays.toString(d));
			if(Arrays.equals(c,d)) {
				System.out.println("String are Anagram");
			}
			else {
				System.out.println("Strings are not Anagram");
			}
			
		}
		else {
			System.out.println("Strings Length itself not matching");
		}

	}

}

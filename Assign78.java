package Assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assign78 {

	public static void main(String[] args) {
		Scanner S1=new Scanner(System.in);
		System.out.println("Enter the length of arrays");
		int n=S1.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("Enter values of both arrays at index:"+i);
			a1[i]=S1.nextInt();
			a2[i]=S1.nextInt();
		}

		if(Arrays.equals(a1, a2)) {
			System.out.println("Arrays are equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}

	}

}

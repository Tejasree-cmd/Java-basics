package Assignments;

public class Assign76 {

	public static void main(String[] args) {
		int [] av= {1,2,3,4,5};

		System.out.println(av.length);
		int a=0;
		for(int i=0;i<av.length;i++) {			
			a=a+av[i];

		}
		System.out.println(a);
		float f;
		f=a/av.length;
		System.out.println("Average of av array is: "+ f);
		

	}

}

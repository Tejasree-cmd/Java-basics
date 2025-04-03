package Assignments;

public class Assign85 {

	public static void main(String[] args) {
		String S="Tejasree";
		String a=S.replace("sree", "viswa");
		System.out.println("After replace: "+a);
		String S1="Sai Yothvik 123";
		String b=S1.replaceAll("[0-9]", "ab");
		System.out.println("Replaced all of a string occurances :"+b);
		String c=b.substring(6);
		System.out.println("Substring with only Start Index :"+c);
		String d=b.substring(0,6);
		System.out.println("Substring with start and stop index :"+d);
		String S2="Viswanath";
		boolean a1=S2.matches("(.*)h");
		System.out.println("String ends with true:"+a1);
		String S3="Test";
		String S4=S3.repeat(3);
		System.out.println("Repeated String : "+S4);
		String S5="-".repeat(15);
		System.out.println("Repeated dashes String :"+S5);
		
		
		

	}

}

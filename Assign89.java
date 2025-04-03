package Assignments;

public class Assign89 {

	public static void main(String[] args) {
		StringBuffer SB=new StringBuffer();
			System.out.println("Empty String Calacity is :"+SB.capacity());
			System.out.println("Empty String Length is : "+SB.length());
			SB.append("Test1");
			System.out.println("After Append Calacity is :"+SB.capacity());
			System.out.println("After Append Length is : "+SB.length());
			StringBuffer SB1=new StringBuffer("Teja");
			System.out.println("With default String Calacity is :"+SB1.capacity());
			System.out.println("With default String Length is : "+SB1.length());
			StringBuffer SB2=new StringBuffer(5);
			System.out.println("With default Calacity is :"+SB2.capacity());
			SB2.append("test Teja");
			System.out.println("With default capacity after append Length is : "+SB2.length());
			System.out.println("String Builder");
		StringBuilder SD=new StringBuilder();
		System.out.println("Empty String Calacity is :"+SD.capacity());
		System.out.println("Empty String Length is : "+SD.length());
		SD.append("Test1");
		System.out.println("After Append Calacity is :"+SD.capacity());
		System.out.println("After Append Length is : "+SD.length());
		StringBuffer SD1=new StringBuffer("Teja");
		System.out.println("With default String Calacity is :"+SD1.capacity());
		System.out.println("With default String Length is : "+SD1.length());
		StringBuffer SD2=new StringBuffer(5);
		System.out.println("With default Calacity is :"+SD2.capacity());
		SD2.append("test Teja");
		System.out.println("With default capacity after append Length is : "+SD2.length());

		    
			
			

	}

}

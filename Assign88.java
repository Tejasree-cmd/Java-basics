package Assignments;

public class Assign88 {

	public static void main(String[] args) {
		StringBuilder S=new StringBuilder("This is to Test String Buffer By ");
		S.append("Tejasree");
		System.out.println(S);
		S.insert(16,"on ");
		System.out.println(S);
		S.delete(40,44);
		System.out.println(S);
		String a=S.substring(15);
		System.out.println(a);
		System.out.println(S.reverse());
		System.out.println("Length is: "+S.length());
		System.out.println("Capacity is "+S.capacity());
		System.out.println(S.replace(0, 10, "Test String "));

	}

}

package Assignments;

public class Assign_75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
            System.out.println("No arguments passed. Please provide some input.");
            
        }

        // Print all arguments
        System.out.println("Arguments received at runtime:");
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }

	}

}

import java.util.Scanner;

public class WorkoutTrackerApp {
	public static void main(String[] args) {
		
		int var = 0;
		System.out.println("Welcome to the Workout Tracker App \n");
		
		do {
		System.out.println("Please select how would you like to continue.");
	    System.out.println("1:Open Tracker \n2:Add a new workout\n3:To Exit\n");
	    Scanner scanned = new Scanner(System.in);
	    var = scanned.nextInt();
	    
	    switch(var) {
	    
	    case 1:
	    	// code block
	    break;
	    
	    case 2:
	    	// code block
	    break;
	    
	    case 3:
	    	System.out.println("Saving...\nYou did what most can't keep up the huge Ws I belive in you\nExiting");
	    break;
	    
	    default:
	    	System.out.println("Inavlid choice please choose from the given choices");
	    	break;
	    }
	    
	    }
		while (var !=3);
	}
}

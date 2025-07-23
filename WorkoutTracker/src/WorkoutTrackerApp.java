import java.util.Scanner;

public class WorkoutTrackerApp {
	public static void main(String[] args) {
		
		int var = 0;
		System.out.println("Welcome to the Workout Tracker App \n");
		Scanner scanned = new Scanner(System.in);
		
		do {
		System.out.println("Please select how would you like to continue.");
	    System.out.println("1:Add a new workout\n2:Open Tracker\n3:To Exit\n");
	    
	    var = scanned.nextInt();
	    scanned.nextLine();
	    
	    switch(var) {
	    
	    case 1:
	    	System.out.println("Choose the body part trained:"
	    			+ "1:Back\n"
	    			+ "2:Chest\n"
	    			+ "3:Legs\n"
	    			+ "4:Biceps\n"
	    			+ "5:Triceps\n"
	    			+ "6:Shoulders\n"
	    			+ "7:Abs\n");
	    	int mooscle = scanned.nextInt();
	    	scanned.nextLine();
	    	
	    	//initializing exersice object
	    	Exersice exersice;
	    	
	    	System.out.println("Enter the Exercise perfomed: ");
	    	String exer = scanned.nextLine();
	    	
	    	System.out.println("Enter the weight used: ");
	    	double weight = scanned.nextInt();
	    	scanned.nextLine();
	    	
	    	switch(mooscle) {
	    	case 1:
	    		// back
	    		
	    	break;
	    	
	    	case 2:
	    		// chest
	    	break;
	    	
	    	case 3:
	    		//legs
	    	break;
	    	
	    	case 4:
	    		//biceps
	    	break;
	    	
	    	case 5:
	    		//triceps
	    	break;
	    	
	    	case 6:
	    		// shoulders
	    	break;
	    		
	    	case 7:
	    		//abs
	    	break;
	    	
	    	default:
	    		System.out.println("Invalid choice");
	    	break;
	    	}
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

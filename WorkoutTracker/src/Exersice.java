
public class Exersice implements CompletedWorkout {
	
	private String exersice;
	private double weight;

	
	public Exersice(String exersice, double weight) {
		this.exersice = exersice;
		this.weight = weight; 
	}
	
	public Exersice() {
		this(null, 0);
	}
	
	public String getExersice() {
		return exersice;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public String getInfo() {
		return "Exersice: " + exersice + " was done with weight " + weight;
	}
	
	// To-Do is to add date on the recalling function while reading from the weight log file.
	
	@Override
	public void complete() {
		// TODO Auto-generated method stub 
		
	}

}

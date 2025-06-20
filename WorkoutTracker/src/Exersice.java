
public class Exersice {
	
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

}

package design;

public abstract class Beverage {
	
	private String description;
	
	public Beverage(String description) {
		this.description=description;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}

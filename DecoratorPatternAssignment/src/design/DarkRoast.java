package design;

public class DarkRoast extends Beverage{
	
	public DarkRoast(String description) {
		super(description);
	}

	@Override
	public double cost() {
		System.out.println("the cost");
		return 40.5;
	}
	
}

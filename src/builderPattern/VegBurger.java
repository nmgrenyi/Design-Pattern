package builderPattern;

public class VegBurger extends Burger{
	@Override
	public String name() {
		return "this is a veg burger";
	}
	
	@Override
	public float price() {
		return (float) 1.5;
	}
}

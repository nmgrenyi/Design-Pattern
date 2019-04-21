package builderPattern;

public class ChickenBurger extends Burger{
	@Override
	public String name() {
		return "this is a chicken burger";
	}
	
	@Override
	public float price() {
		return (float) 2.5;
	}
}

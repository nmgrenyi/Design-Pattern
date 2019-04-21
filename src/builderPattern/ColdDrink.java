package builderPattern;

public class ColdDrink implements Item{
	public String name() {
		return "Cold Drink";
	};
	public Packing packaging() {
		return new Bottle();
	};
	public float price() {
		return 0;
	};
}

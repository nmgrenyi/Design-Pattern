package builderPattern;

public abstract class Burger implements Item{
	public String name() {
		return "This is a burger";
	};
	public Packing packaging() {
		return new Wrapper();
	};
	public float price() {
		return (float) 0;
	};
}

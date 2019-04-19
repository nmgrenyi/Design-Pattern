package AbstractFactory;

public class RoundedRectangle implements Shape, Color{
	@Override
	public void draw() {
		System.out.println("this is a Rounded Rectangle");
	}
	
	@Override
	public void paint() {
		System.out.println("blue");
	}
}

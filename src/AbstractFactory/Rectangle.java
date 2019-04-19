package AbstractFactory;

public class Rectangle implements Shape, Color{
	@Override
    public void draw() {
    	System.out.println("this is a rectangle");
    } 
	
	@Override
	public void paint() {
		System.out.println("red");
	}
}

package facadePattern;

public class ShapeMaker {
	private static final Shape circle = new Circle();
	private static final Shape rectangle = new Rectangle();
	private static final Shape square = new Square();
	
	public void drawCircle() {
		circle.draw();
	}
	
	public void drawRectangle() {
		rectangle.draw();
	}
	
	public void drawSquare() {
		square.draw();
	}
}

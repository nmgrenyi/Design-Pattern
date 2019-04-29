package decoratorPattern;

public abstract class ShapeDecorator implements Shape{
	protected Shape decoratorShape;
	
	public ShapeDecorator (Shape decoratorShape) {
		this.decoratorShape = decoratorShape;
	}
	
	public void draw() {
		System.out.println("this is ShapeDecorator");
	}
}

package factroyPattern;

public class ShapeFactory {
	
	//private Shape shape;
	
	public Shape getShape(String shape) {
		if (shape.equals("circle")) {
			return new Circle();
		}
		else if (shape.equals("squre")) {
			return new Square();
		}
		else if (shape.equals("Rectange")) {
			return new Rectangle();
		}
		else {
			System.out.println("error!");
		}
		
		return null;
	}

}

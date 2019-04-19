package AbstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Shape Rectangle = shapeFactory.getShape("Rectangle");
		Rectangle.draw();
		
		AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
		Shape RoundedRectangle = roundedShapeFactory.getShape("Rectangle");
		RoundedRectangle.draw();
	}

}

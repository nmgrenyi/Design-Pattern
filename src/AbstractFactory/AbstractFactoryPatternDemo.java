package AbstractFactory;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
		Object Rectangle = shapeFactory.getShape("Rectangle");
		((Shape) Rectangle).draw();
		((Color) Rectangle).paint();
		
		AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);
		Object RoundedRectangle = roundedShapeFactory.getShape("Rectangle");
		((Shape) RoundedRectangle).draw();
		((Color) RoundedRectangle).paint();
	}

}

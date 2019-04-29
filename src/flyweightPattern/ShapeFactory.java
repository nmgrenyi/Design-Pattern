package flyweightPattern;

import java.util.HashMap;

public class ShapeFactory {
	private static HashMap<String, Circle> circleMap = new HashMap<String, Circle>();
	
	public static Circle getCircle(String color) {
		if (!circleMap.containsKey(color)) {
			circleMap.put(color, new Circle(color));
		}
		
		return circleMap.get(color);
	}
}

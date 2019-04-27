package bridgePattern;

public class Circle extends Shape{
	int x;
	int y;
	int radius;
	
	public Circle(int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.radius = radius;
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		drawAPI.drawCircle(radius, x, y);
	}
}

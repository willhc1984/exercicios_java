package Interface_ClasseAbstrata;

public class Circle extends AbstractShape{
	
	private double radius;

	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return radius * 3.14 * 3.14;
	}
	
	
	
	

}

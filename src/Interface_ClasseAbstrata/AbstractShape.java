package interface_classeAbstrata;

public abstract class AbstractShape implements Shape{
	
	private String color;

	public AbstractShape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


}

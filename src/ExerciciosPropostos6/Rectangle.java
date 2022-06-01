package ExerciciosPropostos6;

public class Rectangle {
	
	private double width;
	private double height;
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return (this.width*2) + (this.height*2);
	}
	
	public double diagonal() {
		double diagonal = Math.pow(this.height,2) + Math.pow(this.width,2);
		diagonal = Math.sqrt(diagonal);
		return diagonal;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	

}

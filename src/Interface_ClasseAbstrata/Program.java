package Interface_ClasseAbstrata;

public class Program {

	public static void main(String[] args) {
		
		Circle circle = new Circle("Black", 5);
		System.out.println(circle.area());
		
		Rectangle rectangle = new Rectangle("Red", 3, 5);
		System.out.println(rectangle.area());

	}

}

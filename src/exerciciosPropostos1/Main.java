package exerciciosPropostos1;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String product = "Computer";
		String product1 = "OfficeDesk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price = 2100.00;
		double price1 = 650.00;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is %.2f \n", product, price);
		System.out.printf("%s, which price is %.2f \n", product1, price1);
		System.out.printf("Record: %d years old, code %d and gender: %s \n" , age, code, gender);
		System.out.printf("Measure with eight decimal places: %f \n", measure);
		System.out.printf("Rounded (three decimal places): %.3f \n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %f \n", measure);
		
		
		
		
	}

}

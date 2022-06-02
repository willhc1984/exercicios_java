package ExerciciosPropostos6;

public class CurrencyCoverter {
	
	public static double converter(double amount, double dollarPrice) {
		double total = amount * dollarPrice;
		return total + (total * 0.06);
	}

}

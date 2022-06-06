package exercicio_OO_2;

public class ImportedProduct extends Product {
	
	private double customsFee;
	
	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " - $ " + totalPrice() +  " - (Customs fee) $ " + customsFee;
	}
	
	public Double totalPrice() {
		return getPrice() + customsFee;
	}

	public double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(double customsFee) {
		this.customsFee = customsFee;
	}
	
	
	

}

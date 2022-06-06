package exercicio_OO_1;

public class OutsourceEmployee extends Employee {
	
	private Double additionalCharge;
	
	public OutsourceEmployee() {
	}
	
	public OutsourceEmployee(Double additionalCharge) {
		super();
		this.additionalCharge = additionalCharge;
	}
	
	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharge * 1.1;
	}

	public Double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	

}

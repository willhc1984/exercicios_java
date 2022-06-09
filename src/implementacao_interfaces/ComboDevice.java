package implementacao_interfaces;

public class ComboDevice extends Device implements Printer, Scanner{

	public ComboDevice(int serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String scan() {
		return "Combo device is printing... Done!";
	}

	@Override
	public String print(String doc) {
		return "Combo device is scanning " + doc + " Done!";
	}

}

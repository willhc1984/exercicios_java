package implementacao_interfaces;

public class PrinterDevice extends Device implements Printer{

	public PrinterDevice(int serialNumber) {
		super(serialNumber);
	}

	@Override
	public String print(String doc) {
		return "Printing: " + doc;
	}

}

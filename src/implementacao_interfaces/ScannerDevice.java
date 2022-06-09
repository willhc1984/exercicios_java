package implementacao_interfaces;

public class ScannerDevice extends Device implements Scanner{

	public ScannerDevice(int serialNumber) {
		super(serialNumber);
	}

	@Override
	public String scan() {
		return "Scanning doc... Done!";
	}

}

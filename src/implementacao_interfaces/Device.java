package implementacao_interfaces;

public class Device {
	
	private int serialNumber;

	public Device(int serialNumber) {
		super();
		this.serialNumber = serialNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public void processDoc() {
		
	}
}

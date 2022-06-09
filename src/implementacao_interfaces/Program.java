package implementacao_interfaces;

public class Program {

	public static void main(String[] args) {
		
		PrinterDevice printer = new PrinterDevice(666);
		System.out.println(printer.print("Teste..."));
		
		System.out.println();
		ScannerDevice scanner = new ScannerDevice(666);
		System.out.println(scanner.scan());
		
		System.out.println();
		ComboDevice combo = new ComboDevice(666);
		System.out.println(combo.print("printing test..."));
		System.out.println(combo.scan());
	}

}

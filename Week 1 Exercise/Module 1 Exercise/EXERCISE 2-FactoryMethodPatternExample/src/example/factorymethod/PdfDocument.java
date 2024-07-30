package example.factorymethod;

public class PdfDocument implements Document {

	@Override
	public void open() {
		System.out.println("Opening Pdf document...");
		
	}

}

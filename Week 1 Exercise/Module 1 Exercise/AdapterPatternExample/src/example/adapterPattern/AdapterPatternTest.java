package example.adapterPattern;

public class AdapterPatternTest {

	public static void main(String[] args) {
		PaymentProcessor PhonepeProcessor = new PhonePeAdapter(new PhonePe());
        PaymentProcessor PayTmProcessor = new PayTmAdapter(new PayTm());
        
        
        PhonepeProcessor.processPayment(100.0);
        PayTmProcessor.processPayment(200.0);

	}

}

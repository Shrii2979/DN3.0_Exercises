package example.adapterPattern;

public class PayTmAdapter implements PaymentProcessor {
	
	private PayTm ptm;
	
	 public PayTmAdapter(PayTm ptm) {
	        this.ptm = ptm;
	    }


	@Override
	public void processPayment(double amount) {
	     ptm.payment(amount);
		
	}
	

}

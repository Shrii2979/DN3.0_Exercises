package example.adapterPattern;

public class PhonePeAdapter  implements PaymentProcessor{
	private PhonePe phpe;

    public PhonePeAdapter(PhonePe phpe) {
        this.phpe = phpe;
    }

	@Override
	public void processPayment(double amount) {
		phpe.pay(amount);
		
	}
    

}

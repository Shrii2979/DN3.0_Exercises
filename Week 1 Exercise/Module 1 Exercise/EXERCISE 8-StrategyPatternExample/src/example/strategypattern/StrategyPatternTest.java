package example.strategypattern;

public class StrategyPatternTest {

	public static void main(String[] args) {
		PaymentContext context = new PaymentContext();

        
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234 5678 9012 3456", "John Doe", "123", "12/24");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(250.0);

        
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(150.0);
	}

}

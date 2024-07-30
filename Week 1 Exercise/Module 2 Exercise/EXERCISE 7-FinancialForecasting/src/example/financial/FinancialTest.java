package example.financial;

public class FinancialTest {

	public static void main(String[] args) {
       FinancialForecasting forecasting = new FinancialForecasting();
        
        double initialValue = 1000.0; // Initial value
        double growthRate = 0.05; // Growth rate (5%)
        int periods = 10; // Number of periods

        double futureValue = forecasting.calculateFutureValue(initialValue, growthRate, periods);
        
        System.out.println("Future Value: " + futureValue);
	}

}

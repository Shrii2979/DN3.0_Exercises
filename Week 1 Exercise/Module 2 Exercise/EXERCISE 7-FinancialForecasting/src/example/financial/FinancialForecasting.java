package example.financial;

public class FinancialForecasting {
	 public double calculateFutureValue(double initialValue, double growthRate, int periods) {
	        
	        if (periods == 0) {
	            return initialValue;
	        }
	        
	        return calculateFutureValue(initialValue * (1 + growthRate), growthRate, periods - 1);
	    }

}

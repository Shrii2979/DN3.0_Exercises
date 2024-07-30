package example.ObserverPattern;

public class WebApp  implements Observer{
	
	 private String name;

	    public WebApp(String name) {
	        this.name = name;
	    }

	    @Override
	    public void update(double stockPrice) {
	        System.out.println("WebApp " + name + " notified. New stock price: " + stockPrice);
	    }

}

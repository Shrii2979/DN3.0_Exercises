package example.ObserverPattern;

public class MobileApp implements Observer {
	
	private String name;

    public MobileApp(String name) {
        this.name = name;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println("MobileApp " + name + " notified. New stock price: " + stockPrice);
    }

}

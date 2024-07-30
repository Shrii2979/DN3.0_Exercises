package example.ObserverPattern;

public class ObserverPatterntest {

	public static void main(String[] args) {
		StockMarket stockMarket = new StockMarket();

        MobileApp mobileApp1 = new MobileApp("App1");
        MobileApp mobileApp2 = new MobileApp("App2");
        WebApp webApp1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        stockMarket.setStockPrice(100.0);
        stockMarket.setStockPrice(150.0);

        stockMarket.deregisterObserver(mobileApp1);

        stockMarket.setStockPrice(200.0);
	}

}

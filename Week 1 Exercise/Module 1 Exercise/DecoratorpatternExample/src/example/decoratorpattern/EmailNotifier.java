package example.decoratorpattern;

public class EmailNotifier implements Notifier {

	@Override
	public void send(String message) {
		System.out.println("sending email notification:"+message);
		
	}

}

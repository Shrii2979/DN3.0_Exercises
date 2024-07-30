package example.decoratorpattern;

public class DecoratorPatternTest {

	public static void main(String[] args) {
		Notifier emailNotifier = new EmailNotifier();

        
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);
        Notifier allNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        // Send notifications
        allNotifier.send("Hello, World!");
	}

}

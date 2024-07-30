package com.example.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		Logger logger1=Logger.getInstance();
		Logger logger2=Logger.getInstance();
		
		logger1.log("Logger1:This is a log message");
		logger2.log("Logger2:This is another log message");
	     
		if(logger1==logger2) {
			System.out.println("Both logger1 and logger 2 are same instance");
			
		}
		else
			System.out.println("Both logger1 and logger 2 are different instance");
				

	}

}

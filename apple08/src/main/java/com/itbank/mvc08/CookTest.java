package com.itbank.mvc08;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CookTest {
	
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		ICook cook = (ICook)factory.getBean("korean");

		CookManager cm = new CookManager(cook);
		cm.orderRice();
		cm.orderSoup();
	}
}

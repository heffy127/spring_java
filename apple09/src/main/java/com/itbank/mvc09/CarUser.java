package com.itbank.mvc09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CarUser {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		Car superCar = (Car)factory.getBean("super");
		superCar.open();

	}
}

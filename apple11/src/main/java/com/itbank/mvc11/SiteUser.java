package com.itbank.mvc11;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SiteUser {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("aopContext.xml");

		BSite b = (BSite)factory.getBean("b");
		b.search();
		b.basket();
		b.order();
	}
	
}

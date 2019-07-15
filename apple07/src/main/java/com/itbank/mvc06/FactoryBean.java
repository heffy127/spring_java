package com.itbank.mvc06;

public class FactoryBean {
	public Object getBean(String name) { // 모든 객체를 포함할 수 있음
		Object bean = null;
		if(name.equals("apple")) {
			bean = new AppleTv();
		} else if (name.equals("banana")) {
			bean = new BananaTv();
		} else if (name.equals("cherry")) {
			bean = new CherryTv();
		}
		return bean;
	}
}

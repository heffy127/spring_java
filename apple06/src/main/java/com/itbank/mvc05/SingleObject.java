package com.itbank.mvc05;

public class SingleObject {
	
	public static int count;
	public static SingleObject object;
	
	public SingleObject() {
		System.out.println("single object 객체 생성");
		count++;
	}
	
	public static SingleObject getInstance() {
		if(object == null) {
			object = new SingleObject();
		}
		return  object;
	}
	
	public String getString() {
		return "Single OK";
	}
}

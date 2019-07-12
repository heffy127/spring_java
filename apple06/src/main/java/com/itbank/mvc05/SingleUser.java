package com.itbank.mvc05;

public class SingleUser {
	public static void main(String[] args) {
		SingleObject single1 = SingleObject.getInstance();
		System.out.println(single1.getString());
		System.out.println(SingleObject.count);
		
		SingleObject single2 = SingleObject.getInstance();
		System.out.println(single2.getString());
		System.out.println(SingleObject.count);
	}
}

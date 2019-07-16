package com.itbank.mvc09;

public class SuperCar implements Car {

	Window window;
	Door door;
	String color;
	int speed;
	
	public SuperCar() {
		
	}
	
	public SuperCar(Window window) {
		this.window = window;
	}
	
	public SuperCar(Window window, Door door, String color, int speed) {
		super();
		this.window = window;
		this.door = door;
		this.color = color;
		this.speed = speed;
	}

	@Override
	public void open() {
		window.open();
		door.doorOpen();
		System.out.println("차 색은 : " + color);
		System.out.println("차 속도는 : " + speed);
	}

	@Override
	public void close() {
		window.close();

	}
}

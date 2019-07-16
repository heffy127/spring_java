package com.itbank.mvc09;

public class SportsCar implements Car{
	
	Window window;
	Door door;
	String color;
	int speed;
	
	public SportsCar() {}
	
	
	public SportsCar(Window window) { // 2. 생성자방법
		this.window = window;
	}
	
	
	public SportsCar(Window window, String color, int speed) {
		super();
		this.window = window;
		this.color = color;
		this.speed = speed;
	}

	
	
	public SportsCar(Window window, Door door, String color, int speed) {
		super();
		this.window = window;
		this.door = door;
		this.color = color;
		this.speed = speed;
	}


	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setWindow(Window window) { // 1. 세터방법
		this.window = window;
	}
	
	public void setDoor(Door door) {
		this.door = door;
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

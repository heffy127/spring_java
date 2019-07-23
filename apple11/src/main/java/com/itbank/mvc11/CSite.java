package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("c")
public class CSite {
	public void showInfo() {
		System.out.println("주문정보보기");
	}
	
	public void check() {
		System.out.println("확인");
	}
}

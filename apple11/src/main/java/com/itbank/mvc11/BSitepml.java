package com.itbank.mvc11;

import org.springframework.stereotype.Component;

@Component("b2")
public class BSitepml implements BInterface {

	@Override
	public String productFind(String name, int price) {
		System.out.println(name + "물건 검색");
		System.out.println("가격은 " + price + "원");
		return "ok";
	}

	@Override
	public void basket() {
		int[] num = {1,2};
		System.out.println(num[3]);
		System.out.println("장바구니 담기");
	}

	@Override
	public void productOrder() {
		System.out.println("물건 주문");
	}

}

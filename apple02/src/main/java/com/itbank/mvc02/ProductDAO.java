package com.itbank.mvc02;

public class ProductDAO {
	public ProductDAO() {
		
	}
	
	public void insert(ProductDTO productDTO) {
		System.out.println("=====================");
		System.out.println("상품등록");
		System.out.println("상품id : " + productDTO.getId());
		System.out.println("상품명 : " + productDTO.getName());
		System.out.println("가격 : " + productDTO.getPrice());
		System.out.println("마일리지 : " + productDTO.getMileage());
		System.out.println("=====================");
	}
	
	public void insertMileage(ProductDTO productDTO) {
		productDTO.setMileage(0);
		System.out.println("=====================");
		System.out.println("마일리지 0 초기화");
		System.out.println("=====================");
	}
	
	public void delete(ProductDTO productDTO) {
		System.out.println("=====================");
		System.out.println("상품삭제");
		System.out.println("상품id : " + productDTO.getId());
		System.out.println("=====================");
	}
	
	public void search(ProductDTO productDTO) {
		System.out.println("=====================");
		System.out.println("상품상세검색");
		System.out.println("상품id : " + productDTO.getId());
		productDTO.setName("새우깡");
		productDTO.setPrice(1500);
		productDTO.setMileage(0);		
		System.out.println("=====================");
	}
}

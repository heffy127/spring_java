package com.itbank.mvc03;

public class MemberDAO {
	public void insert(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert sql 실행");
		System.out.println("입력한 id : " + memberDTO.getId());
		System.out.println("입력한 pw : " + memberDTO.getPw());
		System.out.println("입력한 name : " + memberDTO.getName());
	}
	public void insert2(MemberDTO memberDTO) {
		System.out.println("DB연동해서 insert sql 실행");
		System.out.println("입력한 id : " + memberDTO.getId());
		System.out.println("입력한 pw : " + memberDTO.getPw());
		System.out.println("입력한 name : " + memberDTO.getName());
	}
}

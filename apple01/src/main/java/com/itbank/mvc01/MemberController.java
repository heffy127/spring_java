package com.itbank.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
	
	@RequestMapping("insert")
	public void insert(@RequestParam String name, 
						@RequestParam String id, 
						@RequestParam String pw) {
		
		System.out.println("dao db처리");
		System.out.println("상세 정보 받아옴");
		System.out.println("view로 넘김");
	}
	
	@RequestMapping("insert2")
	public void insert2(MemberDTO memberDTO, MemberDAO memberDAO) {
		memberDAO.insert2(memberDTO);
	}
	
//	@RequestMapping("delete")
//	public void delete(MemberDTO memberDTO, MemberDAO memberDAO) {
//		memberDAO.delete(memberDTO);
//	}
	
}

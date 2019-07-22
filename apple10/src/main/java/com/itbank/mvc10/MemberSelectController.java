package com.itbank.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberSelectController {
	
	@Autowired
	//@Qualifier("dao1") 이름가지고 한번 더 검색하는 용도
	MemberDAO dao;
	
	@RequestMapping("select.do")
	public void select(MemberDTO memberDTO, Model model) {
		MemberDTO dto = dao.select(memberDTO);
		model.addAttribute("dto", dto);
	}
	
	@RequestMapping("selectAll.do")
	public void selectAll(Model model) {
		List<MemberDTO> list = dao.selectAll();
		model.addAttribute("list",list);
	}
}

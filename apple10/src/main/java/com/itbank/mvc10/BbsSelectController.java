package com.itbank.mvc10;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {
	
	@Autowired
	BbsDAO dao;
	@Autowired
	MycommentDAO cdao;

	
	@RequestMapping("selectBbs.do")
	public String select(BbsDTO bbsDTO, MycommentDTO mycommentDTO, Model model) {
		System.out.println("asdf");
		BbsDTO dto = dao.select(bbsDTO);
		model.addAttribute("dto", dto);
		List<MycommentDTO> list = cdao.selectAll(dto.getId());
		model.addAttribute("list", list);
		return "bbsSelect";
	}
	
	@RequestMapping("comment.do")
	public void comment(MycommentDTO mycommentDTO, Model model) {
		cdao.insert(mycommentDTO);
		System.out.println("댓글등록");
		model.addAttribute("cDTO",mycommentDTO );
	}
	
	@RequestMapping("selectAllBbs.do")
	public String selectAll(Model model ) {
		List<BbsDTO> list = dao.selectAll();
		model.addAttribute("list", list);
		return "bbsSelectAll";
	}
	
}

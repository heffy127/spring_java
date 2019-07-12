package com.itbank.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsSelectController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("select.do")
	public String select(Model model ,BbsDTO bbsDTO) throws Exception {
		bbsDTO = bbsDAO.select(bbsDTO);
		model.addAttribute("bbsDTO", bbsDTO);
		return "selectView";
	}
}

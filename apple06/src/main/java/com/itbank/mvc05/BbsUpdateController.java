package com.itbank.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsUpdateController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("update.do")
	public String update(Model model, BbsDTO bbsDTO) throws Exception {
		bbsDAO.update(bbsDTO);
		bbsDTO = bbsDAO.select(bbsDTO);
		model.addAttribute("bbsDTO", bbsDTO);
		return "selectView";
	}
}

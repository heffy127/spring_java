package com.itbank.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsDeleteController {
	
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("delete.do")
	public String delete(BbsDTO bbsDTO) throws Exception {
		bbsDAO.delete(bbsDTO);
		System.out.println("delete 완료");
		return "deleteView";
	}
}

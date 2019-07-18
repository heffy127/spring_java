package com.itbank.mvc99;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsInsertController {

	@Autowired
	BbsDAO dao;
	
	@RequestMapping("insert.do")
	public String insert(BbsDTO bbsDTO) {
		dao.insert(bbsDTO);
		return "insert_ok";
	}
}

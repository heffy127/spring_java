package com.itbank.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {
	
	// 싱글턴의 getInstance역할
	// 클래스의 type을 가지고 찾게된다
	@Autowired
	BbsDAO bbsDAO;
	
	@RequestMapping("mybbs")
	public void showBbs(BbsDTO bbsDTO) throws Exception{
		bbsDAO.insert(bbsDTO);
		System.out.println("컨트롤러 호출확인");
//		return "bbsView";
	}
}

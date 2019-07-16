package com.itbank.mvc88;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BbsUser {
	public static void main(String[] args) {
		ApplicationContext factory = new GenericXmlApplicationContext("context.xml");
		BbsDAO dao = (BbsDAO)factory.getBean("bbsDAO");
		BbsDTO BbsDTO = new BbsDTO();
		BbsDTO.setId("mybatis");
		BbsDTO.setTitle("mybatis");
		BbsDTO.setContent("mybatis");
		BbsDTO.setWriter("mybatis");
		dao.insert(BbsDTO);
	}
}

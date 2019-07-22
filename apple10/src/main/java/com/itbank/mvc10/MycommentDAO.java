package com.itbank.mvc10;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MycommentDAO {

	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MycommentDTO mycommentDTO) {
		my.insert("cDAO.insert", mycommentDTO);
		System.out.println("댓글등록");
	}
	
	public List<MycommentDTO> selectAll(String id) {
		return my.selectList("cDAO.selectAll", id);
	}
	
	public List<MycommentDTO> selectAll2() {
		return my.selectList("cDAO.selectAll2");
	}
}

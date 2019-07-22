package com.itbank.mvc10;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {
	
	@Autowired
	SqlSessionTemplate my;
	
	public BbsDTO select(BbsDTO bbsDTO) {
		return my.selectOne("bDAO.select", bbsDTO);
	}
	
	public List<BbsDTO> selectAll() {
		return my.selectList("bDAO.selectAll");
	}
	
}

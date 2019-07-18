package com.itbank.mvc10;

import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

// @Service DB가 아닐 경우 사용하는 어노테이션
@Repository // 어디서나 DB용 싱글톤으로 만든 Bean사용 가능하도록 하는 어노테이션
public class MemberDAO {
	
	// context.xml의 mybatis를 넣어줌
	// 변수명이 아닌 SqlSessionTemplate의 타입값을 보고 찾음
	@Autowired
	SqlSessionTemplate my;
	
	public void insert(MemberDTO memberDTO) {
		my.insert("mDAO.insert", memberDTO);
		System.out.println("mybatis호출");
	}
	
	public void delete(MemberDTO memberDTO) {
		my.delete("mDAO.delete", memberDTO);
	}
	
	public void update(MemberDTO memberDTO) {
		my.update("mDAO.update", memberDTO);
	}
	
	public MemberDTO select(MemberDTO memberDTO) {
		return my.selectOne("mDAO.select", memberDTO);// 결과값이 하나일때 쓰는  mybatis 함수
	}
	
	public List<MemberDTO> selectAll() {
		return my.selectList("mDAO.selectAll");
	}
	
}

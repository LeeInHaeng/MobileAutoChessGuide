package com.oddidea.guide.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oddidea.guide.vo.UnitVo;

@Repository
public class UnitDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Object> getUnitList(){
		System.out.println(sqlSession.selectList("unit.getList"));
		List<Object> result = sqlSession.selectList("unit.getList");
		return result;
	}
}

package com.oddidea.guide.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oddidea.guide.vo.ItemVo;

@Repository
public class ItemDao {

	@Autowired
	private SqlSession sqlSession;

	public Object getItemList() {
		List<ItemVo> result = sqlSession.selectList("item.getList");
		return result;
	}
}

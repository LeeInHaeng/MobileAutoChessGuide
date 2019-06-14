package com.oddidea.guide.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oddidea.guide.vo.UnitCommentVo;

@Repository
public class UnitDao {

	@Autowired
	private SqlSession sqlSession;
	
	public List<Object> getUnitList(){
		List<Object> result = sqlSession.selectList("unit.getList");
		return result;
	}
	
	public List<UnitCommentVo> getBestComment(int unitNo){
		List<UnitCommentVo> result = sqlSession.selectList("unit.getBestComment", unitNo);
		return result;
	}
	
	public List<UnitCommentVo> getCommentList(int unitNo){
		List<UnitCommentVo> result = sqlSession.selectList("unit.getCommentList", unitNo);
		return result;
	}

	public List<Object> goodCommentNo(Map<String, Object> data) {
		List<Object> result = sqlSession.selectList("unit.getGoodCommentNo", data);
		return result;
	}

	public List<Object> badCommentNo(Map<String, Object> data) {
		List<Object> result = sqlSession.selectList("unit.getBadCommentNo", data);
		return result;
	}
	
	public Boolean goodVote(Map<String, Object> data) {
		int result = sqlSession.insert("unit.goodVote", data);
		return result==1;
	}
	
	public Boolean badVote(Map<String, Object> data) {
		int result = sqlSession.insert("unit.badVote", data);
		return result==1;
	}

	public Boolean goodCancel(Map<String, Object> data) {
		int result = sqlSession.delete("unit.goodCancel", data);
		return result==1;
	}

	public Boolean badCancel(Map<String, Object> data) {
		int result = sqlSession.delete("unit.badCancel", data);
		return result==1;
	}

	public Boolean commentAdd(Map<String, Object> data) {
		int result = sqlSession.insert("unit.commentAdd", data);
		return result==1;
	}
}

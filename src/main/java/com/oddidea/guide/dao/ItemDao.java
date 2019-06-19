package com.oddidea.guide.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oddidea.guide.vo.ItemCommentVo;
import com.oddidea.guide.vo.ItemVo;

@Repository
public class ItemDao {

	@Autowired
	private SqlSession sqlSession;

	public Object getItemList() {
		List<ItemVo> result = sqlSession.selectList("item.getList");
		return result;
	}

	public List<ItemCommentVo> getItemCommentList(int itemNo) {
		List<ItemCommentVo> result = sqlSession.selectList("item.getCommentList", itemNo);
		return result;
	}

	public List<ItemCommentVo> getItemVotedUnit(Map<String, Object> data) {
		List<ItemCommentVo> result = sqlSession.selectList("item.getCommentVotedUnit", data);
		return result;
	}

	public Boolean itemCommentVoteNew(Map<String, Object> data) {
		int result = sqlSession.insert("item.commentVote", data);
		return result==1;
	}

	public Boolean itemCommentVoteUpdate(Map<String, Object> data) {
		int result = sqlSession.update("item.commentUpdate", data);
		return result==1;
	}
}

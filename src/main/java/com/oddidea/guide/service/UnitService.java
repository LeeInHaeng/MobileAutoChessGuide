package com.oddidea.guide.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oddidea.guide.dao.UnitDao;

@Service
public class UnitService {

	@Autowired
	private UnitDao unitDao;
	
	public Object getUnitEvaluationList(){
		return unitDao.getUnitList();
	}

	public Map<String, Object> getUnitCommentListByNo(Map<String, Object> data) {
		int unitNo = (int) data.get("unitNo");
		
		Map<String, Object> res = new HashMap<String, Object>();
		res.put("best3", unitDao.getBestComment(unitNo));
		res.put("commentList", unitDao.getCommentList(unitNo));
		res.put("goodCommentNo", unitDao.goodCommentNo(data));
		res.put("badCommentNo", unitDao.badCommentNo(data));
		
		return res;
	}

	public Boolean unitCommentGoodVote(Map<String, Object> data) {
		try {
			return unitDao.goodVote(data);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Boolean unitCommentBadVote(Map<String, Object> data) {
		try {
			return unitDao.badVote(data);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public Boolean unitCommentGoodVoteCancel(Map<String, Object> data) {
		return unitDao.goodCancel(data);
	}

	public Boolean unitCommentBadVoteCancel(Map<String, Object> data) {
		return unitDao.badCancel(data);
	}

	public Boolean unitEvaluationCommentAdd(Map<String, Object> data) {
		return unitDao.commentAdd(data);
	}
}

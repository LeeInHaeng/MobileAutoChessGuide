package com.oddidea.guide.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oddidea.guide.vo.JobEffectVo;
import com.oddidea.guide.vo.SpeciesEffectVo;

@Repository
public class EffectDao {

	@Autowired
	private SqlSession sqlSession;

	public List<JobEffectVo> getJobEffectList() {
		List<JobEffectVo> result = sqlSession.selectList("effect.getJobEffectList");
		return result;
	}

	public List<SpeciesEffectVo> getSpeciesEffectList() {
		List<SpeciesEffectVo> result = sqlSession.selectList("effect.getSpeciesEffectList");
		return result;
	}
}

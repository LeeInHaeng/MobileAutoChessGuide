package com.oddidea.guide.service;

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
}

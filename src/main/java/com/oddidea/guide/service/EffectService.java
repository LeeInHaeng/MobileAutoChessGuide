package com.oddidea.guide.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oddidea.guide.dao.EffectDao;

@Service
public class EffectService {

	@Autowired
	private EffectDao effectDao;
	
	public Map<String, Object> getEffectList(){
		Map<String, Object> result = new HashMap<String, Object>();
		
		result.put("jobEffect", effectDao.getJobEffectList());
		result.put("speciesEffect", effectDao.getSpeciesEffectList());
		
		return result;
	}
}

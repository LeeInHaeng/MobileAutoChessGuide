package com.oddidea.guide.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oddidea.guide.service.UnitService;

@Controller
@RequestMapping("/api/unit")
public class UnitAPIController {

	@Autowired
	private UnitService unitService;
	
	@RequestMapping(value="/hi", method=RequestMethod.GET)
	public String hi() {
		return "test";
	}
	
	@ResponseBody
	@RequestMapping(value="/hi", method=RequestMethod.POST)
	public Object hi(@RequestBody Object data) {
		System.out.println(data);
		
		return unitService.getUnitEvaluationList();
	}
	
}

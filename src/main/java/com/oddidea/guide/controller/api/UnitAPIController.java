package com.oddidea.guide.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oddidea.guide.service.UnitService;

@Controller
@RequestMapping("/api/unit")
public class UnitAPIController {

	@Autowired
	private UnitService unitService;
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String test() {
		return "test";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/unitList", method=RequestMethod.GET)
	public Object unitList() {
		return unitService.getUnitEvaluationList();
	}
	
//	@ResponseBody
//	@RequestMapping(value="/hi", method=RequestMethod.POST)
//	public Object hi(@RequestBody Object data) {
//		//System.out.println(data);
//		
//		
//	}
	
}

package com.oddidea.guide.controller.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
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

	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/unitList", method=RequestMethod.GET)
	public Object unitList() {
		return unitService.getUnitEvaluationList();
	}
	
	@RequestMapping(value="/unitListTest", method=RequestMethod.GET)
	public String unitListTest() {
		return "unitListTest";
	}

	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment", method=RequestMethod.POST)
	public Map<String, Object> getUnitComment(@RequestBody Map<String, Object> data) {
		return unitService.getUnitCommentListByNo(data);
	}
	
	@RequestMapping(value="/commentTest", method=RequestMethod.GET)
	public String test() {
		return "commentTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/good", method=RequestMethod.POST)
	public Boolean commentGood(@RequestBody Map<String, Object> data) {
		return unitService.unitCommentGoodVote(data);
	}
	
	@RequestMapping(value="/comment/goodTest", method=RequestMethod.GET)
	public String commentGoodTest() {
		return "commentGoodTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/bad", method=RequestMethod.POST)
	public Boolean commentbad(@RequestBody Map<String, Object> data) {
		return unitService.unitCommentBadVote(data);
	}
	
	@RequestMapping(value="/comment/badTest", method=RequestMethod.GET)
	public String commentBadTest() {
		return "commentBadTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/good/cancel", method=RequestMethod.POST)
	public Boolean commentGoodCancel(@RequestBody Map<String, Object> data) {
		return unitService.unitCommentGoodVoteCancel(data);
	}
	
	@RequestMapping(value="/comment/good/cancelTest", method=RequestMethod.GET)
	public String commentGoodCancelTest() {
		return "commentGoodCancelTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/bad/cancel", method=RequestMethod.POST)
	public Boolean commentBadCancel(@RequestBody Map<String, Object> data) {
		return unitService.unitCommentBadVoteCancel(data);
	}
	
	@RequestMapping(value="/comment/bad/cancelTest", method=RequestMethod.GET)
	public String commentBadCancelTest() {
		return "commentBadCancelTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/add", method=RequestMethod.POST)
	public Boolean commentAdd(@RequestBody Map<String, Object> data) {
		return unitService.unitEvaluationCommentAdd(data);
	}
	
	@RequestMapping(value="/comment/addTest", method=RequestMethod.GET)
	public String commentAddTest() {
		return "commentAddTest";
	}
}

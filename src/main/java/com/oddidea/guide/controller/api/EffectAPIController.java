package com.oddidea.guide.controller.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oddidea.guide.service.EffectService;

@Controller
@RequestMapping("/api/effect")
public class EffectAPIController {

	@Autowired
	private EffectService effectService;
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/effectList", method=RequestMethod.GET)
	public Map<String, Object> effectList() {
		return effectService.getEffectList();
	}
}

package com.oddidea.guide.controller.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oddidea.guide.service.ItemService;

@Controller
@RequestMapping("/api/item")
public class ItemAPIController {

	@Autowired
	private ItemService itemService;

	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/itemList", method=RequestMethod.GET)
	public Object itemList() {
		return itemService.getItemDetailList();
	}
	
	@RequestMapping(value="/itemListTest", method=RequestMethod.GET)
	public String itemListTest() {
		return "itemListTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/{itemNo}", method=RequestMethod.GET)
	public Map<Integer, Float> getUnitComment(@PathVariable("itemNo") int itemNo) {
		return itemService.getItemCommentListByNo(itemNo);
	}
	
	@RequestMapping(value="/commentTest", method=RequestMethod.GET)
	public String test() {
		return "ItemCommentTest";
	}
}

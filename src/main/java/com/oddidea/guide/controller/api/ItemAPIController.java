package com.oddidea.guide.controller.api;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oddidea.guide.service.ItemService;
import com.oddidea.guide.vo.ItemCommentVo;

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
	public Map<Integer, Float> itemComment(@PathVariable("itemNo") int itemNo) {
		return itemService.getItemCommentListByNo(itemNo);
	}
	
	@RequestMapping(value="/commentTest", method=RequestMethod.GET)
	public String itemCommentTest() {
		return "ItemCommentTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/votedUnit", method=RequestMethod.POST)
	public List<ItemCommentVo> itemCommentVotedUnit(@RequestBody Map<String, Object> data) {
		return itemService.getItemCommentVotedUnitNo(data);
	}
	
	@RequestMapping(value="/comment/votedUnitTest", method=RequestMethod.GET)
	public String itemCommentVoteUnitTest() {
		return "ItemCommentVoteUnitTest";
	}
	
	@ResponseBody
	@CrossOrigin(origins = "http://127.0.0.1:52273")
	@RequestMapping(value="/comment/vote", method=RequestMethod.POST)
	public Boolean itemCommentVote(@RequestBody Map<String, Object> data) {
		return itemService.itemCommentVote(data);
	}
	
	@RequestMapping(value="/comment/voteTest", method=RequestMethod.GET)
	public String itemCommentVoteTest() {
		return "ItemCommentVoteTest";
	}
}

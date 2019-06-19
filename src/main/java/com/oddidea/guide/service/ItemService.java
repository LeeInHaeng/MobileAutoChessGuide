package com.oddidea.guide.service;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oddidea.guide.dao.ItemDao;
import com.oddidea.guide.vo.ItemCommentVo;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemDao;

	public Object getItemDetailList() {
		return itemDao.getItemList();
	}

	public Map<Integer, Float> getItemCommentListByNo(int itemNo) {
		List<ItemCommentVo> itemCommentList = itemDao.getItemCommentList(itemNo);

		Map<Integer, Integer> votedUnitCnt = new HashMap<Integer, Integer>();
		Map<Integer, Float> votedUnitPercent = new LinkedHashMap<Integer, Float>();

		for (ItemCommentVo itemCommentVo : itemCommentList) {
			if (itemCommentVo.getGoodUnitNo1() != 0) {
				if (votedUnitCnt.get(itemCommentVo.getGoodUnitNo1()) != null) {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo1(),
							votedUnitCnt.get(itemCommentVo.getGoodUnitNo1()) + 1);
				} else {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo1(), 1);
				}
			}

			if (itemCommentVo.getGoodUnitNo2() != 0) {
				if (votedUnitCnt.get(itemCommentVo.getGoodUnitNo2()) != null) {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo2(),
							votedUnitCnt.get(itemCommentVo.getGoodUnitNo2()) + 1);
				} else {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo2(), 1);
				}
			}

			if (itemCommentVo.getGoodUnitNo3() != 0) {
				if (votedUnitCnt.get(itemCommentVo.getGoodUnitNo3()) != null) {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo3(),
							votedUnitCnt.get(itemCommentVo.getGoodUnitNo3()) + 1);
				} else {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo3(), 1);
				}
			}

			if (itemCommentVo.getGoodUnitNo4() != 0) {
				if (votedUnitCnt.get(itemCommentVo.getGoodUnitNo4()) != null) {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo4(),
							votedUnitCnt.get(itemCommentVo.getGoodUnitNo4()) + 1);
				} else {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo4(), 1);
				}
			}

			if (itemCommentVo.getGoodUnitNo5() != 0) {
				if (votedUnitCnt.get(itemCommentVo.getGoodUnitNo5()) != null) {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo5(),
							votedUnitCnt.get(itemCommentVo.getGoodUnitNo5()) + 1);
				} else {
					votedUnitCnt.put(itemCommentVo.getGoodUnitNo5(), 1);
				}
			}
		}

		int entireVotedCnt = 0;
		for (Integer unitNo : votedUnitCnt.keySet()) {
			entireVotedCnt += votedUnitCnt.get(unitNo);
		}

		for (Integer unitNo : votedUnitCnt.keySet()) {
			votedUnitPercent.put(unitNo, (((float) votedUnitCnt.get(unitNo) / entireVotedCnt) * 100));
		}

		return votedUnitPercent;
	}

	public List<ItemCommentVo> getItemCommentVotedUnitNo(Map<String, Object> data) {
		return itemDao.getItemVotedUnit(data);
	}

	public Boolean itemCommentVote(Map<String, Object> data) {
		List<ItemCommentVo> isVoted = itemDao.getItemVotedUnit(data);
		
		try {
			if(isVoted.size()==0) // 처음 투표
				return itemDao.itemCommentVoteNew(data);
			else // 이전 투표한 내용 업데이트
				return itemDao.itemCommentVoteUpdate(data);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

}

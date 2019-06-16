package com.oddidea.guide.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oddidea.guide.dao.ItemDao;

@Service
public class ItemService {

	@Autowired
	private ItemDao itemDao;

	public Object getItemDetailList() {
		return itemDao.getItemList();
	}
}

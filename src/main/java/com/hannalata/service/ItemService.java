package com.hannalata.service;

import java.util.List;

import com.hannalata.dao.ItemDAO;
import com.hannalata.model.Item;

public class ItemService {
	
	public static List<Item> getAll() {
		return ItemDAO.getAll();
	}

}

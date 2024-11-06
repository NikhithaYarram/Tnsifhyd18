package com.si.demo.service;

import java.util.List;

import com.si.demo.entity.Item;

public interface ItemService {

	Item save(Item item);

	List<Item> fetchCustomersList();

	Item fetchItemById(Long id);

	void deleteItemById(Long id);

	Item updateShopdetails(Item item);

}

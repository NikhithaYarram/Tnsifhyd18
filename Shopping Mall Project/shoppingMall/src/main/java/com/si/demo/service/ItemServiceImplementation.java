package com.si.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Item;
import com.si.demo.repository.ItemRepository;

@Service
public class ItemServiceImplementation implements ItemService {
@Autowired
ItemRepository i1;

@Override
public Item save(Item item) {
	// TODO Auto-generated method stub
	return i1.save(item);
}

@Override
public List<Item> fetchCustomersList() {
	// TODO Auto-generated method stub
	return i1.findAll();
}

@Override
public Item fetchItemById(Long id) {
	// TODO Auto-generated method stub
	return i1.findById(id).get();
}

@Override
public void deleteItemById(Long id) {
	// TODO Auto-generated method stub
	i1.deleteById(id);
}

@Override
public Item updateShopdetails(Item item) {
	// TODO Auto-generated method stub
	return i1.save(item);
}
	
	
}

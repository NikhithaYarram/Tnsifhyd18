package com.si.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Item;
import com.si.demo.service.ItemService;

@RestController
public class ItemController {
@Autowired
ItemService s1;

@PostMapping("/items")
public Item saveItem(@RequestBody Item item) {
	       
	        return s1.save(item);
	    }

@GetMapping("/items")
public List<Item> fetchItemList() {
    //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
    return s1.fetchCustomersList();
}

@GetMapping("/items/{id}")
public Item fetchItemById(@PathVariable("id") Long id)
        {
    return s1.fetchItemById(id);
}

@DeleteMapping("/items/{id}")
public String ItemById(@PathVariable("id") Long id) {
    s1.deleteItemById(id);
    return "Department deleted Successfully!!";
}
@PutMapping("/items/{id}")
public Item updateShopDetails(@RequestBody Item item) {
    return s1.updateShopdetails(item);
}

}
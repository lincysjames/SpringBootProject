package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Item;
import com.example.demo.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService service;
	@PostMapping("/addItem")
	public Item addItem(@RequestBody Item item) {
		return service.saveItem(item);
	}
	@PostMapping("/addItems")
	public List<Item> addItems(@RequestBody List<Item> items) {
		return service.saveItems(items);
	}
	@GetMapping("/item/{itemid}")
	public Item findItemById(@PathVariable int itemid) {
		return service.getItemById(itemid);
	}
	@GetMapping("/items")
	public List<Item> findAllItems(){
		return service.getItems();
	}
	@GetMapping("/itemsByIds/{ids}")
	public List<Item> findAllItemsById(@PathVariable List<Integer> ids){
		return service.getItemsByIds(ids);
	}
	@DeleteMapping("/delete/{itemid}")
	public String deleteItem(@PathVariable int itemid) {
		return service.deleteItem(itemid);
	}

}

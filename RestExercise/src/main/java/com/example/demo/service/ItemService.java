
package com.example.demo.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Item;
import com.example.demo.repository.ItemRepository;


	@Service
	public class ItemService {
		@Autowired private ItemRepository repository;
		
		public Item saveItem(Item item) {
		
			return repository.save(item);
		
		}
	
		public List<Item> saveItems(List<Item> item) {
			return repository.saveAll(item);
		}
		
		//get item by id
		public Item getItemById(int itemid) {
			return repository.findById(itemid).orElse(null);
		}
		//get items by ids
		public List<Item> getItemsByIds(List<Integer> ids) {
			return repository.findAllById(ids);
			//return repository.findByItemsIds(ids);
		}
		//get all items
		public List<Item> getItems() {
			
			List<Item> item = repository.findAll();
			//sort by highest price
			List<Item> sortedlist = item.stream().sorted(Comparator.comparing(Item::getPrice).reversed()).collect(Collectors.toList());
			return sortedlist;
		}
		//delete by id
		public String deleteItem(int itemid) {
			repository.deleteById(itemid);
			return "item removed "+itemid;
		}
		
	}

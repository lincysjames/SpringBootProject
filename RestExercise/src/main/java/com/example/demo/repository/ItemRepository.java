package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Item;

public interface ItemRepository extends JpaRepository<Item,Integer>{
	/*
	 * @Query( "select * from Items where itemid in :ids" ) List<Item>
	 * findByItemsIds(@Param("ids") List<Integer> list);
	 */


}

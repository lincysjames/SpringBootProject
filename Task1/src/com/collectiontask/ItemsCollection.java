package com.collectiontask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ItemsCollection {
	int itemId;    
	String shortDescription,brand; 
	Double price;
	public ItemsCollection(int itemId, String shortDescription, String brand, Double price) {    
	    this.itemId = itemId;    
	    this.shortDescription = shortDescription;    
	    this.brand = brand;    
	    this.price = price;    
	}   
	
	

	public String getBrand() {
		return brand;
	}

	public Double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "ItemsCollection [itemId=" + itemId + ", shortDescription=" + shortDescription + ", brand=" + brand
				+ ", price=" + price + "]";
	}

	public static void main(String[] args) {
		
		//2. Define a collection
		 List<ItemsCollection> itemlist=new ArrayList<ItemsCollection>();   
		 ItemsCollection i1=new ItemsCollection(1,"Mobile","Iphone",90000.00);    
		 ItemsCollection i2=new ItemsCollection(2,"Television","Samsung",17000.00);  
		 ItemsCollection i3=new ItemsCollection(3,"Watch","Titan",9000.00); 
		 ItemsCollection i4=new ItemsCollection(4,"Watch","Timex",8000.00);  


		 //Adding ItemsCollection to map   
		 itemlist.add(i1);  
		 itemlist.add(i2);  
		 itemlist.add(i3);  
		 itemlist.add(i4);  

		   
		    
		 //3. Filter items by brands starts with "T".
		 List<ItemsCollection> filteredlist = itemlist.stream().filter((ItemsCollection)->ItemsCollection.getBrand().startsWith("T")).collect(Collectors.toList());
		 System.out.println("Items by brands starts with T");
		 filteredlist.forEach(System.out::println);  
		 
		 //4.Sort by highest price. (i.e., descending order of price).
		 List<ItemsCollection> sortedlist = itemlist.stream().sorted(Comparator.comparingDouble(ItemsCollection::getPrice).reversed()).collect(Collectors.toList());
		 System.out.println("Sort by highest price:");
		 sortedlist.forEach(System.out::println);  
	
	}

}

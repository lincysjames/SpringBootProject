package com.example.demo.entity;
	import java.math.BigDecimal;

import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;

	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.Getter;
	import lombok.NoArgsConstructor;
	import lombok.Setter;

	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	@Entity        //model class
	@Table(name="items")
	public class Item {
		
		@Id
		@GeneratedValue

		private int itemid;
		private String description;
		private BigDecimal price;
		private String brand;
		public int getItemid() {
			return itemid;
		}
		public void setItemid(int itemid) {
			this.itemid = itemid;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}

		
	}

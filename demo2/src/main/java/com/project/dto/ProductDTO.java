package com.project.dto;

public class ProductDTO {


	        private Integer id;
			public Integer getId() {
				return id;
			}
			public void setId(Integer id) {
				this.id = id;
			}
			private Integer price;
			private String type;
			private String name;
			private Integer category;
			public Integer getPrice() {
				return price;
			}
			public void setPrice(Integer price) {
				this.price = price;
			}
			public String getType() {
				return type;
			}
			public void setType(String type) {
				this.type = type;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public Integer getCategory() {
				return category;
			}
			public void setCategory(Integer category) {
				this.category = category;
			}
			@Override
			public String toString() {
				return "Products [price=" + price + ", type=" + type + ", name=" + name + ", category=" + category + "]";
			}
			
			
	}



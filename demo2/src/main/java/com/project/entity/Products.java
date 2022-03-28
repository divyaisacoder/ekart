package com.project.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
		public int hashCode() {
			return Objects.hash(category, id, name, price, type);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Products other = (Products) obj;
			return Objects.equals(category, other.category) && Objects.equals(id, other.id)
					&& Objects.equals(name, other.name) && Objects.equals(price, other.price)
					&& Objects.equals(type, other.type);
		}
		@Override
		public String toString() {
			return "Products [price=" + price + ", type=" + type + ", name=" + name + ", category=" + category + "]";
		}
		
		
}

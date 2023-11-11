package com.surabhichainrestaurant.foodorder.entity;


import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer foodId;
	private String name;
	private Integer price;
	private String  image;
	private String tag;
	public Integer getFoodId() {
		return foodId;
	}
	public void setFoodId(Integer foodId) {
		this.foodId = foodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	@Override
	public String toString() {
		return "Menu [foodId=" + foodId + ", name=" + name + ", price=" + price + ", image=" + image + ", tag=" + tag
				+ "]";
	}
	public Menu(Integer foodId, String name, Integer price, String image, String tag) {
		super();
		this.foodId = foodId;
		this.name = name;
		this.price = price;
		this.image = image;
		this.tag = tag;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}

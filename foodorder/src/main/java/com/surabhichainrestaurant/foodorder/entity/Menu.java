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
	@ElementCollection
	@Lob
	private List<byte[]> image;

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

	public List<byte[]> getImage() {
		return image;
	}

	public void setImage(List<byte[]> image) {
		this.image = image;
	}

	public Menu(Integer foodId, String name, Integer price, List<byte[]> image) {
		super();
		this.foodId = foodId;
		this.name = name;
		this.price = price;
		this.image = image;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Menu [foodId=" + foodId + ", Name=" + name + ", price=" + price + ", image=" + image + "]";
	}

}

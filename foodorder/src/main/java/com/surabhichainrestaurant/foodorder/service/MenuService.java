package com.surabhichainrestaurant.foodorder.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.surabhichainrestaurant.foodorder.entity.Menu;
import com.surabhichainrestaurant.foodorder.entity.User;
import com.surabhichainrestaurant.foodorder.repo.MenuRepo;

@Service
public class MenuService {
	@Autowired
	MenuRepo repo;

	// Find all menu
	public List<Menu> getMenu() {

		List<Menu> menu = repo.findAll();
		return menu;
	}

	// Delete a menu item by its foodId from the database
	public void deleteMenu(Integer foodId) {
		repo.deleteById(foodId);
	}

	// saveing the menu
	public Menu saveMenu(Menu menu) {
		return repo.save(menu);
	}

	// finding by name of food
	public Menu findByName(String name) {
		Menu menu = repo.findByName(name);
		return menu;
	}

	// upading the menu
	public Menu updateMenu(Integer id, Menu menu) {

		Menu existingMenu = repo.findById(id).orElse(null);
		if (existingMenu != null) {
			existingMenu.setName(menu.getName());
			existingMenu.setPrice(menu.getPrice());
			existingMenu.setImage(menu.getImage());
			existingMenu.setTag(menu.getTag());
			repo.save(existingMenu);
			return existingMenu;
		} else {
			return null;
		}

	}

}

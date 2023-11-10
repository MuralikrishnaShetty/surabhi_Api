package com.surabhichainrestaurant.foodorder.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.surabhichainrestaurant.foodorder.entity.Menu;
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
	
	//saveing the menu
	  public Menu saveMenu(Menu menu, List<MultipartFile> files) throws IOException {
	        
	        List<byte[]> images = new ArrayList();

	        for (MultipartFile file : files) {
	            images.add(file.getBytes());
	        }

	        menu.setImage(images);
	        return repo.save(menu);
	    }
	  //finding by name of food
	  public Menu findByName(String name) {
		  Menu menu=repo.findByName(name);
		  return menu;
	  }

}

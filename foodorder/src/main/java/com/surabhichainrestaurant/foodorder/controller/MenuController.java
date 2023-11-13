package com.surabhichainrestaurant.foodorder.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.surabhichainrestaurant.foodorder.entity.Menu;
import com.surabhichainrestaurant.foodorder.service.MenuService;

@RestController
@RequestMapping("/menu")
@CrossOrigin(origins = "http://localhost:4200")
public class MenuController {
	@Autowired
	MenuService service;

	// getting all the menu
	@GetMapping("/menus")
	public ResponseEntity<List<Menu>> getMenu() {
		List<Menu> menu = service.getMenu();
		return  ResponseEntity.ok(menu);
	}

	// deleteing the menu
	@DeleteMapping("/delete/{foodId}")
	public ResponseEntity<String> deleteMenu(@PathVariable Integer foodId) {
		service.deleteMenu(foodId);
		return ResponseEntity.ok("Menu item deleted successfully.");

	}
	
	//saving the menu 
    @PostMapping("/add")
    public ResponseEntity<Menu> addMenu(@RequestBody Menu menu) {
       Menu store=service.saveMenu(menu);
       return ResponseEntity.ok(store);
       
    }
    //geting food by name 
    @GetMapping("/{name}")
    public ResponseEntity<Menu> findMenuByName(@PathVariable String name){
    	Menu menu=service.findByName(name);
    	return  ResponseEntity.ok(menu);
    }
    //updating user
    @PutMapping("/update/{id}")
    public ResponseEntity<Menu> updateMenu(@PathVariable Integer id,@RequestBody Menu menu){
    	Menu updatedMenu=service.updateMenu(id, menu);
    	return ResponseEntity.ok(updatedMenu);
    }

}

package com.surabhichainrestaurant.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surabhichainrestaurant.foodorder.entity.Menu;

public interface MenuRepo extends JpaRepository<Menu,Integer> {

	Menu findByName(String name);

}

package com.surabhichainrestaurant.foodorder.repo;

import org.springframework.data.jpa.repository.JpaRepository;
//
import com.surabhichainrestaurant.foodorder.entity.User;

public interface UserRepo extends JpaRepository<User,Long> {

//	User findByEmailIdAndPassword(String email, String password);
	User findByEmailAndPassword(String email, String password);
//	User findByEmail(String email);
	


}

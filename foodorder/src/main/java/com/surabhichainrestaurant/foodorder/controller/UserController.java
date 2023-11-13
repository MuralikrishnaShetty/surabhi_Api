package com.surabhichainrestaurant.foodorder.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
//
import com.surabhichainrestaurant.foodorder.entity.User;
import com.surabhichainrestaurant.foodorder.entity.UserLoginRequest;
//import com.surabhichainrestaurant.foodorder.entity.UserLoginRequest;
//import com.surabhichainrestaurant.foodorder.jwttokenutil.JwtTokenUtil;
//import com.surabhichainrestaurant.foodorder.repo.UserRepo;
import com.surabhichainrestaurant.foodorder.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService service;

	// register
	@PostMapping("/register")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User responseUser = service.addUser(user);
		return ResponseEntity.ok(responseUser);
	}

	// login
	@PostMapping("/login")
	public ResponseEntity<User> validate(@RequestBody UserLoginRequest request) {
		User res = service.findUser(request);
		return ResponseEntity.ok(res);
	}

	// Delete
	@SuppressWarnings("static-access")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable Long id) {
		try {
			System.out.println("Deleting user with ID: " + id);

			// Call your service method to delete the user by ID
			// Assuming "service" is an instance of your user service class
			service.deleteUser(id);

			// Respond with a success message
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			// Log the exception for debugging purposes
			e.printStackTrace();

			// Respond with an error message
			return ResponseEntity.badRequest().build();		}
	}

	// update
	@PutMapping("/update/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
		try {
			User user = service.updateUser(id, updatedUser);
			return ResponseEntity.ok(user);
		} catch (Exception e) {

		}
		return null;
	}

	// get all user
	@GetMapping("/getall")
	public ResponseEntity<List<User>> getalluser() {
		List<User> user = service.alluser();
		return ResponseEntity.ok(user);
	}

}

//    @Autowired
//    private UserRepo userRepository;
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//
//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//    
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/login")
//    public String login(@RequestBody UserLoginRequest loginRequest) {
//        User user = userRepository.findByEmail(loginRequest.getEmail());
//
//        if (user != null && passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
//            // Authentication successful, generate JWT token
//            String token = jwtTokenUtil.generateToken(loginRequest.getEmail());
//            return token;
//        } else {
//            // Authentication failed
//            return "Invalid email or password.";
//        }
//    }
//    
//    @PostMapping("/register")
//    public ResponseEntity<String> registerUser(@RequestBody User user) {
//        // Perform validation on the user data if necessary
//        userService.registerUser(user);
//        return ResponseEntity.ok("User registered successfully!");
//    }

package com.user.service.userservice.controller;

import com.user.service.userservice.entities.HotelService;
import com.user.service.userservice.entities.User;
import com.user.service.userservice.service.UserService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;

    @GetMapping
    public ResponseEntity<List<User>> getAllUser() {
   //     List<User> userList= getAll();
        List<User> userList=  this.userService.getAllUsers();
        return ResponseEntity.status(HttpStatus.CREATED).body(userList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HotelService> createUser(@PathVariable Long id) {
        HotelService user = this.userService.getUser(id);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
    
    private List<User> getAll(){
    	List<User> response = new ArrayList<>();
    	response.add(new User(1l, "Nitesh", "nitesh@gmail.com", "6565678788"));
    	response.add(new User(2l, "Dinesh", "dinesh@gmail.com", "2434243243"));
    	response.add(new User(3l, "Surender", "surender@gmail.com", "1231234243"));
    	return response;
    }
    
    private User getById(Long id) {
    	return getAll().stream().filter(user -> user.getId().equals(id)).findFirst().get();
    }
}

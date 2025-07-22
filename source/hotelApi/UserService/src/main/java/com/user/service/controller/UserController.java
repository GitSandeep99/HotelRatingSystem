package com.user.service.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.service.entity.User;
import com.user.service.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		User createUser = this.userService.createUser(user);
		return createUser;

	}

	@GetMapping("/list")
	public List<User> getListOfUser() {
		List<User> list = this.userService.getUserList();
		return list;

	}

	@GetMapping("/{userId}") 
	public User getListOfUser(@PathVariable String userId) {
		 User userById = this.userService.getUserById(userId);
		return userById;

	}

}

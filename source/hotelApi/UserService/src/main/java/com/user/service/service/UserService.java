package com.user.service.service;

import java.util.List;
import java.util.Optional;

import com.user.service.entity.User;

public interface UserService {
	
	public List<User> getUserList();
	public User createUser(User user);
	public User getUserById(String  userId);
	
	
	
	

}

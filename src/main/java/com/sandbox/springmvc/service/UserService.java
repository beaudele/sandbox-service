package com.sandbox.springmvc.service;

import java.util.List;

import com.sandbox.springmvc.model.RegisteredUser;



public interface UserService {
	
	RegisteredUser findById(Long id);
	
	RegisteredUser findByName(String name);
	
	void saveUser(RegisteredUser user);
	
	void updateUser(RegisteredUser user);
	
	void deleteUserById(Long id);

	List<RegisteredUser> findAllUsers(); 
	
	void deleteAllUsers();
	
	public boolean isUserExist(RegisteredUser user);
	
}

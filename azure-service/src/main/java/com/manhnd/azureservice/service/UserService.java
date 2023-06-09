package com.manhnd.azureservice.service;

import java.util.List;

import com.manhnd.azureservice.entities.UserEntity;

public interface UserService {
	
	List<UserEntity> getAllUsers();

}

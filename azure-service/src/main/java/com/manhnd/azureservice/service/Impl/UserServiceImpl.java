package com.manhnd.azureservice.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manhnd.azureservice.entities.UserEntity;
import com.manhnd.azureservice.repository.UserRepository;
import com.manhnd.azureservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public List<UserEntity> getAllUsers() {
		return userRepo.findAll();
	}

}

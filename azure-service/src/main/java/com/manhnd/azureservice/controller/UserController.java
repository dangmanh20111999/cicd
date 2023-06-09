package com.manhnd.azureservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manhnd.azureservice.service.UserService;

@RestController
@RequestMapping("api/v1/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllUsers() {
		return ResponseEntity.ok().body(userService.getAllUsers());
	}
}

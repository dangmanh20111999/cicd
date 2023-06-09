package com.manhnd.azureservice.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class UserEntity {

	@Id
	private String ids;
	private String firstname;
	private String lastname;
	private String email;
	private int phonenumber;
	private String authoritynames;
	private String username;
	private String password;
	private String address;
}

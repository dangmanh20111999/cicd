package com.manhnd.azureservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manhnd.azureservice.entities.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String>{

}

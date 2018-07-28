package com.andrews.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.andrews.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	public User findByEmail(String email);
}

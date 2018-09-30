package com.mediplus.mediplus.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.mediplus.mediplus.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	@Query("{email :'?0' }")
	public User findUserByEmail(String email);

}

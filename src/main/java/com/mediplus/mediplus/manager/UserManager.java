package com.mediplus.mediplus.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import com.mediplus.mediplus.exception.BadRequestException;
import com.mediplus.mediplus.model.User;
import com.mediplus.mediplus.repositories.UserRepository;

@Service
public class UserManager {
	
	@Autowired
	private CacheManager cacheManager;

	@Autowired
	private UserRepository userRepo;

	public User saveUser(User user) {

		try {
			userRepo.save(user);
			return user;
		} catch (Exception e) {
			throw new BadRequestException("invalid payload");
		}
	}

	public User getLoggedInUser(String email, String password) {

		User user = userRepo.findUserByEmail(email);

		if (user == null || !user.getPassword().equals(password)) {
			throw new BadRequestException("no user found");
		}
		return user;
	}

	public List<User> getUser() {
		System.out.println("fromDb");
		

		return userRepo.findAll();
	}

}

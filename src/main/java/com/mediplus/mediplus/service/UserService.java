package com.mediplus.mediplus.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mediplus.mediplus.manager.UserManager;
import com.mediplus.mediplus.model.User;
import com.mediplus.mediplus.model.UserRequest;

@Service
public class UserService {

	@Autowired
	private UserManager userManager;

	public User LoginSignUp(UserRequest userRequest) {

		if (userRequest.getLogin() == 0) {
			User user = setUser(userRequest);
			userManager.saveUser(user);
			return user;
		} else {
			return userManager.getLoggedInUser(userRequest.getEmail(), userRequest.getPassword());
		}

	}

	private User setUser(UserRequest userRequest) {
		User user = new User();
		user.setUserId(UUID.randomUUID().toString());
		user.setEmail(userRequest.getEmail());
		user.setPassword(userRequest.getPassword());
		user.setUserName(userRequest.getUserName());
		user.setFavClinic(new ArrayList<>());
		user.setFavDoctor(new ArrayList<>());
		user.setFavHospital(new ArrayList<>());
		user.setReviews(new ArrayList<>());
		return user;
	}

	@Cacheable(value = "users")
	public List<User> getUser() {
		return userManager.getUser();
	}

}

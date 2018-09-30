package com.mediplus.mediplus.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.mediplus.mediplus.exception.BadRequestException;
import com.mediplus.mediplus.model.User;
import com.mediplus.mediplus.model.UserRequest;
import com.mediplus.mediplus.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private Gson gson;
	
	@Autowired
	private CacheManager cacheManager;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User doLogin(@RequestBody @Valid UserRequest userRequest,BindingResult result) {

		if (result.hasErrors()) {
			throw new BadRequestException("invalid payload");
		}
		
		return userService.LoginSignUp(userRequest);
	}
	
	
	
	@RequestMapping(value="/getUsers", method = RequestMethod.GET)
	public List<User> getUsers(){
		
		cacheManager.getCacheNames().parallelStream().forEach(name -> System.out.println(gson.toJson(cacheManager.getCache("users"))));
		return userService.getUser();
	}

}

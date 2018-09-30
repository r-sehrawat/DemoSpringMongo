package com.mediplus.mediplus.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public String check(@RequestParam("hotelIds") List<String> hotelIds) {
		System.out.println(hotelIds.size());
		return "pong";
	}

}

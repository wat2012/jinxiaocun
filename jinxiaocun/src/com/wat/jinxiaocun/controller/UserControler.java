package com.wat.jinxiaocun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wat.jinxiaocun.beans.User;
import com.wat.jinxiaocun.service.UserService;

@Controller
@RequestMapping("/user")
public class UserControler {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/reg/{username}/{passowrd}", method = RequestMethod.GET)
	public @ResponseBody User reg(@PathVariable String username,
			@PathVariable String passowrd) {
		User user = new User();
		user.setPassword(passowrd);
		user.setUsername(username);
		userService.regUser(user);
		return user;
	}
}

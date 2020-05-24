package com.bfh.mycat.controller;

import com.bfh.mycat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

	@Autowired
	UserService userService;

	@PostMapping("test01")
	public String test01() {
		userService.test01();
		return "ok";
	}

	@PostMapping("test02")
	public String test02() {
		userService.test02();
		return "ok";
	}

}


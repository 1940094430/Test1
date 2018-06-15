package com.lzy.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.lzy.service.UserService;

@Controller
public class UserAction {
	
	private UserService userService;
	/**
	 *  userService的set方法
	 */
	public void save(){
		//调用userService中的save方法
		this.userService.save();
		System.out.println("userAction————————save————————");
	}
}

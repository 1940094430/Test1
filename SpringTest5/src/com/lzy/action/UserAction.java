package com.lzy.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.lzy.service.UserService;

@Controller
public class UserAction {
	
	private UserService userService;
	/**
	 *  userService��set����
	 */
	public void save(){
		//����userService�е�save����
		this.userService.save();
		System.out.println("userAction����������������save����������������");
	}
}

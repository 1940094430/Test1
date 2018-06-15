package com.lzy.service;

import javax.annotation.Resource;

import com.lzy.impl.UserDaoimpl;
import com.lzy.impl.UserServiceimpl;

public class UserService implements UserServiceimpl {
	@Resource(name="userDaoimpl")
	private UserDaoimpl UserDaoimpl;
	
	

	public void setUserDaoimpl(UserDaoimpl userDaoimpl) {
		UserDaoimpl = userDaoimpl;
	}



	public void save() {
		// TODO Auto-generated method stub
		this.UserDaoimpl.save();
		System.out.println("UserService！！！！！！save");
	}

}

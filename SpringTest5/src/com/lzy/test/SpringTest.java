package com.lzy.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lzy.dao.UserDao;

public class SpringTest {
	
	UserDao userDao;
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	@Test
	public void test1(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans6.xml");
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
		System.out.println(userDao);
		userDao.save();
	}
}

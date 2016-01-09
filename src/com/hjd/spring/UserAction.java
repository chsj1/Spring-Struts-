package com.hjd.spring;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component("userAction")
public class UserAction extends ActionSupport{
	
	@Resource(name="userService")
	private UserService userService;
	
	
	public UserService getUserService() {
		return userService;
	}


	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	@Override
	public String execute(){
		userService.save();
		System.out.println("------>∑√Œ ¡Àaction");
		return SUCCESS;
	}
}

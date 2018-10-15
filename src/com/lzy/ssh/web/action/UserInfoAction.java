package com.lzy.ssh.web.action;

import com.lzy.ssh.domain.UserInfo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UserInfoAction extends ActionSupport implements ModelDriven<UserInfo>{
	
	private String username;
	public void setUsername(String username) {
		this.username = username;
	}



	private UserInfo userInfo = new UserInfo();
	@Override
	public UserInfo getModel() {
		// TODO Auto-generated method stub
		return userInfo;
	}



	public String save(){
		
		System.out.println(username);
		System.out.println(userInfo.toString());
		return NONE;
	}

}

package com.lzy.ssh.domain;

public class UserInfo {
	
	private String username;
	private Integer userpassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(Integer userpassword) {
		this.userpassword = userpassword;
	}
	@Override
	public String toString() {
		return "UserInfo [username=" + username + ", userpassword=" + userpassword + "]";
	}
	

}

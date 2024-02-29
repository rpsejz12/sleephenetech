package com.sleephenetech.app.admin.model;

import org.apache.ibatis.type.Alias;


@Alias("AdminVO")
public class AdminVO {
	private int USER_NO;
	private String USER_ID;
	private String USER_PW;
	
	
	public int getUSER_NO() {
		return USER_NO;
	}
	public void setUSER_NO(int USER_NO) {
		this.USER_NO = USER_NO;
	}
	public String getUSER_ID() {
		return USER_ID;
	}
	public void setUSER_ID(String USER_ID) {
		this.USER_ID = USER_ID;
	}
	public String getUSER_PW() {
		return USER_PW;
	}
	public void setUSER_PW(String USER_PW) {
		this.USER_PW = USER_PW;
	}
	


}

package com.sleephenetech.app.mail.model;

import org.apache.ibatis.type.Alias;


@Alias("MailVO")
public class MailVO {

	
	private int MAIL_TITLE_NO;
	private int MAIL_RECEIVE_NO;
	private int MAIL_BODY_NO;
	private String MAIL_TITLE;
	private String MAIL_RECEIVE;
	private String MAIL_BODY;
	public int getMAIL_TITLE_NO() {
		return MAIL_TITLE_NO;
	}
	public void setMAIL_TITLE_NO(int MAIL_TITLE_NO) {
		this.MAIL_TITLE_NO = MAIL_TITLE_NO;
	}
	public int getMAIL_RECEIVE_NO() {
		return MAIL_RECEIVE_NO;
	}
	public void setMAIL_RECEIVE_NO(int MAIL_RECEIVE_NO) {
		this.MAIL_RECEIVE_NO = MAIL_RECEIVE_NO;
	}
	public int getMAIL_BODY_NO() {
		return MAIL_BODY_NO;
	}
	public void setMAIL_BODY_NO(int MAIL_BODY_NO) {
		this.MAIL_BODY_NO = MAIL_BODY_NO;
	}
	public String getMAIL_TITLE() {
		return MAIL_TITLE;
	}
	public void setMAIL_TITLE(String MAIL_TITLE) {
		this.MAIL_TITLE = MAIL_TITLE;
	}
	public String getMAIL_RECEIVE() {
		return MAIL_RECEIVE;
	}
	public void setMAIL_RECEIVE(String MAIL_RECEIVE) {
		this.MAIL_RECEIVE = MAIL_RECEIVE;
	}
	public String getMAIL_BODY() {
		return MAIL_BODY;
	}
	public void setMAIL_BODY(String MAIL_BODY) {
		this.MAIL_BODY = MAIL_BODY;
	}
	
	
	@Override
	public String toString() {
		return "MailVO [MAIL_TITLE_NO=" + MAIL_TITLE_NO + ", MAIL_RECEIVE_NO=" + MAIL_RECEIVE_NO + ", MAIL_BODY_NO="
				+ MAIL_BODY_NO + ", MAIL_TITLE=" + MAIL_TITLE + ", MAIL_RECEIVE=" + MAIL_RECEIVE + ", MAIL_BODY="
				+ MAIL_BODY + "]";
	}

	

	

}

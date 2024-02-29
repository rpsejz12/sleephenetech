package com.sleephenetech.app.code.model;

import org.apache.ibatis.type.Alias;


@Alias("CodeVO")
public class CodeVO {
	private int CODE_NO;
	private int CODE_IDX;
	private String CODE_TYPE;
	private String CODE_NAME;
	private String CODE_VALUE;
	private String CODE_EXPL;
	private String USE_FLAG;
	private String CODE_REF;
	
	
	
	public int getCODE_NO() {
		return CODE_NO;
	}
	public void setCODE_NO(int CODE_NO) {
		this.CODE_NO = CODE_NO;
	}
	public String getCODE_TYPE() {
		return CODE_TYPE;
	}
	public void setCODE_TYPE(String CODE_TYPE) {
		this.CODE_TYPE = CODE_TYPE;
	}
	public String getCODE_NAME() {
		return CODE_NAME;
	}
	public void setCODE_NAME(String CODE_NAME) {
		this.CODE_NAME = CODE_NAME;
	}
	public String getCODE_VALUE() {
		return CODE_VALUE;
	}
	public void setCODE_VALUE(String CODE_VALUE) {
		this.CODE_VALUE = CODE_VALUE;
	}
	public int getCODE_IDX() {
		return CODE_IDX;
	}
	public void setCODE_IDX(int CODE_IDX) {
		this.CODE_IDX = CODE_IDX;
	}
	public String getCODE_EXPL() {
		return CODE_EXPL;
	}
	public void setCODE_EXPL(String CODE_EXPL) {
		this.CODE_EXPL = CODE_EXPL;
	}
	public String getUSE_FLAG() {
		return USE_FLAG;
	}
	public void setUSE_FLAG(String USE_FLAG) {
		this.USE_FLAG = USE_FLAG;
	}
	public String getCODE_REF() {
		return CODE_REF;
	}
	public void setCODE_REF(String CODE_REF) {
		this.CODE_REF = CODE_REF;
	}
	
	@Override
	public String toString() {
		return "CodeVO [CODE_NO=" + CODE_NO + ", CODE_TYPE=" + CODE_TYPE + ", CODE_NAME=" + CODE_NAME + ", CODE_VALUE="
				+ CODE_VALUE + "]";
	}
}

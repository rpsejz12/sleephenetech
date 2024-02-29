package com.sleephenetech.app.comp.model;

import org.apache.ibatis.type.Alias;


@Alias("CompVO")
public class CompVO {

	
	private int COMP_EMAIL_NO;
	private int COMP_TEL_NO;
	private int COMP_ADRS_NO;
	private int COMP_INSTA_NO;
	private int COMP_TWIT_NO;
	private int COMP_HPAGE_NO;
	private int COMP_FACEB_NO;
	private String COMP_EMAIL;
	private String COMP_TEL;
	private String COMP_ADRS;
	private String COMP_INSTA;
	private String COMP_TWIT;
	private String COMP_HPAGE;
	private String COMP_FACEB;
	private String COMP_EMAIL_FLAG;
	private String COMP_TEL_FLAG;
	private String COMP_ADRS_FLAG;
	private String COMP_INSTA_FLAG;
	private String COMP_TWIT_FLAG;
	private String COMP_HPAGE_FLAG;
	private String COMP_FACEB_FLAG;
	
	
	public int getCOMP_EMAIL_NO() {
		return COMP_EMAIL_NO;
	}
	public void setCOMP_EMAIL_NO(int COMP_EMAIL_NO) {
		this.COMP_EMAIL_NO = COMP_EMAIL_NO;
	}
	public int getCOMP_TEL_NO() {
		return COMP_TEL_NO;
	}
	public void setCOMP_TEL_NO(int COMP_TEL_NO) {
		this.COMP_TEL_NO = COMP_TEL_NO;
	}
	public int getCOMP_ADRS_NO() {
		return COMP_ADRS_NO;
	}
	public void setCOMP_ADRS_NO(int COMP_ADRS_NO) {
		this.COMP_ADRS_NO = COMP_ADRS_NO;
	}
	public int getCOMP_INSTA_NO() {
		return COMP_INSTA_NO;
	}
	public void setCOMP_INSTA_NO(int COMP_INSTA_NO) {
		this.COMP_INSTA_NO = COMP_INSTA_NO;
	}
	public int getCOMP_TWIT_NO() {
		return COMP_TWIT_NO;
	}
	public void setCOMP_TWIT_NO(int COMP_TWIT_NO) {
		this.COMP_TWIT_NO = COMP_TWIT_NO;
	}
	public int getCOMP_HPAGE_NO() {
		return COMP_HPAGE_NO;
	}
	public void setCOMP_HPAGE_NO(int COMP_HPAGE_NO) {
		this.COMP_HPAGE_NO = COMP_HPAGE_NO;
	}
	public int getCOMP_FACEB_NO() {
		return COMP_FACEB_NO;
	}
	public void setCOMP_FACEB_NO(int COMP_FACEB_NO) {
		this.COMP_FACEB_NO = COMP_FACEB_NO;
	}
	public String getCOMP_EMAIL() {
		return COMP_EMAIL;
	}
	public void setCOMP_EMAIL(String COMP_EMAIL) {
		this.COMP_EMAIL = COMP_EMAIL;
	}
	public String getCOMP_TEL() {
		return COMP_TEL;
	}
	public void setCOMP_TEL(String COMP_TEL) {
		this.COMP_TEL = COMP_TEL;
	}
	public String getCOMP_ADRS() {
		return COMP_ADRS;
	}
	public void setCOMP_ADRS(String COMP_ADRS) {
		this.COMP_ADRS = COMP_ADRS;
	}
	public String getCOMP_INSTA() {
		return COMP_INSTA;
	}
	public void setCOMP_INSTA(String COMP_INSTA) {
		this.COMP_INSTA = COMP_INSTA;
	}
	public String getCOMP_TWIT() {
		return COMP_TWIT;
	}
	public void setCOMP_TWIT(String COMP_TWIT) {
		this.COMP_TWIT = COMP_TWIT;
	}
	public String getCOMP_HPAGE() {
		return COMP_HPAGE;
	}
	public void setCOMP_HPAGE(String COMP_HPAGE) {
		this.COMP_HPAGE = COMP_HPAGE;
	}
	public String getCOMP_FACEB() {
		return COMP_FACEB;
	}
	public void setCOMP_FACEB(String COMP_FACEB) {
		this.COMP_FACEB = COMP_FACEB;
	}
	public String getCOMP_EMAIL_FLAG() {
		return COMP_EMAIL_FLAG;
	}
	public void setCOMP_EMAIL_FLAG(String COMP_EMAIL_FLAG) {
		this.COMP_EMAIL_FLAG = COMP_EMAIL_FLAG;
	}
	public String getCOMP_TEL_FLAG() {
		return COMP_TEL_FLAG;
	}
	public void setCOMP_TEL_FLAG(String COMP_TEL_FLAG) {
		this.COMP_TEL_FLAG = COMP_TEL_FLAG;
	}
	public String getCOMP_ADRS_FLAG() {
		return COMP_ADRS_FLAG;
	}
	public void setCOMP_ADRS_FLAG(String COMP_ADRS_FLAG) {
		this.COMP_ADRS_FLAG = COMP_ADRS_FLAG;
	}
	public String getCOMP_INSTA_FLAG() {
		return COMP_INSTA_FLAG;
	}
	public void setCOMP_INSTA_FLAG(String COMP_INSTA_FLAG) {
		this.COMP_INSTA_FLAG = COMP_INSTA_FLAG;
	}
	public String getCOMP_TWIT_FLAG() {
		return COMP_TWIT_FLAG;
	}
	public void setCOMP_TWIT_FLAG(String COMP_TWIT_FLAG) {
		this.COMP_TWIT_FLAG = COMP_TWIT_FLAG;
	}
	public String getCOMP_HPAGE_FLAG() {
		return COMP_HPAGE_FLAG;
	}
	public void setCOMP_HPAGE_FLAG(String COMP_HPAGE_FLAG) {
		this.COMP_HPAGE_FLAG = COMP_HPAGE_FLAG;
	}
	public String getCOMP_FACEB_FLAG() {
		return COMP_FACEB_FLAG;
	}
	public void setCOMP_FACEB_FLAG(String COMP_FACEB_FLAG) {
		this.COMP_FACEB_FLAG = COMP_FACEB_FLAG;
	}
	@Override
	public String toString() {
		return "CompVO [COMP_EMAIL_NO=" + COMP_EMAIL_NO + ", COMP_TEL_NO=" + COMP_TEL_NO + ", COMP_ADRS_NO="
				+ COMP_ADRS_NO + ", COMP_INSTA_NO=" + COMP_INSTA_NO + ", COMP_TWIT_NO=" + COMP_TWIT_NO
				+ ", COMP_HPAGE_NO=" + COMP_HPAGE_NO + ", COMP_FACEB_NO=" + COMP_FACEB_NO + ", COMP_EMAIL=" + COMP_EMAIL
				+ ", COMP_TEL=" + COMP_TEL + ", COMP_ADRS=" + COMP_ADRS + ", COMP_INSTA=" + COMP_INSTA + ", COMP_TWIT="
				+ COMP_TWIT + ", COMP_HPAGE=" + COMP_HPAGE + ", COMP_FACEB=" + COMP_FACEB + ", COMP_EMAIL_FLAG="
				+ COMP_EMAIL_FLAG + ", COMP_TEL_FLAG=" + COMP_TEL_FLAG + ", COMP_ADRS_FLAG=" + COMP_ADRS_FLAG
				+ ", COMP_INSTA_FLAG=" + COMP_INSTA_FLAG + ", COMP_TWIT_FLAG=" + COMP_TWIT_FLAG + ", COMP_HPAGE_FLAG="
				+ COMP_HPAGE_FLAG + ", COMP_FACEB_FLAG=" + COMP_FACEB_FLAG + "]";
	}
	
	

}

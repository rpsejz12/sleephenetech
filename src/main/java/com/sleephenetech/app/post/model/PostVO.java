package com.sleephenetech.app.post.model;

import org.apache.ibatis.type.Alias;
import org.springframework.web.multipart.MultipartFile;


@Alias("PostVO")
public class PostVO {
	private int POST_NO;
	private String POST_TITLE;
	private String POST_TYPE;
	private String POST_TXT;
	private String POST_IMG;
	private String POST_ORIGIN_IMG;
	private String POST_IMG_TXT;
	private MultipartFile POST_IMG_FILE;
	
	
	private int STYLE_NO;
	private String STYLE_FONT1;
	private int STYLE_SIZE1;
	private String STYLE_WEIGHT1;
	private int STYLE_SPACE1;
	private String STYLE_FONT2;
	private int STYLE_SIZE2;
	private String STYLE_WEIGHT2;
	private int STYLE_SPACE2;
	
	
	public int getPOST_NO() {
		return POST_NO;
	}
	public void setPOST_NO(int POST_NO) {
		this.POST_NO = POST_NO;
	}
	public String getPOST_TITLE() {
		return POST_TITLE;
	}
	public void setPOST_TITLE(String POST_TITLE) {
		this.POST_TITLE = POST_TITLE;
	}
	public String getPOST_TYPE() {
		return POST_TYPE;
	}
	public void setPOST_TYPE(String POST_TYPE) {
		this.POST_TYPE = POST_TYPE;
	}
	public String getPOST_TXT() {
		return POST_TXT;
	}
	public void setPOST_TXT(String POST_TXT) {
		this.POST_TXT = POST_TXT;
	}
	public String getPOST_IMG() {
		return POST_IMG;
	}
	public void setPOST_IMG(String POST_IMG) {
		this.POST_IMG = POST_IMG;
	}
	public String getPOST_IMG_TXT() {
		return POST_IMG_TXT;
	}
	public void setPOST_IMG_TXT(String POST_IMG_TXT) {
		this.POST_IMG_TXT = POST_IMG_TXT;
	}
	public MultipartFile getPOST_IMG_FILE() {
		return POST_IMG_FILE;
	}
	public void setPOST_IMG_FILE(MultipartFile POST_IMG_FILE) {
		this.POST_IMG_FILE = POST_IMG_FILE;
	}
	public String getPOST_ORIGN_IMG() {
		return POST_ORIGIN_IMG;
	}
	public void setPOST_ORIGIN_IMG(String POST_ORIGIN_IMG) {
		this.POST_ORIGIN_IMG = POST_ORIGIN_IMG;
	}
	
	
	public int getSTYLE_NO() {
		return STYLE_NO;
	}
	public void setSTYLE_NO(int STYLE_NO) {
		this.STYLE_NO = STYLE_NO;
	}
	
	public String getSTYLE_FONT2() {
		return STYLE_FONT2;
	}
	public void setSTYLE_FONT2(String STYLE_FONT2) {
		this.STYLE_FONT2 = STYLE_FONT2;
	}
	public int getSTYLE_SIZE2() {
		return STYLE_SIZE2;
	}
	public void setSTYLE_SIZE2(int STYLE_SIZE2) {
		this.STYLE_SIZE2 = STYLE_SIZE2;
	}
	public String getSTYLE_WEIGHT2() {
		return STYLE_WEIGHT2;
	}
	public void setSTYLE_WEIGHT2(String STYLE_WEIGHT2) {
		this.STYLE_WEIGHT2 = STYLE_WEIGHT2;
	}
	public String getSTYLE_FONT1() {
		return STYLE_FONT1;
	}
	public void setSTYLE_FONT1(String STYLE_FONT1) {
		this.STYLE_FONT1 = STYLE_FONT1;
	}
	public int getSTYLE_SIZE1() {
		return STYLE_SIZE1;
	}
	public void setSTYLE_SIZE1(int STYLE_SIZE1) {
		this.STYLE_SIZE1 = STYLE_SIZE1;
	}
	public String getSTYLE_WEIGHT1() {
		return STYLE_WEIGHT1;
	}
	public void setSTYLE_WEIGHT1(String STYLE_WEIGHT1) {
		this.STYLE_WEIGHT1 = STYLE_WEIGHT1;
	}
	
	
	
	public int getSTYLE_SPACE1() {
		return STYLE_SPACE1;
	}
	public void setSTYLE_SPACE1(int STYLE_SPACE1) {
		this.STYLE_SPACE1 = STYLE_SPACE1;
	}
	public int getSTYLE_SPACE2() {
		return STYLE_SPACE2;
	}
	public void setSTYLE_SPACE2(int STYLE_SPACE2) {
		this.STYLE_SPACE2 = STYLE_SPACE2;
	}
	
	
	@Override
	public String toString() {
		return "PostVO [POST_NO=" + POST_NO + ", POST_TITLE=" + POST_TITLE + ", POST_TYPE=" + POST_TYPE + ", POST_TXT="
				+ POST_TXT + ", POST_IMG=" + POST_IMG + ", POST_ORIGIN_IMG=" + POST_ORIGIN_IMG + ", POST_IMG_TXT="
				+ POST_IMG_TXT + ", POST_IMG_FILE=" + POST_IMG_FILE + ", STYLE_NO=" + STYLE_NO + ", STYLE_FONT1="
				+ STYLE_FONT1 + ", STYLE_SIZE1=" + STYLE_SIZE1 + ", STYLE_WEIGHT1=" + STYLE_WEIGHT1 + ", STYLE_SPACE1="
				+ STYLE_SPACE1 + ", STYLE_FONT2=" + STYLE_FONT2 + ", STYLE_SIZE2=" + STYLE_SIZE2 + ", STYLE_WEIGHT2="
				+ STYLE_WEIGHT2 + ", STYLE_SPACE2=" + STYLE_SPACE2 + "]";
	}
	
	

	

	



}

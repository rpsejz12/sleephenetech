package com.sleephenetech.app.mail.model;

import org.apache.ibatis.annotations.Mapper;

import com.sleephenetech.app.code.model.CodeVO;


@Mapper
public interface MailDAO {
	public int mailUpdate(CodeVO vo);

}
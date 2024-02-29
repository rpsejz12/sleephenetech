package com.sleephenetech.app.admin.model;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface AdminDAO {
	public int login(AdminVO vo);
}
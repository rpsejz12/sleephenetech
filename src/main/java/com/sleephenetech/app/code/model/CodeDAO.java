package com.sleephenetech.app.code.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface CodeDAO {
	public ArrayList<CodeVO> codes(CodeVO vo);
	public CodeVO menu(CodeVO vo);

}
package com.sleephenetech.app.comp.model;

import org.apache.ibatis.annotations.Mapper;

import com.sleephenetech.app.code.model.CodeVO;


@Mapper
public interface CompDAO {
	public int compUpdate(CodeVO vo);

}
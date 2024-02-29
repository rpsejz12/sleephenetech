package com.sleephenetech.app.style.model;

import org.apache.ibatis.annotations.Mapper;

import com.sleephenetech.app.post.model.PostVO;


@Mapper
public interface StyleDAO {
	public int styleInsert(PostVO vo);
	public int styleDelete(PostVO vo);
	public int styleUpdate(PostVO vo);
}
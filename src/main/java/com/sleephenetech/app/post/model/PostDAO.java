package com.sleephenetech.app.post.model;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface PostDAO {
	public int postno(PostVO vo);
	public ArrayList<PostVO> posts(PostVO vo);
	public PostVO post(PostVO vo);
	public int insert(PostVO vo);
	public int delete(PostVO vo);
	public int update(PostVO vo);

}
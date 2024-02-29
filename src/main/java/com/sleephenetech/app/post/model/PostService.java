package com.sleephenetech.app.post.model;

import java.util.ArrayList;

public interface PostService {
	
	
	public int postnoDB(PostVO vo);
	public ArrayList<PostVO> postsDB(PostVO vo);
	public PostVO postDB(PostVO vo);
	
	
	public boolean insertDB(PostVO postVO);
	public boolean deleteDB(PostVO postVO);
	public boolean updateDB(PostVO postVO);

}

package com.sleephenetech.app.post.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sleephenetech.app.style.model.StyleDAO;

@Service("postServiceImpl")
public class PostServiceImpl implements PostService{
	
	@Autowired
	private PostDAO PostDAO;
	
	
	@Autowired
	private StyleDAO StyleDAO;

	
	public int postnoDB(PostVO vo) {
		return PostDAO.postno(vo);
	}	
	
	public ArrayList<PostVO> postsDB(PostVO vo) {
		return PostDAO.posts(vo);
	}
	
	public PostVO postDB(PostVO vo) {
		return PostDAO.post(vo);
	}
	
	@Transactional
	public boolean insertDB(PostVO postvo) {
		
		if(PostDAO.insert(postvo)>0 && StyleDAO.styleInsert(postvo)>0) {
			return true;
		} else {
			return false;
		}
		
		
	}	
	
	@Transactional
	public boolean deleteDB(PostVO postvo) {
		if(PostDAO.delete(postvo)>0 && StyleDAO.styleDelete(postvo)>0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean updateDB(PostVO postvo) {
		if(PostDAO.update(postvo)>0 && StyleDAO.styleUpdate(postvo)>0) {
			return true;
		} else {
			return false;
		}
	}

}

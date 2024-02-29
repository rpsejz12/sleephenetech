package com.sleephenetech.app.admin.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("adminServiceImpl")
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO AdminDAO;

	public int loginDB(AdminVO vo) {
		return AdminDAO.login(vo);
	}	
}

package com.sleephenetech.app.comp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sleephenetech.app.code.model.CodeVO;

@Service("compServiceImpl")
public class CompServiceImpl implements CompService{
	
	@Autowired
	private CompDAO CompDAO;

	public boolean compUpdateDB(CodeVO vo) {
		return CompDAO.compUpdate(vo)>0;
	};

}

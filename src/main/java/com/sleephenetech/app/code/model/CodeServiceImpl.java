package com.sleephenetech.app.code.model;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("codeServiceImpl")
public class CodeServiceImpl implements CodeService{
	
	@Autowired
	private CodeDAO CodeDAO;

	public ArrayList<CodeVO> codesDB(CodeVO vo) {
		return CodeDAO.codes(vo);
	}
	public CodeVO menuDB(CodeVO vo) {
		return CodeDAO.menu(vo);
	}
	

}

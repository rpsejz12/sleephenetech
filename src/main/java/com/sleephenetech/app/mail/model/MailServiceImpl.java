package com.sleephenetech.app.mail.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sleephenetech.app.code.model.CodeVO;

@Service("mailServiceImpl")
public class MailServiceImpl implements MailService{
	
	@Autowired
	private MailDAO mailDAO;

	public boolean mailUpdateDB(CodeVO vo) {
		return mailDAO.mailUpdate(vo)>0;
	};

}

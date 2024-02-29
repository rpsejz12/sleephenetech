package com.sleephenetech.app.mail.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sleephenetech.app.code.model.CodeService;
import com.sleephenetech.app.code.model.CodeVO;
import com.sleephenetech.app.mail.model.MailService;
import com.sleephenetech.app.mail.model.MailVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("sessionID")
public class MailController {
	
	
	@Autowired
	private MailService mailServiceImpl;
	
	@Autowired
	private CodeService codeServiceImpl;
	
	
	
	@RequestMapping("/mailEdit.do")
	public String home(Model model, CodeVO codeVO) {
		
		//회사코드
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		
		codeVO.setCODE_TYPE("AAMAIL");
		model.addAttribute("datas", codeServiceImpl.codesDB(codeVO));
		return "mail/mailEdit";
	}
	
	
	@Transactional
	@RequestMapping("/mailSave.do")
	public String insert(HttpServletRequest request, HttpServletResponse response, MailVO mailVO, CodeVO codeVO) throws IllegalStateException, IOException {
		System.out.println("++++++++++++++++++"+ mailVO.toString());
		
		codeVO.setCODE_NO(mailVO.getMAIL_TITLE_NO());
		codeVO.setCODE_VALUE(mailVO.getMAIL_TITLE());
		mailServiceImpl.mailUpdateDB(codeVO);
		
		codeVO.setCODE_NO(mailVO.getMAIL_RECEIVE_NO());
		codeVO.setCODE_VALUE(mailVO.getMAIL_RECEIVE());
		mailServiceImpl.mailUpdateDB(codeVO);
		
		codeVO.setCODE_NO(mailVO.getMAIL_BODY_NO());
		codeVO.setCODE_VALUE(mailVO.getMAIL_BODY());
		mailServiceImpl.mailUpdateDB(codeVO);
		
		
		
		return "redirect:mailEdit.do";

	}
}
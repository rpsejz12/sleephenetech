package com.sleephenetech.app.comp.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sleephenetech.app.code.model.CodeService;
import com.sleephenetech.app.code.model.CodeVO;
import com.sleephenetech.app.comp.model.CompService;
import com.sleephenetech.app.comp.model.CompVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("sessionID")
public class CompController {
	
	
	@Autowired
	private CompService compServiceImpl;
	
	@Autowired
	private CodeService codeServiceImpl;
	
	
	
	@RequestMapping("/compEdit.do")
	public String home(Model model, CodeVO codeVO) {
		
		//회사코드
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		model.addAttribute("datas", codeServiceImpl.codesDB(codeVO));
		return "comp/compEdit";
	}
	
	
	@Transactional
	@RequestMapping("/compSave.do")
	public String insert(HttpServletRequest request, HttpServletResponse response, CompVO compVO, CodeVO codeVO) throws IllegalStateException, IOException {
		
		System.out.println("+++++++++++++++" + compVO.toString());
		codeVO.setCODE_NO(compVO.getCOMP_EMAIL_NO());
		codeVO.setCODE_VALUE(compVO.getCOMP_EMAIL());
		codeVO.setUSE_FLAG(compVO.getCOMP_EMAIL_FLAG());
		compServiceImpl.compUpdateDB(codeVO);
		
		codeVO.setCODE_NO(compVO.getCOMP_TEL_NO());
		codeVO.setCODE_VALUE(compVO.getCOMP_TEL());
		codeVO.setUSE_FLAG(compVO.getCOMP_TEL_FLAG());
		compServiceImpl.compUpdateDB(codeVO);
		
		codeVO.setCODE_NO(compVO.getCOMP_ADRS_NO());
		codeVO.setCODE_VALUE(compVO.getCOMP_ADRS());
		codeVO.setUSE_FLAG(compVO.getCOMP_ADRS_FLAG());
		compServiceImpl.compUpdateDB(codeVO);
		
		codeVO.setCODE_NO(compVO.getCOMP_INSTA_NO());
		codeVO.setCODE_VALUE(compVO.getCOMP_INSTA());
		codeVO.setUSE_FLAG(compVO.getCOMP_INSTA_FLAG());
		compServiceImpl.compUpdateDB(codeVO);
		
		codeVO.setCODE_NO(compVO.getCOMP_TWIT_NO());
		codeVO.setCODE_VALUE(compVO.getCOMP_TWIT());
		codeVO.setUSE_FLAG(compVO.getCOMP_TWIT_FLAG());
		compServiceImpl.compUpdateDB(codeVO);
		
		codeVO.setCODE_NO(compVO.getCOMP_ADRS_NO());
		codeVO.setCODE_VALUE(compVO.getCOMP_ADRS());
		codeVO.setUSE_FLAG(compVO.getCOMP_ADRS_FLAG());
		compServiceImpl.compUpdateDB(codeVO);
		
		codeVO.setCODE_NO(compVO.getCOMP_FACEB_NO());
		codeVO.setCODE_VALUE(compVO.getCOMP_FACEB());
		codeVO.setUSE_FLAG(compVO.getCOMP_FACEB_FLAG());
		compServiceImpl.compUpdateDB(codeVO);

		
		
		return "redirect:compEdit.do";

	}
}
package com.sleephenetech.app.admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.sleephenetech.app.admin.model.AdminService;
import com.sleephenetech.app.admin.model.AdminVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("sessionID")
public class AdminController {
	
	
	@Autowired
	private AdminService adminServiceImpl;
	
	@RequestMapping("/admin.do")
	public String admin(Model model, AdminVO vo) {
		return "admin/admin";
	}
	
	@RequestMapping("/login.do")
	public String login(HttpServletRequest request, HttpServletResponse response,Model model, AdminVO vo)throws IllegalStateException, IOException {
		PrintWriter out = response.getWriter();
		
		if(adminServiceImpl.loginDB(vo) > 0) {
			model.addAttribute("sessionID", "admin");
			return "redirect:home.do";
		} else {
			response.setContentType("text/html; charset=UTF-8");
			out.println("<script>alert('login fail');history.go(-1)</script>");
			return null;
		}
	}
	
	@RequestMapping("/logout.do")
	public String logout(SessionStatus sessionStatus)throws IllegalStateException, IOException {
		
		sessionStatus.setComplete();
		return "redirect:home.do";
	}
}
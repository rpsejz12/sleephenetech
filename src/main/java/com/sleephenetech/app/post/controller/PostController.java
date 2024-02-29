package com.sleephenetech.app.post.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import com.sleephenetech.app.code.model.CodeService;
import com.sleephenetech.app.code.model.CodeVO;
import com.sleephenetech.app.post.model.PostService;
import com.sleephenetech.app.post.model.PostVO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("sessionID")
public class PostController {
	
	
	@Autowired
	private PostService postServiceImpl;
	
	
	@Autowired
	private CodeService codeServiceImpl;
	
	
	@RequestMapping("/home.do")
	public String home(Model model, PostVO postVO, CodeVO codeVO) {
		
		
		
		String page = "HO";
		postVO.setPOST_TYPE(page);
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		
	
		
		model.addAttribute("page", page);
		model.addAttribute("datas", postServiceImpl.postsDB(postVO));
		return "home/home";
	}
	
	@RequestMapping("/edit.do")
	public String edit(Model model, PostVO postVO, CodeVO codeVO) {
		
		String path;
		
		if(postVO.getPOST_NO() != 0) {
			postVO = postServiceImpl.postDB(postVO);
		} else {
			postVO.setSTYLE_SIZE1(10);
			postVO.setSTYLE_SIZE2(10);
			postVO.setSTYLE_SPACE1(0);
			postVO.setSTYLE_SPACE2(0);
		}
		
		codeVO.setCODE_TYPE("AAMENU");
		codeVO.setCODE_VALUE(postVO.getPOST_TYPE());
		
		
		path = codeServiceImpl.menuDB(codeVO).getCODE_NAME().toLowerCase();
		path = path + "/" + path + "Edit";
		
		codeVO.setCODE_TYPE("AAFONT");
		model.addAttribute("font", codeServiceImpl.codesDB(codeVO));
		
		codeVO.setCODE_TYPE("AABOLD");
		model.addAttribute("bold", codeServiceImpl.codesDB(codeVO));
		
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		model.addAttribute("data", postVO);
		
		return path;
	}
	
	@RequestMapping("/about.do")
	public String about(Model model, PostVO postVO, CodeVO codeVO) {
	
		
		
		String page = "AB";
		postVO.setPOST_TYPE(page);
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		model.addAttribute("page", page);
		model.addAttribute("datas", postServiceImpl.postsDB(postVO));
		return "about/about";
	}
	
	@RequestMapping("/news.do")
	public String news(Model model, PostVO postVO, CodeVO codeVO) {
		String page = "NE";
		postVO.setPOST_TYPE(page);
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		model.addAttribute("page", page);
		model.addAttribute("datas", postServiceImpl.postsDB(postVO));
		return "news/news";
	}
	
	@RequestMapping("/tech.do")
	public String tech(Model model, PostVO postVO, CodeVO codeVO) {
		String page = "TE";
		postVO.setPOST_TYPE(page);
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		model.addAttribute("page", page);
		model.addAttribute("datas", postServiceImpl.postsDB(postVO));
		return "tech/tech";
	}
	
	@RequestMapping("/product.do")
	public String product(Model model, PostVO postVO, CodeVO codeVO) {
		String page = "PR";
		postVO.setPOST_TYPE(page);
		codeVO.setCODE_TYPE("AACOMP");
		model.addAttribute("foot", codeServiceImpl.codesDB(codeVO));
		
		
		codeVO.setCODE_TYPE("AAMAIL");
		model.addAttribute("mails", codeServiceImpl.codesDB(codeVO));
		
		model.addAttribute("page", page);
		model.addAttribute("datas", postServiceImpl.postsDB(postVO));
		return "product/product";
	}
	
	
	@RequestMapping("/save.do")
	public String insert(HttpServletRequest request, HttpServletResponse response, PostVO postVO, CodeVO codeVO) throws IllegalStateException, IOException {
		
		PrintWriter out = response.getWriter();
		String savedir = request.getSession().getServletContext().getRealPath("/uploadImg");
		String path;
		
		MultipartFile POST_IMG_FILE = postVO.getPOST_IMG_FILE();
		
		
		codeVO.setCODE_TYPE("AAMENU");
		codeVO.setCODE_VALUE(postVO.getPOST_TYPE());
		path = codeServiceImpl.menuDB(codeVO).getCODE_NAME().toLowerCase();
		path = "redirect:" + path + ".do";
		
		
		System.out.println("++++++++++++" + postVO.toString());
		
		if(postVO.getPOST_NO() == 0) {
			postVO.setPOST_NO(postServiceImpl.postnoDB(postVO));
			if(!POST_IMG_FILE.isEmpty()) {
				postVO.setPOST_IMG(UUID.randomUUID().toString().substring(0,7)+POST_IMG_FILE.getOriginalFilename());
				POST_IMG_FILE.transferTo(new File(savedir+"/"+postVO.getPOST_IMG()));
			}
	
			if(postServiceImpl.insertDB(postVO)) {
				return path;
			}
			else {
				File file = new File(savedir+"/"+postVO.getPOST_IMG());
				if(file.exists()) {
					file.delete();
				}
				response.setContentType("text/html; charset=UTF-8");
				out.println("<script>alert('save fail');history.go(-1)</script>");
				return null;
			}
		} else {
			if(!POST_IMG_FILE.isEmpty()) {
				postVO.setPOST_IMG(UUID.randomUUID().toString().substring(0,7)+POST_IMG_FILE.getOriginalFilename());
				POST_IMG_FILE.transferTo(new File(savedir+"/"+postVO.getPOST_IMG()));
				System.out.println("1");
			}

			if(postServiceImpl.updateDB(postVO)) {
				if(!POST_IMG_FILE.isEmpty()) {
					File file = new File(savedir+"/"+postVO.getPOST_ORIGN_IMG());
					if(file.exists()) {
						file.delete();
					}
					System.out.println("2");
				}
				return path;
			}else {
				File file = new File(savedir+"/"+postVO.getPOST_IMG());
				if(file.exists()) {
					file.delete();
				}
				response.setContentType("text/html; charset=UTF-8");      
				out.println("<script>alert('edit fail');history.go(-1)</script>"); // 사진 수정 실패 시 alert창
				return null;
			}
		}
	}
	
	
	
	@RequestMapping("/delete.do")
	public String delete(HttpServletRequest request, HttpServletResponse response, PostVO postVO, CodeVO codeVO) throws IOException {
		PrintWriter out = response.getWriter();
		String savedir = request.getSession().getServletContext().getRealPath("/uploadImg");
		String path;
		postVO = postServiceImpl.postDB(postVO);
		codeVO.setCODE_TYPE("AAMENU");
		codeVO.setCODE_VALUE(postVO.getPOST_TYPE());
		path = codeServiceImpl.menuDB(codeVO).getCODE_NAME().toLowerCase();
		path = "redirect:" + path + ".do";
		
		String POST_IMG = postVO.getPOST_IMG().replace("uploadImg/", "");
		try {
			postServiceImpl.deleteDB(postVO);
			File file = new File(savedir+"/"+POST_IMG);
			if(file.exists()) {
				file.delete();
			}
			return path;
		}catch(Exception e) {
			response.setContentType("text/html; charset=UTF-8");
			out.println("<script>alert('delete fail!');history.go(-1)</script>"); //게시물 삭제 실패 시 alert
			return null;
		}

	}
}
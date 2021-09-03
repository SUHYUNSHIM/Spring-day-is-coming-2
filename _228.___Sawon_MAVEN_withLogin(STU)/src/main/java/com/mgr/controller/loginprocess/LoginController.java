package com.mgr.controller.loginprocess;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mgr.login.service.LoginService;
import com.mgr.login.vo.TelLoginVO;

@Controller
public class LoginController {

	@Resource(name="LoginService")
	private LoginService loginService;
	
	@RequestMapping(value = "/start.do", method = RequestMethod.GET)
	public String start() {
		return "sawonLogin";
	}
	
	@RequestMapping(value = "/sawonJoinStart.do", method = RequestMethod.GET)
	public String sawonJoinStart() {
		return "sawonJoin";
	}
	
	@RequestMapping(value = "/sawonLoginViewStart.do", method = RequestMethod.GET)
	public String sawonLoginViewStart() {
		return "sawonLoginView";
	}
	
	@RequestMapping(value = "/memberInsert.do", method = RequestMethod.POST)
	public String memberInsert(TelLoginVO vo, HttpServletResponse res) throws Exception {
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		boolean flag = loginService.memberInsert(vo);
		if(flag==true) {
			out.println("<script>alert(\"회원가입 되었습니다.\")</script>");
		} else {
			out.println("<script>alert(\"실패.\")</script>");
		}
		out.flush();
		return "sawonLogin";
	}
	

	
	@RequestMapping(value = "/memberLogin.do", method = RequestMethod.POST)
	public String memberLogin(TelLoginVO vo, HttpSession session, HttpServletResponse res) throws Exception {
		TelLoginVO vo2 = loginService.memberlogin(vo);
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		if(vo2.getId()==null || vo2.getPw()==null) {
			out.println("<script>alert(\"아이디나 비밀번호가 틀렸습니다.\")</script>");
			out.flush();
			return "sawonLogin";
		} else {
			session.setAttribute("loginVO", vo2);
			out.println("<script>alert(\"로그인되었습니다.\")</script>");
		}
		out.flush();
		return "sawonLoginView";
	}
	
	@RequestMapping(value = "/memberLogout.do", method = RequestMethod.GET)
	public String memberLogout(HttpSession session, HttpServletResponse res) throws Exception {
		session.removeAttribute("loginVO");
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.println("<script>alert(\"로그아웃 되었습니다.\")</script>");
		out.flush();
		return "sawonLogin";
	}
	
	@RequestMapping(value = "/memberMypage.do", method = RequestMethod.GET)
	public String memberMypage(TelLoginVO vo, Model model) throws Exception {
		model.addAttribute("mMypage",loginService.memberMypage(vo));
		return "sawonMypage";
	}
	
	@RequestMapping(value = "/memberDelete.do", method = RequestMethod.GET)
	public String memberDelete(TelLoginVO vo, HttpSession session, HttpServletResponse res) throws Exception {
		session.removeAttribute("loginVO");
		boolean flag = loginService.memberDelete(vo);
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		if(flag==true) {
			out.println("<script>alert(\"탈퇴 되었습니다.\")</script>");
		} else {
			out.println("<script>alert(\"실패.\")</script>");
			out.flush();
			return "redirect:memberMypage.do";
		}
		out.flush();
		return "sawonLogin";
	}
	
	@RequestMapping(value = "/memberUpdate.do", method = RequestMethod.POST)
	public String memberUpdate(Model model, TelLoginVO vo, HttpSession session, HttpServletResponse res) throws Exception {
		boolean flag = loginService.memberUpdate(vo);
		model.addAttribute("mMypage",session.getAttribute("loginVO"));
		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out = res.getWriter();
		if(flag==true) {
			out.println("<script>alert(\"수정 되었습니다.\")</script>");
		} else {
			out.println("<script>alert(\"실패.\")</script>");
		}
		out.flush();
		return "sawonLoginView";
	}
	
}

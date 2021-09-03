package com.mgr.controller.loginprocess;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.login.service.LoginService;
import com.mgr.login.vo.LoginVO;


public class LoginController {


	@Resource(name="LoginService") 
  	private  LoginService loginService;	
         
   
/*	@RequestMapping("/getAllLogin.do")
	public String sawonGetAllTelinfo(LoginVO vo1, Model model1) 
			                    throws ClassNotFoundException, SQLException {
		
          model1.addAttribute("mAllTelinfo", loginService.getAllLogin(vo1));
          return "sawonGetAllTelinfo"; 
		
	}*/
	
		
	@RequestMapping("/getLogin.do") 
	public String sawonGetTelinfo(LoginVO vo1, Model model1) 
			                             throws ClassNotFoundException, SQLException {
      model1.addAttribute("mLogin",loginService.getLogin(vo1));
                         
		return "loginGetLogin";
	}          
	
		
	
	@RequestMapping("/insertLogin.do")
	public String sawonInsertTelinfo(LoginVO vo1) 
			                          throws ClassNotFoundException, SQLException {
		loginService.insertLogin(vo1);
		
		return "redirect:getAllLogin.do"; 
	}
	
	
	@RequestMapping("/updateLogin.do")
	public String sawonUpdateTelinfo(LoginVO vo1, Model model) //vo1.irum
			                                  throws ClassNotFoundException, SQLException {
		loginService.updateLogin(vo1); 
		
	return "redirect:getAllLogin.do"; 		
	
	}
	
	
	
	@RequestMapping("/deleteLogin.do")
	public String sawonDeleteTelinfo(LoginVO vo1) 
			                              throws ClassNotFoundException, SQLException {
		loginService.deleteLogin(vo1);
		
	return "redirect:getAllLogin.do";
	}

}

package com.suhyun.controller.sawonprocess;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.suhyun.sawon.service.TelInfoService;
import com.suhyun.sawon.vo.TelInfoVO;

@Controller //나 컨트롤러야. 
public class SawonController {
	
	//메소드는 @애노테이션+메소드
	//@Resouce는 type이 아닌 이름을 딱 정해서 스프링에 등록
	//@Autowired .. type으로 찾아서 처리

	@Resource(name="TelInfoService") //@Autowired -- > 객체를 전달받는다. 자동으로 getter, setter, 생성자가 필요없다.
	private TelInfoService telInfoService; 
	//TelInfoService는 dao 객체를 받는 것이고, 지금 컨트롤러는 service 객체를 받는다.
	
	 @RequestMapping("/getAllTelinfo.do") //request 관련하여 mapping된 controller가 바로 여기, SawonController이다. getAllTelinfo.do
     public String sawonGetAllTelinfo(TelInfoVO vo1, Model model1) throws ClassNotFoundException, SQLException {
		 model1.addAttribute("mAllTelinfo", telInfoService.getAllTelinfo(vo1));
		 return "sawonGetAllTelinfo";
	 }
	 @RequestMapping("/getTelinfo.do")
	 public String sawonGetTelinfo(TelInfoVO vo1, Model model1) throws ClassNotFoundException, SQLException{
		 model1.addAttribute("mTelinfo",telInfoService.getTelinfo(vo1));
		 return "sawonGetTelinfo";
	 }
	 
	 @RequestMapping("/updateTelinfo.do")
	 public String sawonUpdateTelinfo(TelInfoVO vo1, Model model) throws ClassNotFoundException, SQLException {
		 telInfoService.updateTelinfo(vo1);
		 return "redirect:getAllTelinfo.do";
	 }
	 
	 @RequestMapping("/deleteTelinfo.do")
	 public String sawonDeleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		 telInfoService.deleteTelinfo(vo1);
		 return "redirect:getAllTelinfo.do";
	 }
                                          
}

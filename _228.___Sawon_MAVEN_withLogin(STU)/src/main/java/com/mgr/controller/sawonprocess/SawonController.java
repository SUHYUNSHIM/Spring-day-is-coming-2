package com.mgr.controller.sawonprocess;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mgr.sawon.service.TelInfoService;
import com.mgr.sawon.vo.TelInfoVO;

@Controller //business logic. bean 객체 생성. 
public class SawonController { //controller는 메소드의 집합이다. 메소드는 @애노테이션 + 메서드

	//@Service("TelInfoService")
	@Resource(name="TelInfoService") //@Resource는 type이 아닌 이름을 딱 정해서 스프링에 등록. Autowired는 type으로 찾아서 처리한다.
	private TelInfoService telinfoService; //service는 dao 객체를 받는 것. 지금 controller는 service 객체가 넘어온다. getter, 생성자 사용x
	
	@RequestMapping(value = "/getAllTelinfo.do", method = RequestMethod.GET)
	public String sawonGetAllTelinfo(TelInfoVO vo1, Model model1) throws SQLException {
		model1.addAttribute("mAllTelinfo",telinfoService.getAllTelinfo(vo1));
		return "sawonGetAllTelinfo";//view경로
	}
	/////////////////////////////////
	@RequestMapping(value = "/sawonInsertTelinfo.do", method = RequestMethod.GET, produces="text/plain; charset=UTF-8")
	public String sawonInsertTelinfo() {
		return "sawonInsertTelinfo";
	}
	/////////////////////////////////////////// sawonInsertTelinfo.jsp 출력 부분에 있게 된다. 
	
	@RequestMapping(value = "/sawonLoginView.do", method = RequestMethod.GET, produces="text/plain; charset=UTF-8")
	public String sawonLoginView() {
		return "sawonLoginView";
	}
	
	@RequestMapping(value = "/getTelinfo.do", method = RequestMethod.GET, produces="text/plain; charset=UTF-8")
	public String sawonGetTelinfo(TelInfoVO vo1,Model model1) throws SQLException {
		
		model1.addAttribute("mTelinfo", telinfoService.getTelinfo(vo1));
		
		return "sawonGetTelinfo";
	}
	
	@RequestMapping(value = "/updateTelinfo.do", method = RequestMethod.POST, produces="text/plain; charset=UTF-8")
	public String sawonUpdate(TelInfoVO vo1) throws SQLException{
		telinfoService.updateTelinfo(vo1);
		return "redirect:getAllTelinfo.do";
	}
	
	@RequestMapping(value = "/deleteTelinfo.do", method = RequestMethod.GET, produces="text/plain; charset=UTF-8")
	public String sawonDelete(TelInfoVO vo1) throws SQLException{
		telinfoService.deleteTelinfo(vo1);
		return "redirect:getAllTelinfo.do";
	}
	
	@RequestMapping(value = "/insertTelinfo.do", method = RequestMethod.GET, produces="text/plain; charset=UTF-8")
	public String sawonInsert(TelInfoVO vo1) throws SQLException{
		telinfoService.insertTelinfo(vo1);
		return "redirect:getAllTelinfo.do";
	}
							
}

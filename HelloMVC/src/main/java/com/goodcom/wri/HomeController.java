package com.goodcom.wri;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller //나 컨트롤러야~
public class HomeController {
	
	//샘플로 자동으로 구성되어 있는 것. 
	/*private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	*//**
	 * Simply selects the home view to render by returning its name.
	 *//*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	
	//넘어오는 url과 mapping 담당
	@RequestMapping(value="/moya.do", method= RequestMethod.POST) //.do로 찾아온다.
	public String kaja(Model model, HttpServletRequest req) { //메소드 3형식 정의문만 존재하면 된다.
			//kaja는 임의의 이름.								//jsp 같으면 request현태로 객체 이름이 정해짐.
			//model 객체, HttpServletRequest를 인자로 준비. --> 받으려고 준비
			//model은 나중에 쓴다.
		
		//이름이 넘어올 떄 req.getParameter가 받아서 처리
		String irum = req.getParameter("irum"); //jsp: request.getParameter("irum"); 물론 request로 사용가능
		
		//controller는 business logic(계산), 출력은 view 담당
		model.addAttribute("mirum",irum);
		
		return "kaja"; //반환
	}
	
}

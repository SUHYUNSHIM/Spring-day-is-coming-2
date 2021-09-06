package com.empmanage.sawon;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.empmanage.sawon.service.SawonService;
import com.empmanage.sawon.vo.SawonVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//새로 입력
	@Resource(name="sawonService")
	private SawonService sawonService;
	
	@RequestMapping(value="/sawonAll.do")
	public String sawonAll(Model model) throws Exception {
		ArrayList <SawonVO> alist = sawonService.getAllSawon();
		model.addAttribute("alist",alist);
		return "sawonAll";
	}

	//사원 등록 즉, 사원 insert 시 전체보기에서 사원등록을 누르면 여기로 온다.
	@RequestMapping(value="/sawonInsertForm.do")
	public String sawonInsertForm(@ModelAttribute("sawonVO") SawonVO sawonVO, Model model) throws Exception{
		return "sawonInsertForm";
		//전체 보기로 여기 왔는데, 다시 sawonInsertForm.jsp로 간다.
		//입력과 출력을 다른 곳에서 하기 위해서. index.jsp와 다른 곳에 일부러 두었다.
	}
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
}

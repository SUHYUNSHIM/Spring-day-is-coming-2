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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	public String sawonAll(Model model) {
		ArrayList <SawonVO> alist = sawonService.getAllSawon();
		model.addAttribute("alist",alist);
		return "sawonAll";
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

package com.suhyun.hakjum;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	/*@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}*/
	@RequestMapping(value="/hakjum.do",method=RequestMethod.POST)
	public String total_report(Model model, @RequestParam(value="irum") String name,											
											@RequestParam(value="java_score") String java,
											@RequestParam(value="ui_score") String ui,
											@RequestParam(value="sql_score") String sql) {
		model.addAttribute("name",name);		
		//
		int java1 = Integer.parseInt(java);
		int ui1 = Integer.parseInt(ui);
		int sql1 = Integer.parseInt(sql);
		
		int total=0;
		total += java1 + ui1+ sql1;
		double avg= total /(3.0);
		model.addAttribute("total_sum",total);
		model.addAttribute("total_avg",avg);
		
		return "total";
	}
	/*
	 * @RequestMapping(value="/kyesan", method= RequestMethod.POST)
	 * public String kaja(Model model, HtppServletRequest req){
	 * 
	 * Strng irum = req.getParameter("irum");
	 * int javajum = Integer.parseInt(req.getParameter("javajum"));
	 * int uijum = Integer.parseInt(req.getParameter("uijum"));
	 * int sqljum = Integer.parseIng(req.getParameter("sqljum"));
	 * int tot = javajum + uijum+sqljum;
	 * int avg = tot/3;
	 * model.addAttribute("mirum",irum);
	 * model.addAttribute("mtot",tot);
	 * model.addAttribute("mavg",avg);
	 * return "kaja"; // kaja.jsp
	 * 
	 * */
	
}

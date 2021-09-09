package com.suhyun.grade;

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
@Controller
public class HomeController {
	
	@RequestMapping(value="/grade", method=RequestMethod.GET)
	public String grade_report(Model model, HttpServletRequest req) {
		String name = req.getParameter("name");
		int java = Integer.parseInt(req.getParameter("java"));
		int ui = Integer.parseInt(req.getParameter("ui"));
		int sql = Integer.parseInt(req.getParameter("sql"));
		
		int sum = 0;
		int avg;
		
		sum += java+ui+sql;
		avg = sum/3;
		
		model.addAttribute("name",name);
		model.addAttribute("total",sum);
		model.addAttribute("avg",avg);
		
		return "total";
	}
	
}

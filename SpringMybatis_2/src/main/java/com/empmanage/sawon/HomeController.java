package com.empmanage.sawon;

import java.sql.SQLException;
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
	//===============================
	@Resource(name = "sawonService") /////////////////
	private SawonService sawonService; ///////////////
    //===================================
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
	
	@RequestMapping(value = "/sawonAll.do")
	public String sawonAll(Model model) throws Exception  {

	    ArrayList <SawonVO> alist = sawonService.getAllSawon();

	    model.addAttribute("alist", alist);

	    return "sawonAll";
	}
	
	
	
	@RequestMapping(value = "/sawonInsertForm.do")
	public String sawonInsertForm(@ModelAttribute("sawonVO") SawonVO sawonVO,
			                                Model model) throws Exception {
     
	    return "sawonInsertForm"; 
	    
	}
	
	@RequestMapping(value = "/sawonInsert.do")
	public String sawonInsert(@ModelAttribute("sawonVO") SawonVO sawonVO,
			        Model model) {
		
		sawonService.insertSawon(sawonVO);
		
		return "redirect:/sawonAll.do";
	}
	
	
	
		@RequestMapping(value = "/getTelinfo.do") 
	public String sawonGetTelinfo(@ModelAttribute("sawonVO") SawonVO sawonVO,  Model model) {
	    	
		sawonService.getTelinfo(sawonVO); 
		
	
		return "sawonGetTelinfo";
	}
	
	@RequestMapping("/updateTelinfo.do")
	public String sawonUpdateTelinfo(SawonVO sawonVO, Model model) 
			                         throws ClassNotFoundException, SQLException {
		sawonService.updateTelinfo(sawonVO);//��ü���� 
		
		return "redirect:/sawonAll.do"; 
		   
	}
	
    //���� or  �������� ������ Ŭ���� ��� 
	@RequestMapping("/deleteTelinfo.do")
	public String sawonDeleteTelinfo(SawonVO sawonVO, Model model) 
			  throws ClassNotFoundException, SQLException {
		sawonService.deleteTelinfo(sawonVO);
		
		return "redirect:/sawonAll.do"; 
	}
}





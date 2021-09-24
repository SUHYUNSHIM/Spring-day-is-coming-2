package com.mgr.controller.sawonprocess;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mgr.sawon.service.TelInfoService;
import com.mgr.sawon.vo.TelInfoVO;

@Controller  
public class SawonController  {   
	
	
	@Resource(name="TelInfoService") 
  	private  TelInfoService telInfoService;	
         
   
	@RequestMapping("/getAllTelinfo.do")
	public String sawonGetAllTelinfo(TelInfoVO vo1, Model model1) throws ClassNotFoundException, SQLException {
		
          model1.addAttribute("mAllTelinfo", telInfoService.getAllTelinfo(vo1));
          return "sawonGetAllTelinfo"; 
		
	}
	
		
	@RequestMapping("/getTelinfo.do") 
	public String sawonGetTelinfo(TelInfoVO vo1, Model model1) 
			                             throws ClassNotFoundException, SQLException {
      model1.addAttribute("mTelinfo",telInfoService.getTelinfo(vo1));
                         
		return "sawonGetTelinfo";
	}          
	
		
	
	@RequestMapping("/insertTelinfo.do")
	public String sawonInsertTelinfo(TelInfoVO vo1) 
			                          throws ClassNotFoundException, SQLException {
		telInfoService.insertTelinfo(vo1);
		
		return "redirect:getAllTelinfo.do"; 
	}
	
	    
	@RequestMapping("/updateTelinfo.do")
	public String sawonUpdateTelinfo(TelInfoVO vo1, Model model) //vo1.irum
			                                  throws ClassNotFoundException, SQLException {
	telInfoService.updateTelinfo(vo1); 
		
	return "redirect:getAllTelinfo.do"; 		
	
	}
	
	
	
	@RequestMapping("/deleteTelinfo.do")
	public String sawonDeleteTelinfo(TelInfoVO vo1) 
			                              throws ClassNotFoundException, SQLException {
	telInfoService.deleteTelinfo(vo1);
		
	return "redirect:getAllTelinfo.do";
	}

	
}










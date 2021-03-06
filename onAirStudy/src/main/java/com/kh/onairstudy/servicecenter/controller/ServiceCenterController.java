package com.kh.onairstudy.servicecenter.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.onairstudy.common.PageMaker;
import com.kh.onairstudy.common.PagingCriteria;
import com.kh.onairstudy.member.model.vo.Member;
import com.kh.onairstudy.servicecenter.model.service.ServiceCenterService;
import com.kh.onairstudy.servicecenter.model.vo.ServiceCenter;
import com.kh.onairstudy.servicecenter.model.vo.ServiceContent;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j

public class ServiceCenterController {

	@Autowired
	private ServiceCenterService serviceCenterService;
	
	

	@RequestMapping("/servicecenter.do")
	public ModelAndView serviceList(PagingCriteria cri, ModelAndView mav, HttpSession session, HttpServletRequest request) {
		
		Member loginMember = (Member)session.getAttribute("loginUser");

		List<ServiceContent> serviceContentList = serviceCenterService.selectServiceContentList();
		
		if(loginMember==null) {
			mav. addObject("serviceContentList", serviceContentList);
			mav.setViewName("service/servicecenter");
			return mav;
		}
		

		log.debug("loginMember={}", loginMember);
		
		Map<String, Object> map = new HashMap<>();
		map.put("memberId", loginMember.getMemberId());
		map.put("cri", cri);
		
		log.debug("map={}", map);
		
		List<ServiceCenter> serviceList = serviceCenterService.selectServiceList(map);
		
		int totalCount = serviceCenterService.totalCount(map);
//		mav. addObject("serviceList", serviceList);
		
		
		request.setAttribute("serviceList", serviceList);
		mav. addObject("list", serviceList);
		mav. addObject("serviceContentList", serviceContentList);
		mav. addObject("paging", new PageMaker(cri, totalCount));
		
		if(loginMember != null) {
			mav. addObject("memberId", loginMember.getMemberId());
		} else {
			mav. addObject("memberId", null);
		}
		
		mav.setViewName("service/servicecenter");
		
		return mav;
	
	}
	
//??????????????? ??????
	 @RequestMapping(value = "list.do")    //???????????? url mapping
	    public ModelAndView list(//RequestParam?????? ??????, ?????????, ???????????? ???????????? ?????? ???????????????.
	            
	            //???????????? ???????????? ????????? ???????????? ?????????.
	            @RequestParam(defaultValue="memberId") String search_option,
	            @RequestParam(defaultValue="") String keyword,
	            @RequestParam(defaultValue="0") int category
	            )
	             throws Exception{
	        
	        //map??? ???????????? ???????????? ????????????, ???????????? ??????
	        List<ServiceCenter> list = serviceCenterService.listAll(search_option, keyword, category);
	        List<ServiceContent> serviceContentList = serviceCenterService.selectServiceContentList();
	        
	        ModelAndView mav = new ModelAndView();
	        Map<String,Object> map = new HashMap<>();    //?????? ???????????? ?????? ????????? ???????????? ????????? ?????? modelandview??? ?????? ?????? ???????????? ??????
	        
	        map.put("list", list);                         //map??? list(????????? ??????)??? list?????? ????????? ????????? ????????? ?????????.
	        map.put("search_option", search_option);
	        map.put("keyword", keyword);
	        mav.addObject("map", map);                    //modelandview??? map??? ??????	        
	        mav. addObject("serviceList", list);	        
	        mav. addObject("serviceContentList", serviceContentList);
	        mav.setViewName("service/servicecenter");    
	            
	        
	        return mav;   
	    }
	
	
	 
//????????????
	 @RequestMapping("/serviceDetail.do")
		public String serviceDetail(Model model,
									@RequestParam("no") int no) {
		
			Map<String, Object> map = serviceCenterService.serviceDetail(no);	
			model.addAttribute("map", map);
			
			return "service/serviceDetail";
		}

	
	 
	 //??????		
		@RequestMapping("/serviceUpdate.do")
		public String serviceUpdate(ServiceCenter service, RedirectAttributes redirectAttributes) {
			
			log.debug("serviceUpdate={}" ,  service);
			
			int result = serviceCenterService.serviceUpdate(service);
			
			redirectAttributes.addFlashAttribute("msg", result>0 ? "???????????? ?????????????????????." : "????????? ?????????????????????.");
			return "redirect:/servicecenter.do";
		}
	
		
	//??????		
		@RequestMapping("/serviceDelete.do")
		public String serviceDelete(@RequestParam("no") int no, RedirectAttributes redirectAttributes){
			int result = serviceCenterService.serviceDelete(no);
			
			redirectAttributes.addFlashAttribute("msg", result>0 ? "???????????? ?????????????????????." : "????????????");
			return "redirect:/servicecenter.do";
		}
	 
	 
	 
	 
	
//????????????
	@RequestMapping("/service/serviceForm.do")
	public String serviceForm() {
		
		
		return "service/serviceForm";
	}
	

	
	
//????????? ??????
	@RequestMapping(value = "/service/insertService.do",
		    method = RequestMethod.POST)
		public String insertService(ServiceCenter servicecenter, 
									RedirectAttributes redirectAttr,
									HttpSession session) {
		System.out.println("servicecenter = " + servicecenter);
		 log.info("service ????????????");
		 Member loginMember = (Member)session.getAttribute("loginMember");
		 servicecenter.setMemberId(loginMember.getMemberId());
		//????????????
		int result = serviceCenterService.insertService(servicecenter);
		String msg = (result > 0) ? "????????? ?????? ??????!" : "????????? ?????? ??????!";
		System.out.println("msg = " + msg);
		
		
		redirectAttr.addFlashAttribute("msg", msg);
		
		
		
		return "forward:/servicecenter.do";
		}
			
	
	
	

	
}

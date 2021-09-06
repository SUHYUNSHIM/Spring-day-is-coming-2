package com.empmanage.sawon.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empmanage.sawon.service.SawonService; //////
import com.empmanage.sawon.service.dao.SawonDAO;///////
import com.empmanage.sawon.vo.SawonVO;//////

@Service("sawonService")
public class SawonServiceImpl implements SawonService { //SawonServiceImpl.java

	@Autowired
	private SawonDAO sawonkaja;

	@Override
	@Transactional
	public ArrayList <SawonVO> getAllSawon() {
		return sawonkaja.getAllSawon(); 
	}

}

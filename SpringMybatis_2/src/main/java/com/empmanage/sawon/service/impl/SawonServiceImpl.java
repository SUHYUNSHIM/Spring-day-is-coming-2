package com.empmanage.sawon.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empmanage.sawon.service.SawonService;
import com.empmanage.sawon.service.dao.SawonDAO;
import com.empmanage.sawon.vo.SawonVO;


@Service("sawonService")
public class SawonServiceImpl implements SawonService {

	@Autowired
	private SawonDAO sawonkaja;  //new SawonDAO()°³³ä 

	@Override
	@Transactional
	public ArrayList <SawonVO> getAllSawon() {
		return sawonkaja.getAllSawon();
	}
	public void insertSawon(SawonVO sawonVO) {
		 sawonkaja.insertSawon(sawonVO);
	}
	public SawonVO getTelinfo(SawonVO sawonVO) {
		return sawonkaja.getTelinfo(sawonVO);
}
	public void updateTelinfo(SawonVO sawonVO) {
		 sawonkaja.updateTelinfo(sawonVO);
	}
	
	public void deleteTelinfo(SawonVO sawonVO) {
		 sawonkaja.deleteTelinfo(sawonVO);
	}
}


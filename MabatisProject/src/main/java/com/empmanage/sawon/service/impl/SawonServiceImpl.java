package com.empmanage.sawon.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.empmanage.sawon.service.SawonService;
import com.empmanage.sawon.service.dao.SawonDAO;
import com.empmanage.sawon.vo.SawonVO;
//service와 serviceimpl을 한 패키지에 넣었기 떄문에 따로 import할 필요 없음.

@Service("sawonService")
public class SawonServiceImpl implements SawonService{ //SawonServiceImpl.java
	@Autowired
	private SawonDAO sawonkaja;
	
	@Override
	@Transactional
	public ArrayList <SawonVO> getAllSawon(){
		return sawonkaja.getAllSawon();
	}			//dao를 찾아간다.

	@Override
	public void insertSawon(SawonVO sawonVO) {
		sawonkaja.insertSawon(sawonVO);		
	}

	@Override
	public SawonVO getTelinfo(SawonVO sawonVO) {
		return sawonkaja.getTelinfo(sawonVO);
	}

	@Override
	public void updateTelinfo(SawonVO sawonVO) {
		sawonkaja.updateTelinfo(sawonVO);		
	}

	@Override
	public void deleteTelinfo(SawonVO sawonVO) {
		sawonkaja.deleteTelinfo(sawonVO);		
	}
	
	//select * 이 있을 것이다.
	//전부 가져와서 종이상자 = resultSet에 넣고 이것을 객체 단위로 해서 넘겨줄 것이다.
}

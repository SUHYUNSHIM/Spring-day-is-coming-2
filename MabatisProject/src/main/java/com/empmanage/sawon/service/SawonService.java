package com.empmanage.sawon.service;

import java.util.ArrayList;

import com.empmanage.sawon.vo.SawonVO;

//controller 대신 하는 것, service
public interface SawonService {
	ArrayList <SawonVO> getAllSawon() throws Exception;
	void insertSawon(SawonVO sawonVO);
	SawonVO getTelinfo(SawonVO sawonVO);
	void updateTelinfo(SawonVO sawonVO);
	void deleteTelinfo(SawonVO sawonVO);
	
}

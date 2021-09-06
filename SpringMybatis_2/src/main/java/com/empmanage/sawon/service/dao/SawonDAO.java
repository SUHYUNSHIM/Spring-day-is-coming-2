package com.empmanage.sawon.service.dao;

import java.util.ArrayList;


import com.empmanage.sawon.vo.SawonVO;

//mapper interface 
public interface SawonDAO { 
	ArrayList <SawonVO> getAllSawon();
	
	void insertSawon(SawonVO sawonVO);

	SawonVO getTelinfo(SawonVO sawonVO);

	void updateTelinfo(SawonVO sawonVO);

	void deleteTelinfo(SawonVO sawonVO);
	
}

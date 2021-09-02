package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.sawon.dao.TelInfoDAO;
import com.mgr.sawon.vo.TelInfoVO;


/* Repository = bean객체가 생성 */
/* Service = bean객체가 생성됨 */
@Service("TelInfoService") 
public class TelInfoServiceImpl implements TelInfoService {

	/*
	 	jsp servlet에서 haeva() execute()
	 	즉, @controller나 dao의 내용을 service가 맡아
	 	business logic차원에서 확장성있는 작업을 하게함
	 	이때 인터페이스 형식은 확장성과 유연성을 갖게 함
	 */	
	/*
	  	@Autowired
	  	setter propery를 생략하게 만듬
	 */
	
	@Autowired
	private TelInfoDAO telInfoDAO;
	
	@Override
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		return telInfoDAO.getAllTelinfo(vo1);
	}

	@Override
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		return telInfoDAO.getTelinfo(vo1);
	}

	@Override
	public void updateTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		telInfoDAO.updateTelinfo(vo1);
	}

	@Override
	public void insertTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		telInfoDAO.insertTelinfo(vo1);
	}

	@Override
	public void deleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException {
		telInfoDAO.deleteTelinfo(vo1);
	}

}

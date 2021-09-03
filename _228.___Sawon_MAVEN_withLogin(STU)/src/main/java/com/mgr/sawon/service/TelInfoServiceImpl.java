package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.sawon.dao.TelInfoDAO;
import com.mgr.sawon.vo.TelInfoVO;


@Service("TelInfoService") 
public class TelInfoServiceImpl implements TelInfoService{
	
	

	@Autowired
	private TelInfoDAO telinfoDAO;
	
	@Override
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException {
		
		return telinfoDAO.getAllTelinfo(vo1);
	}

	@Override
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws SQLException {
		// TODO Auto-generated method stub
		return telinfoDAO.getTelinfo(vo1);
	}

	@Override
	public int updateTelinfo(TelInfoVO vo1) throws SQLException {
		int c = telinfoDAO.updateTelinfo(vo1);
		return c;
	}

	@Override
	public int insertTelinfo(TelInfoVO vo1) throws SQLException {
		int c = telinfoDAO.insertTelinfo(vo1);
		return c;
	}

	@Override
	public int deleteTelinfo(TelInfoVO vo1) throws SQLException {
		int c = telinfoDAO.deleteTelinfo(vo1);
		return c;
	}
	
}

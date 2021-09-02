package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mgr.sawon.dao.TelInfoDAO;
import com.mgr.sawon.vo.TelInfoVO;





   
@Service("TelInfoService")  
public class TelInfoServiceImpl implements TelInfoService {
	                 
	
 
	@Autowired      
	private TelInfoDAO telinfoDAO;  
	 
	  
	public ArrayList <TelInfoVO> getAllTelinfo(TelInfoVO vo1) //객체단위 인자 
			      throws ClassNotFoundException, SQLException{
		return telinfoDAO.getAllTelinfo(vo1);
	}
		
	public TelInfoVO getTelinfo(TelInfoVO vo1) 
			throws ClassNotFoundException, SQLException{
				return telinfoDAO.getTelinfo(vo1);
		
	}
	public void updateTelinfo(TelInfoVO vo1) 
			throws ClassNotFoundException, SQLException{
		telinfoDAO.updateTelinfo(vo1);
	}
	

	public void insertTelinfo(TelInfoVO vo1) 
			throws ClassNotFoundException, SQLException{
				telinfoDAO.insertTelinfo(vo1);
			}
	public void deleteTelinfo(TelInfoVO vo1) 
			throws ClassNotFoundException, SQLException{
				telinfoDAO.deleteTelinfo(vo1);
			}
}





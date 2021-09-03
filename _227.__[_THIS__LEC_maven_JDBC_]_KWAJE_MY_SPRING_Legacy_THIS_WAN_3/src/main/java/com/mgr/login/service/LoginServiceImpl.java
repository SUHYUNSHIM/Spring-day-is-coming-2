package com.mgr.login.service;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mgr.login.dao.LoginDAO;
import com.mgr.login.vo.LoginVO;
import com.mgr.sawon.service.TelInfoService;

@Service("LoginService")  
public class LoginServiceImpl implements LoginService{

	@Autowired      
	private LoginDAO LoginDAO;

	/*@Override
	public ArrayList<LoginVO> getAllLogin(LoginVO vo1) throws ClassNotFoundException, SQLException {
		
		return LoginDAO.getLogin(vo1);
	}*/

	@Override
	public LoginVO getLogin(LoginVO vo1) throws ClassNotFoundException, SQLException {
		
		return LoginDAO.getLogin(vo1);
	}

	@Override
	public void updateLogin(LoginVO vo1) throws ClassNotFoundException, SQLException {
		LoginDAO.updateLogin(vo1);		
	}

	@Override
	public void insertLogin(LoginVO vo1) throws ClassNotFoundException, SQLException {
		LoginDAO.insertLogin(vo1);
		
	}

	@Override
	public void deleteLogin(LoginVO vo1) throws ClassNotFoundException, SQLException {
		LoginDAO.deleteLogin(vo1);
		
	}  
	 
}

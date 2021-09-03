package com.mgr.login.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mgr.login.vo.LoginVO;
/*import com.mgr.sawon.vo.TelInfoVO;*/

public interface LoginService {


	/*public ArrayList <LoginVO> getAllLogin(LoginVO vo1) 
			               throws ClassNotFoundException, SQLException;
        */
	
	public LoginVO getLogin(LoginVO vo1) 
		                 	throws ClassNotFoundException, SQLException;
		
	public void updateLogin(LoginVO vo1) 
			                 throws ClassNotFoundException, SQLException;
	
	public void insertLogin(LoginVO vo1) 
			                 throws ClassNotFoundException, SQLException;
	
	public void deleteLogin(LoginVO vo1) 
			                 throws ClassNotFoundException, SQLException;
	
}

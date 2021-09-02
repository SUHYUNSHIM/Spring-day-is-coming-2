package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mgr.sawon.vo.TelInfoVO;

public interface TelInfoService {
	
	/* controller에서 처리할 내용을 service로 보내서 처리하고 다시 controller로 return하려고*/
	
	/* 인터페이스에서 메소드는 선언만 가능 구현은 상속받은곳에서 */
	/* 주의할점 : 필드단위가 아니라 객체단위로 처리하고 있음*/
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	
	public void updateTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	
	public void insertTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	
	public void deleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	
}

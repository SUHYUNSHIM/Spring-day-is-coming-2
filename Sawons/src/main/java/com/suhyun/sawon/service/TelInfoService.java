package com.suhyun.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.suhyun.sawon.vo.TelInfoVO;

public interface TelInfoService {
	
	//필드 단위가 아니라 객체 단위로.
	public ArrayList <TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException; //선언만
	
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException; //객체로 처리 
	public void updateTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException; 
	public void insertTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
	public void deleteTelinfo(TelInfoVO vo1) throws ClassNotFoundException, SQLException;
}

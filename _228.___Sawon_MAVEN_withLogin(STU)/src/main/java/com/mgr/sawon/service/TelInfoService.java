package com.mgr.sawon.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.mgr.sawon.vo.TelInfoVO;

public interface TelInfoService {
	
	public ArrayList<TelInfoVO> getAllTelinfo(TelInfoVO vo1) throws SQLException;
	
	public TelInfoVO getTelinfo(TelInfoVO vo1) throws SQLException;
	
	public int updateTelinfo(TelInfoVO vo1) throws SQLException;
	
	public int insertTelinfo(TelInfoVO vo1) throws SQLException;
	
	public int deleteTelinfo(TelInfoVO vo1) throws SQLException;
}
